

class NormalMethod {
	
	// 정수 한 개를 전달받아 절대값을 계산하여 출력하는 abs() 메서드 정의
	public void abs(int num) {
		// 전달받은 정수 num이 음수일 경우 양수로 변환 후 출력
		// 아니면 그대로 출력
		if(num < 0) {
			num = -num;
		}
		
		System.out.println("num = " + num);
	}
	
	// double 타입 실수를 전달받는 메서드를 별도로 정의
	public void dAbs(double num) {
		// 전달받은 정수 num이 음수일 경우 양수로 변환 후 출력
		// 아니면 그대로 출력
		if(num < 0) {
			num = -num;
		}
		
		System.out.println("num = " + num);
	}
	
	// long 타입 정수를 전달받는 메서드 별도 정의
	public void lAbs(long num) {
		// 전달받은 정수 num이 음수일 경우 양수로 변환 후 출력
		// 아니면 그대로 출력
		if(num < 0) {
			num = -num;
		}
		
		System.out.println("num = " + num);
	}
}

class OverloadingMethod {
	// 정수 한 개를 전달받아 절대값을 계산하는 abs() 메서드 정의
	// -> int, double, long 타입에 대한 각 메서드를 abs() 이름으로 통일
	//    단, 매개변수 타입만 int, double, long으로 구분
	
	public void abs(int num) {
		if(num < 0) {
			num = -num;
		}
		
		System.out.println("num = " + num);
		
	}
	
	public void abs(double num) {
		if(num < 0) {
			num = -num;
		}
		
		System.out.println("num = " + num);
		
	}
	
	public void abs(long num) {
		if(num < 0) {
			num = -num;
		}
		
		System.out.println("num = " + num);
		
	}
}

class PlusClass {
	
	public void plus(int x, int y) {
		int result = x + y;
		System.out.println(x + " + " + y + " = " + result);
	}
	
	public void plus(double x, double y) {
		double result = x + y;
		System.out.println(x + " + " + y + " = " + result);
	}
	
}
public class Practice0630_6 {

	public static void main(String[] args) {
		
		NormalMethod nm = new NormalMethod();
		nm.abs(-2);
		nm.dAbs(4.2);
		nm.lAbs(-394593);
		
		OverloadingMethod om = new OverloadingMethod();
		
		om.abs(-5);
		om.abs(-3.4);
		om.abs(3039393);
		
		System.out.println("----------------------");
		
		PlusClass pc = new PlusClass();
		
		pc.plus(10, 5);
		pc.plus(10, 3.4);
		

	}

}
