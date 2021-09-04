package practice0904;

public class Practice12 {

	public static void main(String[] args) {
		
		/*
		 *  멀티 스레딩(Multi Threading)
		 *  
		 *  < 멀티 스레딩 구현 방법 >
		 *  Thread 클래스를 상속받는 서브클래스를 정의하는 방법
		 *  1) 멀티 스레딩 코드가 포함될 서브클래스에서 Thread 클래스를 상속
		 *  2) Thread 클래스의 run() 메서드를 오버라이딩하여 멀티 스레딩으로 처리할 코드를 기술
		 *  3) 멀티 스레딩 클래스 인스턴스 생성
		 *  4) 주의! run() 메서드를 호출하는 것이 아니라 start() 메서드를 호출하여 멀티 스레딩 시작
		 *     (run() 메서드 호출 시 멀티 스레딩이 아닌 싱글 스레딩으로 동작함)
		 */
		
		// 멀티 스레딩 클래스 인스턴스 생성
		MyThread mt1 = new MyThread("▲▲A작업▲▲", 100);
		MyThread mt2 = new MyThread("▨▨B작업▨▨", 100);
		MyThread mt3 = new MyThread("☎☎C작업☎☎", 100);
		
		// 멀티 스레딩 시작
		// run() 메서드를 호출하면 멀티 스레딩이 아닌 싱글 스레딩으로 처리되므로 주의
//		mt1.run();
//		mt2.run();
//		mt3.run();
		
		// 반드시 start() 메서드를 호출해야 한다.
		mt1.start();
		mt2.start();
		mt3.start();

	}

}

// 멀티 스레딩으로 구현할 서브클래스를 Thread 상속을 통해 정의
// -> 반드시 run() 메서드 오버라이딩 후 멀티 스레딩 코드를 기술해야 한다.
class MyThread extends Thread {
	String str;
	int count;
	
	public MyThread(String str, int count) {
		super();
		this.str = str;
		this.count = count;
	}

	@Override
	public void run() {
		for(int i = 1; i <= count; i++) {
			System.out.println(i + " : " + str);
		}
	}
	
	
	
}