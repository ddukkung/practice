
public class Practice0612 {

	public static void main(String[] args) {
		
		/*
		 *  for문을 이용하여 알파벳의 대문자를 모두 출력하는 코드
		 *  
		 *  출력결과
		 *  A B C D E F G ... X Y Z
		 */
		
		for(char ch = 65; ch <= 90; ch++) {
			System.out.print(ch +" ");
		}
		
		// for문을 사용하여 i가 1 ~ 10까지 1씩 증가 반복
		// => i값이 짝수일 때 "i = X : 짝수" 출력
		//    i값이 홀수일 때 "i = X : 홀수" 출력
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 ==0) {
				System.out.println("i = " + i + " : 짝수");
			}else {
				System.out.println("i = " + i + " : 홀수");
			}
		}
		
		/*
		 * 1 ~ 10까지의 합 계산
		 * -> 1 + 2 + 3 + ... + 9 + 10 = 55
		 * -> 1 ~ 10까지 1씩 증가하면서 반복하는 반복문 필요
		 * -> 1 ~ 10까지 1씩 증가하는 숫자를 반복해서 누적할 누적 변수 필요
		 */
		
		int total = 0;
		
		for(int i = 1; i <= 10; i++) {
			total += i;
		}
		
		System.out.println("1 ~ 10까지의 합 : " + total);
		
		
		/*
		 *  for문을 사용해서 구구단 출력
		 *  - 단을 저장할 정수형 변수 dan 을 선언해서 초기화
		 *  
		 *  < 출력 예시 >
		 *  < 2 단 >
		 *  2 * 1 = 2
		 *  2 * 2 = 4
		 *  2 * 3 = 6
		 *  	...
		 *  2 * 9 = 18
		 */
		
		int dan = 2;
		
		System.out.println("< "+ dan + "단 >");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		
		// 1 ~ 100까지 1씩 증가하면서 합계를 sum에 누적 후 출력
		// 출력 결과
		// 1 ~ 100까지의 합 : 5050
		
		int sum = 0;
		
		for(int i = 1; i <101; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		sum = 0;
		
		/*
		 * for문을 이용해서 1 ~ 100까지의 정수 중에서 3의 배수의 값만 더하는 코드
		 * 
		 * 출력결과
		 * 
		 * 3의 배수의 합 : 1683
		 */
		
		for(int i = 1; i < 101; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		
		System.out.println("3의 배수의 합 : " + sum);
		
		/*
		 * 1 ~ 10까지 1씩 증가하면서 홀수의 합을 oddTotal 에 누적하고,
		 * 짝수의 합은 evenTotal에 누적 후 출력
		 */
		
		int oddTotal = 0, evenTotal = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				oddTotal += i;
			} else {
				evenTotal += i;
			}
		}
		
		System.out.println("홀수 : " + oddTotal);
		System.out.println("짝수 : " + evenTotal);
		
		// 중첩 for문을 활용하여 시계의 분침, 초침 구현
		// 분침(0 ~ 59분) / 시침(0 ~ 59)
		// 출력결과
		// 0 분 0 초
		// 0 분 1 초
		// ....
		// 59 분 59 초
		
		for(int min = 0; min < 60; min++) {
			
			for(int sec = 0; sec < 60; sec++) {
				System.out.println(min + "분 " + sec + "초");
			}
		}
		
		/*
		 * 100m 운동장을 10바퀴 돌도록 중첩 for문을 사용하여 구현
		 * 출력결과
		 * 0바퀴 - 1m
		 * 0바퀴 - 2m
		 * ....
		 * 0바퀴 - 99m
		 * 1바퀴 - 0m
		 * 1바퀴 - 1m
		 * ....
		 * 9바퀴 - 99m
		 * 
		 * 총 이동 거리 : XXXm
		 */
		
		int total2 = 0;
		
		for(int track = 0; track < 10; track++) {
			
			for(int step = 1; step < 100; step++) {
				
				total2++;
				System.out.println(track + "바퀴 - " + step + "m");
			}
		}
		
		System.out.println("총 이동 거리 : " + total2 + "m");

	}

}
