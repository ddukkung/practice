

class Calculator {
	
	// 전원 on/off 상태를 저장할 boolean 타입 변수 isPowerOn 선언
	boolean isPowerOn;
	
	// powerOn(), powerOff() 메서드 대신 하나의 메서드로 전원 on/off 관리
	public void changePower() {
		// 현재 isPowerOn 변수값을 반전시켜서 전원 on/off 수행
		isPowerOn = !isPowerOn;
		if(isPowerOn) {
			System.out.println("전원을 켭니다.");
		} else {
			System.out.println("전원을 끕니다.");
		}
	}
	
	
	public void powerOn() {
		// isPowerOn 변수값이 true일 경우
		// => "이미 전원이 켜져 있습니다!" 출력
		// false일 경우
		// => "전원을 켭니다." 출력하고 isPowerOn 변수를 true로 변경
		if(isPowerOn) {
			System.out.println("이미 전원이 켜져 있습니다.");
		} else {
			System.out.println("전원을 켭니다.");
			isPowerOn = true;
		}
		
	}
	
	public void powerOff() {
		// isPowerOn 변수값이 true일 경우
		// => "전원을 끕니다." 출력하고 isPowerOn 변수를 false로 변경
		// false일 경우
		// => "이미 전원이 꺼져 있습니다!" 출력
		if(isPowerOn) {
			System.out.println("전원을 끕니다.");
			isPowerOn = false;
		} else {
			System.out.println("이미 전원이 꺼져 있습니다.");
		}
	}
	
	// 전달받은 2개의 정수 x, y의 합을 result에 저장 후 리턴
	public int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// 메서드 명 : divide
	// 리턴타입 : double
	// 매개변수 : int 타입 정수 2개
	// 전달받은 2개의 정수의 나눗셈 결과를 result에 저장 후 리턴
	// => 단, 소수점까지 계산을 위해 전달받은 정수를 double 타입으로 변환
	public double divide(int x, int y) {
		double result = (double)x / y;
		return result;
	}
	
	
}



public class Practice0630_2 {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		c.changePower();
		double result = c.divide(10, 3);
		System.out.println(result);
		
		int result2 = c.plus(5, 9);
		System.out.println(result2);
		
		byte x = 10, y = 4;
		result = c.divide(x, y);
		System.out.println(result);
		result2 = c.plus(x, y);
		System.out.println(result2);
		
		c.powerOn();
		c.powerOff();
		c.changePower();
		c.changePower();

	}

}
