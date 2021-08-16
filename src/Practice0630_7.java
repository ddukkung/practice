

class OverloadingMethod2 {
	
	// 매개변수 개수가 다른 메서드 오버로딩
	// 정수 두 개를 전달받는 print() 메서드 정의
	public void print(int n1, int n2) {
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
	}
	
	// 정수 세 개를 전달 받는 print() 메서드 정의
	public void print(int n1, int n2, int n3) {
		System.out.println("n1 = " + n1 + ", n2 = " + n2 + ", n3 = " + n3);
	}
	
	// ---------------------------------------------------------------------------------
	
	// 정수 1개(count)와 문자열(name) 2 ~ 4개까지 전달받는 print2() 메서드 정의
	public void print2(int count, String name) {
		System.out.println(count + ", " + name);
	}
	
	public void print2(int count, String name1, String name2) {
		System.out.println(count + ", " + name1  + ", " + name2);
	}
	public void print2(int count, String name1, String name2, String name3) {
		System.out.println(count + ", " + name1  + ", " + name2 + ", " + name3);
	}
	
}
public class Practice0630_7 {

	public static void main(String[] args) {
		
		OverloadingMethod2 om = new OverloadingMethod2();
		
		om.print(3, 6);
		om.print(3, 6, 9);
		
		om.print2(40, "sksk");
		om.print2(34, "잠옴", "잠온다");
		om.print2(33, "dkdk", "dkdkdk", "dkdkdkdk");

	}

}
