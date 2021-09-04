package practice0904_02;

public class Practice02 {

	public static void main(String[] args) {
		
		/*
		 *  멀티 스레딩 구현 코드의 변형
		 *  
		 *  < 기본 문법 >
		 *  Thread t = new Thread(new Runnable() {
		 *  	@Override
		 *  	public void run() {
		 *  		// 멀티 스레딩으로 구현할 코드
		 *  	}
		 *  
		 *  }
		 *  
		 *  );
		 *  
		 *  t.start();
		 *  -> 위의 두 문장을 하나로 결합하여 Thread 객체도 임시 객체로 사용 가능
		 *  new Thread(new Runnable() {}).start();
		 *  
		 */
		
		int count = 1000;
//		
//		// Thread 객체 생성 및 Runnable 인터페이스 구현과 객체 생성, 전달을 한꺼번에 수행
//		Thread t = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// 멀티 스레딩으로 구현할 코드 기술
//				for(int i = 1; i <= count; i++) {
//					System.out.println(i + " : A작업");
//				}
//			}
//		});
//		
//		// 스레드 실행
//		t.start();
		
		// ------------------------------------------------------------------------------------------
		// 위의 작업을 하나의 문장으로 결합
		// -> Thread 클래스의 변수를 제거 후 객체 생성 코드만 기술하고, start() 메서드를 바로 호출
		// A작업, B작업, C작업
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// 멀티 스레딩으로 구현할 코드 기술
				for(int i = 1; i <= count; i++) {
					System.out.println(i + " : A작업");
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// 멀티 스레딩으로 구현할 코드 기술
				for(int i = 1; i <= count; i++) {
					System.out.println(i + " : B작업");
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// 멀티 스레딩으로 구현할 코드 기술
				for(int i = 1; i <= count; i++) {
					System.out.println(i + " : C작업");
				}
			}
		}).start();
		
		// -----------------------------------------------------------------------------------------
		/*
		 *  Thread 클래스만으로 멀티 스레딩을 구현하는 방법(위의 방법보다 사용빈도 낮음)
		 *  
		 *  < 기본 문법 >
		 *  Thread t = new Thread() {
		 *  	@Override
		 *  	public void run() {
		 *  		// 멀티 스레딩으로 처리할 코드
		 *  	}
		 *  };
		 *  
		 *  t.start();
		 *  -------------------------------------------
		 *  
		 *  위의 문장을 하나로 결합할 경우
		 *  new Thread() {
		 *   	@Override
		 *  	public void run() {
		 *  		// 멀티 스레딩으로 처리할 코드
		 *  	}
		 *  }.start();
 		 */
		
		// Thread 클래스만으로 D작업, E작업 멀티 스레딩 구형
		// D작업은 Thread 객체 생성
		// E작업은 문장 하나로 결합하여 실행
		Thread t = new Thread() {
			public void run() {
				for(int i = 1; i <= count; i++) {
					System.out.println(i + " : D작업");
				}
			}
		};
		
		t.start();
		
		new Thread() {
			
			public void run() {
				for(int i = 1; i <= count; i++) {
					System.out.println(i + " : E작업");
				}
			}
		}.start();

	}

}
