package practice0904;

public class Practice11 {

	public static void main(String[] args) {
		
		NoThread nt1 = new NoThread("♨♨A작업♨♨", 100);
		NoThread nt2 = new NoThread("※※B작업※※", 100);
		NoThread nt3 = new NoThread("♪♪C작업♪♪", 100);
		
		nt1.run(); // A작업이 100만번 수행이 끝나면
		nt2.run(); // B작업이 실행되고, B작업이 100만번 수행이 끝나면
		nt3.run(); // C작업이 실행된다.
		// -> 즉, 기본적인 프로그램은 앞의 코드가 실행이 끝나야만 다음 코드가 실행된다.

	}

}

class NoThread {
	
	String str;
	int count;
	
	public NoThread(String str, int count) {
		super();
		this.str = str;
		this.count = count;
	}
	
	public void run() {
		// count 횟수만큼 str 반복 출력
		for(int i = 1; i <= count; i++) {
			System.out.println(i + " : " + str);
		}
	}
	
}