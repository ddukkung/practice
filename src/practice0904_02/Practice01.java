package practice0904_02;

public class Practice01 {

	public static void main(String[] args) {
		
		/*
		 *  < 멀티 스레딩 구현 방법 >
		 *  Runnable 인터페이스를 구현하는 서브클래스를 정의하는 방법
		 *  - 기존에 다른 클래스를 상속 중인 서브클래스는 Thread 클래스 상속이 불가능하므로
		 *    Thread 클래스 상속 대신 Runnable 인터페이스를 구현하면 된다.
		 *    (Thread 클래스는 Runnable 인테페이스의 구현체이다.)
		 *  - Runnable 인터페이스 내에는 start() 메서드가 존재하지 않으며 
		 *    존재하더라도 추상메서드 형태이기 때문에 start() 메서드 호출이 불가능하다. 
		 *    -> 따라서, Thread 클래스를 통해 간접적으로 start() 메서드를 호출해야 한다.
		 *    
		 *  1) 멀티 스레딩 코드가 포함될 서브클래스에서 Runnable 인터페이스를 구현(implements)
		 *  2) 추상 메서드인 run() 메서드를 구현하여 멀티 스레딩 코드 기술
		 *  3) 멀티 스레딩 클래스 인스턴스 생성
		 *     -> Runnable 인터페이스 내에 start() 메서드가 존재하지 않음 
		 *  4) start() 메서드를 가지고 있는 Thread 클래스의 인스턴스 생성
		 *     -> 생성자 파라미터로 Runnable 구현체 객체를 전달
		 *  5) Thread 인스턴스를 통해 간접적으로 start() 메서드 호출
		 */
		
		// Runnable 구현체 클래스의 인스턴스 생성
		YourThread yt1 = new YourThread("♥♥A작업♥♥", 100);
		YourThread yt2 = new YourThread("◈◈B작업◈◈", 100);
		YourThread yt3 = new YourThread("♬♬C작업♬♬", 100);
		
//		yt1.start(); // 오류 발생. 존재하지 않는 메서드
		// -> Runnable 구현체 내부에는 start() 메서드가 존재하지 않기 때문.
		
		// Thread 클래스의 인스턴스 생성 시 생성자 파라미터로 Runnable 구현체 객체 전달 후
		// Thread 객체를 통해 start() 메서드를 호출하여 간접적으로 멀티 스레딩 수행
//		Thread t1 = new Thread(yt1);
//		Thread t2 = new Thread(yt2);
//		Thread t3 = new Thread(yt3);
		
		// YourThread 타입 변수는 Thread 클래스 생성자에 전달하는 작업 외에 사용되지 않는다.
		// 따라서, 1회성 변수를 선언하기 보다는 Thread 생성자에 YourThread 객체 생성 코드를
		// 직접 전달하여 변수 없이 객체 자체를 바로 전달 가능.
		Thread t1 = new Thread(new YourThread("♥♥A작업♥♥", 100));
		Thread t2 = new Thread(new YourThread("◈◈B작업◈◈", 100));
		Thread t3 = new Thread(new YourThread("♬♬C작업♬♬", 100));
		
		t1.start();
		t2.start();
		t3.start();

	}

}
class A {}

class YourThread extends A implements Runnable  {
	// 이미 A클래스를 상속받은 YourThread 클래스를 멀티 스레딩 클래스로 정의하는 경우
	// -> Runnable 인터페이스를 구현(implements)해야 함
	
	String str;
	int count;
	
	public YourThread(String str, int count) {
		super();
		this.str = str;
		this.count = count;
	}

	// Runnbale 인터페이스에서 상속된 run() 메서드 오버라이딩 필수
	@Override
	public void run() {
		// 멀티 스레딩으로 처리할 코드를 기술
		for(int i = 1; i <= count; i++) {
			System.out.println(i + " : " + str);
		}
	}
	
	
}
