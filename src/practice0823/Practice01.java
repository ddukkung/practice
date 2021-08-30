package practice0823;

import java.util.regex.Pattern;

public class Practice01 {

	public static void main(String[] args) {

		/*
		 *  java.util.regex 패키지의 클래스를 활용하여 정규표현식 활용
		 *  - Pattern 클래스
		 */
		
		/*
		 *  1. 전화번호(휴대폰) 형식 검증
		 *     ex) 010-1234-5678
		 *     1) 010/1/6/7/8/9로 시작
		 *     2) - 기호 또는 공백이 포함
		 *     3) 숫자 세자리 또는 네자리
		 *     4) 숫자 4자리로 끝
		 *     
		 */
		
		String regex = "^01(0|1|[6-9])[-\\s]?\\d{3,4}[-\\s]?\\d{4}$";
		
		String phone = "010-1234-5678";
		
		// Pattern 클래스의 static 메서드인 matches() 메서드를 호출하여 검사 수행
		// 파라미터로 정규표현식 문자열과 검사할 문자열 전달 -> 리턴타입 : boolean
		boolean result = Pattern.matches(regex, phone);
		System.out.println(phone + " 번호는 유효한 전화번호인가? : " + result);
		
		System.out.println("-------------------------------------------------");
		
		// 여러 개의 전화번호를 배열에 저장해 배열 내의 모든 전화번호에 대해 유효성 검사
		// String  배열 phoneNumbers[] 생성하여 전화번호 6개 저장
		// 반복문을 사용하여 배열 내의 모든 전화번호 검사 후 결과 출력
		
		String[] phoneNumbers = {
				"010-1234-5678", "010-1234-56789", "010-1234 5678", "01012345678",
				"010-1234-567a", "010) 1234-5678"
		};
		
		// 반복문을 사용하여 배열 내의 모든 전화번호 검사 후 결과 출력
		for (int i = 0; i < phoneNumbers.length; i++) {
			boolean result2 = Pattern.matches(regex, phoneNumbers[i]);
			System.out.println(phoneNumbers[i] + " 번호는 유효한 전화번호인가? : " + result2);
		}
		
		System.out.println("-------------------------------------------------");
		
		// 향상된 for문을 사용할 경우
		for (String phone2 : phoneNumbers) {
			boolean result3 = Pattern.matches(regex, phone2);
			System.out.println(phone2 + " 번호는 유효한 전화번호인가? : " + result3);
					
		}
		
		
		
		
		
	}

}
