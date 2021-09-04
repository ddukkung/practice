package practice0904_02;
import java.time.*;

public class Practice04 {

	public static void main(String[] args) {
		
		/*
		 *  Thread 상태 제어(sleep() 메서드를 통한 스레드 일시정지)
		 * 
		 */
		
		Thread timer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// 현재 스레드를 1초동안 일시 정지시키기 = 재우기 = sleep()
				for(int i = 1; i <= 60; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println(LocalTime.now());
					
				}
			}
		});
		
		timer.start();
		
		/*
		 *  출력 결과를 얼핏 살펴보면 1초씩 잘 증가하는 것처럼 보인다. 하지만 나노초 단위까지 살펴보면
		 *  정확히 1초가 아님을 알 수 있다. 이것은 스레드가 대기 풀에서 1초를 쉬는 것은 정확하지만
		 *  이후 'Runnable -> 동작'의 단계를 거쳐야 실행되므로 다시 실행되기 위해서는 1초보다 더 걸릴 수밖에 없다.
		 */

			

	}

}
