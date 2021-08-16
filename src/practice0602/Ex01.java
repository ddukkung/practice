package practice0602;

public class Ex01 {

	public static void main(String[] args) {
		
		
		/*
		 *  오늘은... 삼항연산자랑 조건문 if를 배웠다
		 *  삼항연산자랑 if는 비슷하다... 논리연산자도 했네,,, 일단 삼항연산자
		 *  
		 *  삼항연산자 문법
		 *  조건식 ? 값1(true일 때 리턴) : 값2(false일 때 리턴);
		 *  식을 중첩해서 사용할 수도 있다
		 *  조건식1 ? 값1 : 조건식2 ? 값1 : 값2;
		 *  
		 */
		
		// num의 값이 짝수면 "짝수" 출력, 홀수면 "홀수" 출력, 0일 경우엔 0 출력
		
		int num = 2;
		String result;
		
		result = num == 0 ? "0" : num % 2 == 1 ? "홀수" : "짝수";
		
		System.out.println(result);
		
		// num이 10보다 크면 정수형 변수 result2의 값에 1을 더하고
		// 아니면, 정수형 변수 result2의 값에 10을 더하기
		
		int result2 = 2;
		
		result2 += num > 10 ? 1 : 10;
		
		System.out.println(result2);
		
		// 문자 ch가 영문자인지 판별
		// 영문자란 대문자 또는 소문자
		// 영문자이면 "영문자 입니다" 아니면 "영문자가 아닙니다" 출력
		
		char ch = 96;
		String result3;
		
		result3 = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ? "영문자입니다" : "영문자가 아닙니다";
		
		System.out.println(result3);
		
		// 사과를 담는 데 필요한 바구니의 수 구하기
		int numOfApples = 131; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		
		int numOfBucket;
		
		numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket == 0 ? 0 : + 1);
		System.out.println(numOfBucket);
		
		
		
		/*
		 *  논리연산자
		 *  
		 *  논리연산자는... 값을 비교해서 true or false를 리턴하는 연산자
		 *  &&은 and, ||는 or, ^는 값이 다를 경우에만 true 값이 나옴
		 *  !가 반전시키는 거~~~!
		 *  
		 * 
		 */
		
		boolean a = true, b = false;
		
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(a ^ b);
		System.out.println(!a);
		
		// 이걸 boolean 변수에 저장할 수도 있다!
		
		boolean b2 = a || b;
		System.out.println(b2);
		
		num = 9;
		boolean b3 = num > 5;
		System.out.println(b3);
		
		// 정수 num이 5보다 크고, 정수 num이 10보다 작거나 같은가?
		b3 = num > 5 && num <= 10;
		System.out.println(b3);
		
		// 정수 num이 5보다 작거나, 또는 num이 10보다 큰가?
		b3 = num < 5 || num > 10;
		System.out.println(b3);
		
		
		/*
		 * if문
		 * 
		 * if(조건식) {
		 *  조건이 true일 경우 출력되는 식
		 *  }
		 *  
		 */
		
		// 문자 ch가 소문자일 떼, 대문자로 변환하여 출력
		// 대문자일 경우에는 그대로 출력
		
		char ch2 = 'h';
		
		if (ch2 >= 'a' && ch2 <= 'z') {
			
			ch2 -= 32;
			
		}
		
		System.out.println(ch2);
		
		
		// 정수형 변수 num이 음수일 때 양수로 변환하여 num의 값을 출력
		// -> 양수일 때는 변환없이 그대로 출력 
		
		num = -2;
		
		if(num < 0) {
			
			num = -num;
			
		}
		
		System.out.println(num);

		
		
		
		
		

	}

}
