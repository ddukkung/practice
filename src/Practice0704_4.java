
/*
 *  Account 클래스 정의
 *  - 멤버변수 
 *    1) 계좌번호(accountNo, String)
 *    2) 예금주명(ownerName, String)
 *    3) 현재잔고(balance, int)
 *    
 *  - 기본생성자 정의 및 다음 데이터로 초기화
 *    계좌번호 : "111-1111-111"
 *    예금주명 : "홍길동"
 *    현재잔고 : 0 
 *  
 */

class Account3 {
	
	String accountNo;
	String ownerName;
	int balance;
	
	public Account3() {
		accountNo = "111-1111-111";
		ownerName = "홍길동";
	}
	
	
}

class Person4 {
	
	String name;
	int age;
	
	// 1. 기본 생성자 정의
	// -> Person2() 생성자 호출됨 출력
	public Person4() {
		System.out.println("Person4() 생성자 호출됨");
	}
	
	// 멤버변수(이름, 나이)를 출력하는 print() 메서드 정의
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	// 2. 이름(newName)을 전달받아 초기화하는 생성자 정의
	// -> Person2(String) 생성자 호출됨! 출력 및 이름 초기화
	public Person4(String newName) {
		System.out.println("Person4(String) 생성자 호출됨");
		name = newName;
	}

	public Person4(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 3. 이름(newName)과 나이(newAge)를 전달받아 초기화하는 생성자 정의
	// -> "Person2(String, int) 생성자 호출됨" 출력 및 이름, 나이 초기화
//	public Person4(String newName, int newAge) {
//		System.out.println("Person4(String, int) 생성자 호출됨");
//		name = newName;
//		age = newAge;
//	}
	
	
	
}

/*
 * Account2 클래스 정의
 * 
 *  - 멤버변수 
 *    1) 계좌번호(accountNo, String)
 *    2) 예금주명(ownerName, String)
 *    3) 현재잔고(balance, int)
 *    
 *  - 기본생성자 정의 및 다음 데이터로 초기화
 *    계좌번호 : "111-1111-111"
 *    예금주명 : "홍길동"
 *    현재잔고 : 0 
 *  
 *  - 생성자 오버로딩을 사용하여 
 *    계좌번호(accountNo)를 전달받아 초기화하는 생성자 정의
 *    
 *  - 생성자 오버로딩을 사용하여 
 *    계좌번호(accountNo)와 예금주명(ownerName)을 전달받아 초기화하는 생성자 정의
 *    
 *  - 생성자 오버로딩을 사용하여 
 *    계좌번호(accountNo)와 예금주명(ownerName)와 현재잔고(balance)를 전달받아 초기화하는 생성자 정의
 *    
 *  - 초기화된 정보를 출력하는 print() 메서드 정의
 */

class Account5 {
	
	String accountNo;
	String ownerName;
	int balance;
	
	public Account5() {
		System.out.println("Account5() 생성자 호출됨");
		accountNo = "111-1111-111";
		ownerName = "홍길동";
	}

	public Account5(String newAccountNo) {
		System.out.println("Account5(String) 생성자 호출됨");
		accountNo = newAccountNo;
	}
	
	public Account5(String accountNo, String ownerName) {
		System.out.println("Account5(String, String) 생성자 호출됨");
		this.accountNo = accountNo;
		this.ownerName = ownerName;
	}

	public Account5(String accountNo, String ownerName, int balance) {
		System.out.println("Account5(String, String, int) 생성자 호출됨");
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void print() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
	
}

public class Practice0704_4 {

	public static void main(String[] args) {
		
		Account3 a = new Account3();
		System.out.println("계좌번호 : " + a.accountNo);
		System.out.println("예금주명 : " + a.ownerName);
		System.out.println("현재잔고 : " + a.balance);
		
		Person4 p = new Person4();
		p.print();
		Person4 p2 = new Person4("홍길동");
		p2.print();
		Person4 p3 = new Person4("강감찬", 40);
		p3.print();
		
		Account5 a2 = new Account5();
		a2.print();
		Account5 a3 = new Account5("시럽");
		a3.print();
		Account5 a4 = new Account5("시럽", "222-2222-222");
		a4.print();
		Account5 a5 = new Account5("SIRUP", "222-2222-222", 10000);
		a5.print();
		

	}

}
