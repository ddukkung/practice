
public class Practice0620 {

	public static void main(String[] args) {
		
		
		// 1) int형 배열 5개를 생성하면서 1, 2, 3, 4, 5로 초기화
		int[] nums = {1, 2, 3, 4, 5};
		
		// 학생 3명의 이름을 배열로 갖는 names 배열 생성
		// -> '홍길동', '이순신', '강감찬'으로 초기화
//		String[] names = {"홍길동", "이순신", "강감찬"};
		
		// 반복문을 사용하여 배열 내의 데이터 접근
		// 1) names 배열의 모든 이름 출력
//		for(int i = 0; i < 3; i++) {
//			System.out.println(names[i]);
//		}
		
		System.out.println("---------------------------");
		
		// 2) nums 배열의 모든 정수 출력
		for(int i = 0; i < 5; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("---------------------------");
		
		// 반복문을 사용할 때 배열 내의 모든 데이터에 접근할 때 조건식에 배열 크기를 직접 지정하지 않고 
		// 배열명.length 속성을 사용하여 동적으로 변경될 수 있도록 지정
				
		// 1) names 배열의 모든 이름 출력
//		for(int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
		
		System.out.println("---------------------------");
		
		// 2) nums 배열의 모든 정수 출력
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("---------------------------");
		
		/*
		 * 5명의 학생 점수를 저장하는 배열 생성 후
		 * 해당 점수의 총점과 평균을 계산 후 출력
		 * 
		 * 5명의 학생 점수 : 100, 80, 77, 90, 60
		 * 
		 * 출력결과
		 * 
		 * 총점 : 407 점
		 * 평균 : 81.4 점
		 */
		
		int[] scores = {100, 80, 77, 90, 60};
		int sum = 0;
		
		// 학생 5명의 이름(홍길동, 이순신, 강감찬, 정우성, 조인성)을
		// 배열 names에 저장 후 이름 : 점수 함께 출력
		
		String[] names = {"홍길동", "이순신", "강감찬", "정우성", "조인성"};
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
			System.out.println(names[i] + " : " + scores[i]);
		}
		
		System.out.println("총점 : " + sum + " 점");
		
		double avg = (double)sum / scores.length;
		
		System.out.println("평균 : " + avg + " 점");
		
		System.out.println("---------------------------");
		
		/*
		 * money 변수에 저장되어 있는 금액을 동전으로 교환하는 코드
		 * 큰 금액의 동전을 우선적으로 교환
		 * 
		 * 출력결과
		 * 
		 * 현재 금액 : 2680(money) 원
		 * 500 원 : 5 개
		 * 100원 : 1 개
		 * 50원 : 1 개
		 * 10원 : 3 개
		 * 
		 */
		
		int money = 2680;
		int[] coinUnit = {500, 100, 50, 10};
		
		System.out.println("현재 금액 : " + money + " 원");
		
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + " 원 : " + (money / coinUnit[i]) + " 개");
			money -= (money / coinUnit[i]) * coinUnit[i];
			
		}
		
		System.out.println("---------------------------");
		
		// 2차원 int형 배열 변수 score 선언
//		int[][] score;
		
		// 2차원 배열 5행 3열 크기를 갖는 int형 배열 생성
//		score = new int[5][3];
		
		// 선언 및 생성과 동시에 초기화하기
		
		/*
		 * 다음과 같은 데이터로 초기화
		 * ---------------------
		 * 국어		영어		수학
		 * 80		80		80
		 * 90		90		90
		 * 100		80		60
		 * 100		100		100
		 * 77		80		90
		 * 
		 */
		
		int[][] score = {
							{80, 80, 80},
							{90, 90, 90},
							{100, 80, 60},
							{100, 100, 100},
							{77, 80, 90}
		};
		
		/*
		 * 중첩 for문을 사용하여 score의 값 출력하기
		 * 
		 * 출력 결과
		 * 
		 * 1번 학생 : 80 80 80
		 * 2번 학생 : x x x
		 * 3번 학생 : x x x
		 * 4번 학생 : x x x
		 * 5번 학생 : x x x
		 */
		
		for(int i = 0; i < score.length; i++) {
			
			System.out.print((i + 1) + "번 학생 : ");
			
			for(int j = 0; j < score[j].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			
			System.out.println();
		}
		

	}

}
