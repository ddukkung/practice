package practice0904_02;

public class Practice07 {

	public static void main(String[] args) {
		
		
		/*
		 *  멀티 스레딩 환경에서의 문제점
		 */
		
		// 은행 계좌 객체 1개 생성
		Account account = new Account(10000);
		
		// 출금 스레드를 수행할 객체 2개 생성
		WithdrawClass iBanking = new WithdrawClass("인터넷뱅킹", account, 2000);
		WithdrawClass mBanking = new WithdrawClass("모바일뱅킹", account, 2000);
		
		iBanking.start();
		mBanking.start();
		// 2000원을 출금하고나면 잔액이 8000원이 돼야 하는데 동시에 수행하다보니 6000원이 되는 등 잔액의 일관성이 깨진다.
		// 이런 현상을 해결하기 위해 메서드에 동기화 기능인 synhcronized 키워드를 붙여 동기화를 적용시킨다.

		

	}

}

class Account {
	int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}
	
	
	// 입금 : deposit()
	// -> 입력받은 금액을 현재잔고에 누적 후 현재잔고 리턴
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	// 출금 : withdraw()
	// -> 출금할 금액을 전달받아 현재 잔고에서 차감 후 출금금액 리턴
	// 	  단, 현재잔고가 출금할 금액보다 크거나 같을 경우에만 출금을 수행하고 현재잔고 출력
	//	  아니면 "잔액 부족으로 출금 불가" 출력
	//	  출금된 금액을 리턴
	public synchronized int withdraw(int amount) {
		// 현재 수행 중인 스레드 객체를 가져오는 방법
		// -> Thread 클래스의 static 메서드 currentThread() 메서드 호출
		String threadName = Thread.currentThread().getName(); // 리턴타입이 Thread이므로 getName() 메서드를 호출해 이름만 가져온다.
		
		if(balance >= amount) {
			balance -= amount;
			System.out.println(threadName + " - 출금된 금액 : " + amount + ", 출금 후 잔액 : " + balance);
		} else {
			System.out.println(threadName + " - 잔액 부족으로 출금 불가");
			amount = 0;
		}
		
		return amount;
	}
	
}

// 출금 기능을 전담할 스레드 정의
class WithdrawClass extends Thread {
	Account account; // 잔고가 들어있는 계좌
	int amount; // 출금할 금액
	
	public WithdrawClass(String threadName, Account account, int amount) {
		// 슈퍼클래스(Thread 클래스)를 통해 스레드 이름 초기화
		super(threadName);
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {
		for(int i = 1; i <= 6; i++) {
			// 현재 스레드를 0.5초씩 일시 정지
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			int money = account.withdraw(amount);
			System.out.println("출금 완료 : " + money + " 원");
			
		}
		
	}
	
	
	
	
}
