
public class Practice0614 {

	public static void main(String[] args) {
		
		
		/*
	     *  중첩 for문을 사용하여 구구단 2단 ~ 9단까지 모두 출력
	     *
	     *  < 2 단 >
	     *  2 * 1 = 2
	     *  2 * 2 = 4
	     *  ...
	     *  2 * 9 = 18
	     *
	     *  < 3 단 >
	     *  3 * 1 = 3
	     *  3 * 2 = 6
	     *  ...
	     *
	     *  < 9 단>
	     *  ...
	     *  9 * 9 = 81
	     *
	     */
		
		for(int dan = 2; dan <= 9; dan++) {
			
			System.out.println("< " + dan + " 단 >");
			
			for(int i = 1; i <= 9; i++) {
				
				System.out.println(dan + " * " + i + " = " + dan * i);
				
			}
			
			System.out.println();
		}
		
		
		/*
	     *  중첩 for문을 이용하여 방정식 4x + 5y = 60 의 모든 해를 구해서
	     *  (x, y) 형태로 출력하는 코드
	     *  단, x 와 y는 10 이하의 정수
	     *
	     *  출력결과
	     *
	     *  (5, 8)
	     *  (10, 4)
	     *
	     */
		
		for(int x = 0; x <= 10; x++) {
			
			for(int y = 0; y <= 10; y++) {
				
				if(4 * x + 5 * y == 60) {
					System.out.println("(" + x + ", " + y + ")");
					
				}
			}
		}
		
		/*
	     *  반복 횟수가 고정돼 있는 중첩 for문
	     *
	     *  ***** i = 1, j = 1 ~ 5
	     *  ***** i = 2, j = 1 ~ 5
	     *  ***** i = 3, j = 1 ~ 5
	     *  ***** i = 4, j = 1 ~ 5
	     *  ***** i = 5, j = 1 ~ 5
	     *
	     */
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 5; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 1 ~ 10까지 i값을 1씩 증가시키면서 출력(while문)
	    // 출력 결과
	    // 1 2 3 4 5 6 7 8 9 10
		
		int i = 1;
		
		while(i <= 10) {
			
			System.out.print(i + " ");
			
			i++;
		}
		
		System.out.println();

	    System.out.println("---------------------");
	    
	    // 1 ~ 10까지 i값을 2씩 증가시키면서 출력
	    
	    i = 1;
	    
	    while(i <= 10) {
	    	
	    	System.out.print(i + " ");
	    	
	    	i += 2;
	    }
	    
	    System.out.println();

	    System.out.println("---------------------");
	    
	    // 10에서 1까지 i값을 1씩 감소시키면서 출력
	    // 10 9 8 ... 3 2 1
	    
	    i = 10;
	    
	    while(i >= 1) {
	    	System.out.print(i + " ");
	    	
	    	i--;
	    }
	    
	    System.out.println();

	    System.out.println("---------------------");
	    
	    // 1 ~ 10까지 정수의 합 계산
	    // -> 합계를 누적하기 위해서는 누적 변수 필요
	    
	    i = 1;
	    int total = 0;
	    
	    while(i <= 10) {
	    	total += i;
	    	
	    	i++;
	    }
	    
	    System.out.println(total);
	    
	    /*
	     *  중첩 while문을 사용하여 구구단 2단 - 9단까지 출력
	     *
	     */
	    
	    int dan = 1;
	    
	    
	    while(dan <= 9) {
	    	
//	    	System.out.println("< " + dan + " 단 >");
	    	
	    	int j = 2;
	    	
	    	while(j <= 9) {
	    		
	    		System.out.print(j + " * " + dan + " = " + dan * j);
	    		System.out.print("     ");
	    		
	    		j++;
	    	}
	    	
	    	System.out.println();
	    	
	    	dan++;
	    	
	    }
	    
	    /*
	     *  1 + (-2) + 3 + (-4) + ... 와 같은 식으로 계속 더해나갔을 때
	     *  몇까지 더해야 총합이 100 이상이 되는 코드
	     *
	     *  홀수일 때는 더하고, 짝수일 떄는 빼기
	     *
	     *  출력결과
	     *
	     *  마지막 수 : 199
	     *  총 합 : 100
	     *
	     */
	    
	    
	    int num = 0;
	    int sum = 0;
	    
	    while(sum < 100) {
	    	num++;
	    	
	    	if(num % 2 == 1) {
	    		sum += num;
	    	} else {
	    		sum -= num;
	    	}
	    	
	    	
	    }
	    
	    System.out.println("마지막 수 : " + num);
	    System.out.println("총 합 : " + sum);
	    
	    
	    

	}

}
