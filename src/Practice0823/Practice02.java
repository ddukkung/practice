package Practice0823;

import java.util.regex.Pattern;

public class Practice02 {

	public static void main(String[] args) {

		/*
		 *  패스워드 복잡도(유효성) 검사
		 *  
		 *  < 패스워드 작성 규칙 >
		 *  1. 영문자, 숫자, 특수문자(!@#$%)만을 사용하여 8 ~ 16자리 내로 작성
		 *     -> 패스워드 길이 규칙을 위반하여 "사용 불가능한 패스워드"
		 *   
		 */
		
		String[] passwordArr = {
				"admin123!", "Admin123!", "admin123", "adminroot", 
				"admin123패스워드", "1234", "aaaaaaaaaaaaaaaaa"
		};
		
		String regex = "^[A-Za-z0-9!@#$%]{8,16}$";
		
		for (int i = 0; i < passwordArr.length; i++) {
			
			boolean result = Pattern.matches(regex, passwordArr[i]);
			
			if(result) {
				System.out.println(passwordArr[i] + " : 사용 가능한 패스워드");
			} else {
				System.out.println(passwordArr[i] + " : 사용 불가능한 패스워드");
			}
			
		}
		
		System.out.println("=================================================");
		
		/*
		 *  식별자 작성 규칙에 대한 정규 표현식 판별
		 *  1. 첫글자 숫자 사용 불가(영문자 또는 한글, 특수문자($, _)만 사용 가능
		 *  2. 특수문자 $, _만 사용 가능
		 *  3. 대소문자, 숫자 조합 가능, 한글(가-힣) 사용가능
		 *  4. 공백문자 사용 불가
		 *  5. 길이 제한 없음(1글자 이상)
		 */
		
		String[] variableNames = {
				"num", "myName", "7eleven", "channel#5", "$ystem",
				"my name", "자바", "a"
		};
		
		String regex2 = "^[A-Za-z가-힣$_][A-Za-z가-힣$_0-9]*$";
		
		for (int i = 0; i < variableNames.length; i++) {
			boolean result2 = Pattern.matches(regex2, variableNames[i]);
			System.out.println(variableNames[i] + "는 사용 가능한 식별자인가? : " + result2);
		}
		
		
		
	}

}
