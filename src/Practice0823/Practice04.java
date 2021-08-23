package Practice0823;

import java.util.regex.Pattern;

public class Practice04 {

	public static void main(String[] args) {

		/*
		 *  패스워드 복잡도(유효성) 검사
		 *  
		 *  < 패스워드 작성 규칙 >
		 *  1. 영문자, 숫자, 특수문자(!@#$%)만을 사용하여 8 ~ 16자리 내로 작성
		 *     -> 패스워드 길이 규칙을 위반하여 "사용 불가능한 패스워드"
		 *  2. 영문 대문자, 소문자, 숫자, 특수문자(!@#$%) 중 
		 *     4가지를 조합하면 "안전도 : 우수"
		 *     3가지를 조합하면 "안전도 : 보통"
		 *     2가지를 조합하면 "안전도 : 위험"
		 *     1가지만 조합하면 "사용 불가능한 패스워드" 
		 *   
		 */
		
		// 유효성 체크를 위한 패스워드 목록 생성
		String[] passwordArr = {
				"admin123!", "Admin123!", "admin123", "adminroot", 
				"admin123패스워드", "1234", "aaaaaaaaaaaaaaaaa"
		};
		
		String regex = "^[A-Za-z0-9!@#$%]{8,16}$";
		
		// 각 규칙에 따른 복잡도 검사를 위한 정규표현식 작성
		String engUpperRegex = "[A-Z]";
		String engLowerRegex = "[a-z]";
		String numberRegex = "[0-9]";
		String specRegex = "[!@#$%]";
		
		for (int i = 0; i < passwordArr.length; i++) {
			
			boolean result = Pattern.matches(regex, passwordArr[i]);
			
			if(result) {
				
				int count = 0;
				
				count += Pattern.compile(engUpperRegex).matcher(passwordArr[i]).find() ? 1 : 0;
				count += Pattern.compile(engLowerRegex).matcher(passwordArr[i]).find() ? 1 : 0;
				count += Pattern.compile(numberRegex).matcher(passwordArr[i]).find() ? 1 : 0;
				count += Pattern.compile(specRegex).matcher(passwordArr[i]).find() ? 1 : 0;
				
				switch (count) {
				case 4 : System.out.println(passwordArr[i] + " : 안전도 우수"); break;
				case 3 : System.out.println(passwordArr[i] + " : 안전도 보통"); break;
				case 2 : System.out.println(passwordArr[i] + " : 안전도 위험"); break;
				
				default : System.out.println(passwordArr[i] + " : 사용 불가능한 패스워드");
				}
			}  else {
				System.out.println(passwordArr[i] + " : 사용 불가능한 패스워드");
				// 필요없는 코드인가 했는데 이미 1차로 if(result)에서 길이나 사용 불가능 문자가 포함된 비밀번호는
				// 걸러지기 때문에 출력이 안 된다. 그래서 그거까지 다 출력하려면 else문이 필요함.
			}
			
		}
	}

}
