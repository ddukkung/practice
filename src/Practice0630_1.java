/*
 * 자동차(Car) 클래스 정의
 * 
 * 멤버변수
 * - 자동차 차종(carName, String)
 * - 자동차 브랜드(companyName, String)
 * - 자동차 배기량(cc, int)
 * - 최대속력(maxSpeed, int => 200으로 초기값 설정), 현재속력(speed, int)
 * 
 * 메서드
 * 1) 속력 증가 -> speedUp()
 *    - 증가시킬 속력(s)을 전달받아 현재속력(speed)에 누적 후
 *      "현재속력 : XXX km/h" 출력
 *      단, 현재속력이 최대속력(maxSpeed)보다 클 경우
 *      현재속력을 최대속력으로 변경 후 " 최대 속력 도달!" 출력
 *    - 매개변수 1개(증가시킬 속력 s), 리턴값 없음
 * 
 * 2) 속력 감소 -> speedDown()
 *    - 감소시킬 속력(s)을 전달받아 현재속력에서 참감한 후 
 *      "현재속력 : XXX km/h" 출력
 *      단, 현재속력이 0 보다 작을 경우 현재 속력을 0으로 변경 후 "차량 정지!" 출력
 *    - 매개변수 1개(감소시킬 속력 s), 리턴값 없음
 */

class Car {
	
	String carName;
	String companyName;
	int cc;
	int maxSpeed = 200;
	int speed;
	
	public void speedUp(int s) {
		speed += s;
		if(speed > maxSpeed) {
			speed = maxSpeed;
			System.out.println("최대 속력 도달");
		}
		
		System.out.println("현재 속력 : " + speed + "km/h");
	}
	
	public void speedDown(int s) {
		speed -= s;
		if (speed < 0) {
			speed = 0;
			System.out.println("차량 정지");
		}
		
		System.out.println("현재 속력 : " + speed + "km/h");
	}
	
	
}
public class Practice0630_1 {

	public static void main(String[] args) {

		
		Car c = new Car();
		
		c.carName = "911";
		c.companyName = "포르쉐";
		c.cc = 2000;
		
		c.speedUp(50);
		c.speedUp(200);
		c.speedDown(20);
		c.speedDown(400);

	}

}
