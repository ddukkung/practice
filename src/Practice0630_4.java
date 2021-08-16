/*
 * Account 클래스 정의
 * - 멤버변수
 *   1) 계좌번호(accountNo, String)
 *   2) 예금주명(ownerName, String)
 *   3) 현재잔고(balance, int)
 *   
 */

class Account2 {
	
	private String accountNo;
	private String ownerName;
	private int balance;
	
	// 멤버변수들에 대한 Getter/Setter 통해서 접근
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accNo) {
		accountNo = accNo;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String newOwnerName) {
		ownerName = newOwnerName;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int newBalance) {
		balance = newBalance;
	}
	
	
}
public class Practice0630_4 {

	public static void main(String[] args) {
		
		
		/*
		 * Account 클래스의 인스턴스 생성 및 다음과 같이 데이터 저장, 출력
		 * 
		 * 계좌번호 : 111-1111-111
		 * 예금주명 : 홍길동
		 * 현재잔고 : 10000원
		 * 
		 */
		
		Account2 acc = new Account2();
		
		acc.setAccountNo("111-1111-111");
		acc.setOwnerName("홍길동");
		acc.setBalance(10000);
		
		System.out.println(acc.getAccountNo());
		System.out.println(acc.getOwnerName());
		System.out.println(acc.getBalance() + "원");
		
		
		/*
		 * 정수의 각 자리의 합을 더한 결과를 출력 하는 코드
		 * 
		 *  num = 123456
		 *  
		 *  출력결과
		 *  
		 *  123456 의 각 자리의 합 : 21
		 *  
		 *
		 */
		
		int num = 123456;
		int sum = 0;
		
		System.out.print(num);
		
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		System.out.println(" 의 각 자리의 합 : " + sum);

	}

}
