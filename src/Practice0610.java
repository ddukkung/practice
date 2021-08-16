
public class Practice0610 {

	public static void main(String[] args) {
		
		// if ~ else if ~ else문 연습
		
		// 정수형 변수 num이 양수, 음수, 0인지 판별하여 출력
		// num이 5일 경우에
		// 출력 결과 
		// 양수
		
		int num = 4;
		
		if(num > 0) {
			
			System.out.println(num + " : 양수");
			
		} else if (num < 0) {
			
			System.out.println(num + " : 음수");
			
		} else {
			
			System.out.println(num + " : 0");
			
		}
		
		
		// num이 홀수, 짝수, 0인지 판별하여 출력
		
		num = 0;
		
		if (num % 2 == 1) {
			
			System.out.println(num + " : 홀수");
			
		} else if (num == 0) {
			
			System.out.println(num + " : 0");
			
		} else {
			
			System.out.println(num + " : 짝수");
		}
		
		// 문자 ch가 대문자('A' ~ 'Z')일 경우 "X : 대문자" 출력
		// 문자 ch가 소문자('a' ~ 'z')일 경우 "X : 소문자" 출력
		// 숫자('0' ~ '9')일 경우 "X : 숫자" 출력
		// 모두 아닐 경우 "X : 기타문자" 출력
		
		char ch = '1';
		
		if (ch >= 'A' && ch <= 'Z') {
			
			System.out.println(ch + " : 대문자");
			
		} else if (ch >= 'a' && ch <= 'z') {
			
			System.out.println(ch + " : 소문자");
			
		} else if (ch >= '0' && ch <= '9') {
			
			System.out.println(ch + " : 숫자");
			
		} else {
			 
			System.out.println(ch + " : 기타문자");
		}
		
		/*
		 *  12세 관람가 영화를 관람할 수 있는지 판별하는 코드
		 *  12세 미만이지만 보호자가 있으면 관람 가능하도록 출력
		 *  
		 *  출력결과
		 *  
		 *  age = 13일 때
		 *  나이 13세 : 관람가능
		 *  
		 *  age = 10이고 보호자가 있을 경우
		 *  나이 10세 : 나이는 적지만 보호자가 있어서 관람가능
		 *  
		 *  age = 10이고 보호자가 없을 경우
		 *  나이 10세 : 나이가 적고 보호자가 없어서 관람불가
		 *  
		 */
		
		int age = 10;
		boolean withParent = false;
		String result = "";
		
		if(age >= 12) {
			
			result = "관람가능";
			
		} else if (withParent) {
			
			result = "나이는 적지만 보호자가 있어서 관람가능";
			
		} else {
			
			result = "나이가 적고 보호자가 없어서 관람불가";
			
		}
		
		System.out.println("나이 " + age + " : " + result);
		
		
		// switch ~ case 문 연습
		
		/*
		 *  등급에 따라 출력
		 *  'a' 또는 'A' -> "우수 회원입니다."
		 *  'b' 또는 'B' -> "일반 회원입니다."
		 *  아니면 -> "손님입니다."
		 * 
		 */
		
		char grade = 'c';
		
		switch(grade) {
		
			case 'a' :
			case 'A' :
				System.out.println("우수 회원입니다.");
				break;
				
			case 'b' :
			case 'B' :
				System.out.println("일반 회원입니다.");
				break;
				
			default :
				System.out.println("손님입니다.");
				
		}
		
		/*
		 *  짝수 홀수 판별
		 *  num 값이 짝수이면 "XX : 짝수" 출력
		 *  num 값이 홀수이면 "XX : 홀수" 출력
		 * 
		 */
		
		int num2 = 4;
		
		switch(num2 % 2) {
		
			case 1 :
				System.out.println(num2 + " : 홀수");
				break;
				
			default :
				System.out.println(num2 + " : 짝수");
		}
		
		
		/*
		 *  학생 점수(score)에 대한 학점(grade) 판별
		 *  A학점 : 90 ~ 100점 -> 90점대 또는 100점
		 *  B학점 : 80 ~ 89점  -> 80점대
		 *  C학점 : 70 ~ 79점  -> 70점대
		 *  D학점 : 60 ~ 69점  -> 60점대
		 *  F학점 : 0  ~ 59점  -> 나머지
		 *  
		 */
		
		int score = 100;
		
		switch(score / 10) {
		
			case 10 :
			case 9  :
				System.out.println(score + " : A학점");
				break;
			
			case 8 :
				System.out.println(score + " : B학점");
				break;
			
			case 7 :
				System.out.println(score + " : C학점");
				break;
				
			case 6 :
				System.out.println(score + " : D학점");
				break;
				
			default :
				System.out.println(score + " : F학점");
				
		}
		
		/*
		 *  해당 월이 며칠까지 있는지 switch 문을 통해서 출력
		 *  days라는 변수에 일수를 저장하여 
		 *  
		 *  출력결과
		 *  
		 *  10월은 31일까지 있습니다.
		 *  
		 */

		
		// 1 3 5 7 8 10 12 -> default
		// 2 = 28
		// 30일 4 6 9 11
		
		int month = 2;
		int days = 0;
		
		switch(month) {
		
			case 2 :
				days = 28;
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
				
			default :
				days = 31;
		}
		
		System.out.println(month + "월은 " + days + "일까지 있습니다.");

	}

}
