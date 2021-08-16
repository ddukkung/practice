
public class Practice0617 {

	public static void main(String[] args) {
		
		/*
		 *  1 부터 1씩 증가하는 값을 차례대로 누적하여 누적 합계가 1000보다 클 때 i 값 출력
		 */
		
		int i = 1, sum = 0;
		
		while(sum <= 1000) {
			sum += i;
			i++;
		}
		
		System.out.println(i - 1);
		
		System.out.println("-------------------------------------------");
		
		i = 1;
		sum = 0;
		
		// 무한 반복을 진행하면서, break문을 사용하여 동일하게 구현
		
		while(true) {
			sum += i;
			
			if(sum > 1000) {
				break;
			}
			
			i++;
		}
		
		System.out.println(i);
		
		System.out.println("-------------------------------------------");
		
		/*
		 * for문을 통해서 1 ~ 10까지 출력
		 * continue문을 사용하여 홀수만 출력
		 * 
		 */
		
		for(i = 1; i <= 10; i++) {
			
			if(i % 2 == 0) {
				continue;
			}
			
			System.out.println("i = " + i);
			
		}
		
		OUTER :
		for(int dan = 2; dan <= 9; dan++) {
			
			INNER :
			for(i = 1; i <= 9; i++) {
				
				if(i == 5) {
//					break;
					
//					break OUTER;
					
//					continue;
					
					continue OUTER;
				}
				
				System.out.println(dan + " * " + i + " = " + dan * i);
				
			}
			
			System.out.println();
		}
		
				// %d : 정수 
				System.out.printf("값 : %d\n", 250);
				
				int num = 5000;
				System.out.printf("값 : %d\n", num);
				
				// %xd 지정 시 x만큼의 자릿수 확보한 후, 우측부터 채움
				System.out.printf("값 : %8d\n", 50000);
				// %-xd 지정 시 x만큼의 자릿수 확보한 후, 좌측부터 채움
				System.out.printf("값 : %-10d\n", 50000);
				
				// %f : 실수
				System.out.printf("값 : %f\n", 3.14);
				
				// %.xf 지정 시 x만큼의 소수점 자릿수만 표현(반올림해서 표현)
				System.out.printf("값 : %.3f\n", 3.15786);
				
				// %c : 문자
				System.out.printf("문자 : %c\n", 'a');
				System.out.printf("문자 : %c\n", 65); // 정수 -> 문자로 변환
				System.out.printf("문자 : %C\n", 'a'); // 대문자로 표현
				
				// %s : 문자열
				System.out.printf("문자열 : %s\n", "Korea");
				
				// %.xs : 문자열 좌측부터 x만큼만 출력
				System.out.printf("문자열 : %.3s\n", "Korea");
				
				System.out.println("-------------------------------------");
				
			
			int dan = 2;	
			for(; dan <= 9; dan++) {
				System.out.printf("  < %d 단 >      ", dan);
			}
			System.out.println();
			
			i = 1;
			while(i <= 9) {
				
				dan = 2;
				while(dan <= 9) {
					
					System.out.printf("%2d * %2d = %-5d", dan, i, dan * i);
					dan++;
				}
				System.out.println();
				i++;
			}
			
			// int형 정수 3개를 저장하기 위한 배열 변수 arr을 선언
			
			int[] arr = new int[3];
			
			System.out.println(arr[0]);
			
			arr[0] = 1;
			
			System.out.println(arr[0]);

	}

}
