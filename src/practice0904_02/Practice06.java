package practice0904_02;

public class Practice06 {

	public static void main(String[] args) {
		
		/*
		 *  스레드 우선순위(Priority)
		 *  
		 *  - 현재 우선순위 확인 : int getPriority()
		 *  - 현재 우선순위 변경 ; void setPriority(int priority)
		 *    -> 우선순위 값은 1 ~ 10 범위 내에서 지정 가능하며, 상수도 지정 가능하다. 
		 *       Thread.Min_PRIORITY(1), Thread.NORM_PRIORITY(5), Thread.MAX_PRIORITY(10)
		 *       
		 */
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					System.out.println("♪♪♪♪♪");
				}
			}
		});
		
		// 현재 스레드 우선순위 확인 : getPriority()
		System.out.println("t1 스레드 우선순위  : " + t1.getPriority());
		
		// 현재 스레드 우선순위 변경 : setPriority(int)
		t1.setPriority(8); // 현재 우선순위를 8로 변경
		System.out.println("t1 스레드 우선순위  : " + t1.getPriority());
		
		// setPriority() 메서드에 사용할 수 있는 우선순위 상수
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("t1 스레드 우선순위  : " + t1.getPriority());
		
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("t1 스레드 우선순위  : " + t1.getPriority());
		
		System.out.println("-----------------------------------------");
		
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					System.out.println("↓↓↓↓↓");
				}
			}
		});
		
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					System.out.println("♨♨♨♨♨");
				}
			}
		});
		
		// t1, t2, t3 스레드의 우선순위를 서로 다르게 변경
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("t1 스레드 우선순위  : " + t1.getPriority());
		System.out.println("t2 스레드 우선순위  : " + t2.getPriority());
		System.out.println("t3 스레드 우선순위  : " + t3.getPriority());
		
		System.out.println("-----------------------------------------");
		
		t1.start();
		t2.start();
		t3.start();
		
		// 우선순위를 줬다고 해서 무조건 그 순위에 맞게 끝나는 건 아니다. 매번 다름. 

	}

}
