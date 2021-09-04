package practice0904_02;

public class Practice03 {

	public static void main(String[] args) {
		
		// main() 메서드 내에서 
		// 서로 다른(1단, 3단, 7단) 구구단이 동시에 100번씩 출력
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 100; i++) {
					for(int j = 1; j <= 9; j++) {
						System.out.println("1 * " + j + " = " + (1 * j));
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 100; i++) {
					for(int j = 1; j <= 9; j++) {
						System.out.println("3 * " + j + " = " + (3 * j));
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 100; i++) {
					for(int j = 1; j <= 9; j++) {
						System.out.println("7 * " + j + " = " + (7 * j));
					}
				}
			}
		}).start();

	}

}
