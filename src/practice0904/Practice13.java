package practice0904;

public class Practice13 {

	public static void main(String[] args) {
		
		// 메세지 전송과 파일 전송을 동시에 수행할 경우
		// 1. 싱글 스레드로 구현한 경우
		SendMessage sm = new SendMessage("안녕하세요", 100);
		FileTransfer ft = new FileTransfer("Ex01.java", 100);
		
//		sm.run();
//		ft.run();
		// 메세지 전송이 끝난 뒤에야 파일 전송이 시작된다.
		
		// 2. 멀티 스레드로 구현한 경우
		ThreadSendMessage tsm = new ThreadSendMessage("안녕하세요", 100);
		ThreadFileTransfer tft = new ThreadFileTransfer("Ex01.java", 100);
		
		tsm.start();
		tft.start();
		// 메세지 전송과 파일 전송이 동시에 수행된다.

	}

}

class ThreadSendMessage extends Thread {
	String str;
	int count;
	
	public ThreadSendMessage(String str, int count) {
		super();
		this.str = str;
		this.count = count;
	}

	@Override
	public void run() {
		for(int i = 1; i <= count; i++) {
			System.out.println(i + " : " + str + " 메세지 전송");
		}
	}
	
}

class ThreadFileTransfer extends Thread {
	String str;
	int count;
	
	public ThreadFileTransfer(String str, int count) {
		super();
		this.str = str;
		this.count = count;
	}

	@Override
	public void run() {
		for(int i = 1; i <= count; i++) {
			System.out.println(i + " : " + str + " 파일 전송");
		}
	}
	
}

// 메세지 전송 클래스
class SendMessage {
	String str;
	int count;
	
	public SendMessage(String str, int count) {
		super();
		this.str = str;
		this.count = count;
	}
	
	public void run() {
		for(int i = 1; i <= count; i++) {
			System.out.println(i + " : " + str + " 메세지 전송");
		}
	}
	
}
// 파일 전송 클래스
class FileTransfer {
	String str;
	int count;
	
	public FileTransfer(String str, int count) {
		super();
		this.str = str;
		this.count = count;
	}
	
	public void run() {
		for(int i = 1; i <= count; i++) {
			System.out.println(i + " : " + str + " 파일 전송");
		}
	}
	
}