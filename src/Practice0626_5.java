
/*
 *  은행계좌(Account) 클래스 정의
 *  멤버변수 
 *  1) 계좌번호(accountNo, 문자열) ex. "111-1111-1111-111"
 *  2) 예금주명(ownerName, 문자열) ex. "홍길동"
 *  3) 현재잔고(balance, 정수) ex. 10000
 *  
 *  메서드 정의
 *  1) 입금(deposit)
 *  	- 매개변수 1개(정수형 amount)
 *  	- 리턴값 없음
 *  	- 입금할 금액(amount)을 전달받아 현재잔고(balance)에 누적 후 출력
 *  	  ex) 입금된 금액 : xxx원
 *  		  현재잔고 : xxx원
 *  2) 출금(withdraw)
 *  	- 매개변수 1개(정수형 amount - 출금할 금액)
 *  	- 리턴값 있음(int - 출금된 금액)
 *  	- 출금할 금액(amount)을 전달받아 현재잔고(balance)와 비교하여 
 *  	  -> 만약, 현재잔고보다 출금할 금액이 클 경우 출금 불가능하므로 "출금 불가!(잔액 부족)" 출력
 *  		 "출금할 금액 : xxx원, 현재잔고 : xxx원" 출력 후 메서드 종료 
 *  	  -> 아니면(현재잔고보다 출금할 금액이 크지 않을 경우) 출금 가능하므로 출금할 금액만큼
 *  		 현재잔고(balance)에서 차감한 후 출금할 금액만큼 리턴
 */

class Account {
	
	String accountNo;
	String ownerName;
	int balance;
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금된 금액 : " + amount + " 원");
		System.out.println("현재 잔고 : " + balance + " 원");
	}
	
	public int withdraw(int amount) {
		
		if(amount > balance) {
			System.out.println("출금 불가!(잔액 부족)");
			System.out.println("출금할 금액 : " + amount + " 원" + ", 현재잔고 : " + balance + " 원");
			amount = 0;
		} else {
			balance -= amount;
			System.out.println("출금할 금액 : " + amount + " 원" + ", 현재잔고 : " + balance + " 원");
		}
		
		return amount;
	}
}

public class Practice0626_5 {

	public static void main(String[] args) {
		
		Account acc = new Account();
		
		acc.deposit(10000);
		
		acc.withdraw(20000);
		
		int result = acc.withdraw(5000);
		System.out.println(result + "원");
		
		System.out.println("---------------------------");
		
		/*
		 *  피보나치 수열 : 앞의 두 수를 더해서 다음 수를 만들어 나가는 수열
		 *  예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고, 그 다음 수는 1과 2를 더해서 3이 되는 방식.
		 *  1, 1, 2, 3, 5, 8, 13 .... 같은 식으로 진행 
		 *  1부터 시작해서 피보나치 수열의 11번째 수를 출력하는 코드
		 *  
		 *  출력 결과
		 *  
		 *  1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
		 */
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		
		System.out.print(num1 + ", " + num2);
		// 1, 1은 이미 정해져 있기 때문에 바로 출력하면 됨 
		
		for(int i = 1; i <= 9; i++) {
			// 위에서 1, 1은 이미 출력했기 때문에 총 11개의 숫자 중 두 개를 뺀 9까지만 반복하면 됨. 
			num3 = num1 + num2;
			// num3에 첫 번째 숫자와 두 번째 숫자를 더한 다음 숫자를 저장한다. 
			System.out.print(", " + num3);
			// 첫 번째 숫자와 두 번째 숫자 다음으로 둘을 더한 다음 숫자인 num3를 출력한다. 
			num1 = num2;
			num2 = num3;
			// 그럼 지금 출력된 건 1, 1, 2. 다음에 더할 값은 현재 num2에 저장된 1과 num3에 저장된 2이므로
			// num1에 num2의 값을 저장하고 num2에 num3의 값을 저장한다.
			// 왜냐면 num3에 저장될 값이 num1 + num2니까. 
			
		}

	}

}
