
/*
 *  Car 클래스 정의
 *  - 멤버변수
 *    1) 속도(speed, int)
 *    2) 정지상태(isStop, boolean)
 *    
 *  - 멤버변수에 대한 Getter / Setter 작성
 *    1) speed에 대한 Setter
 *       -> 매개변수의 값이 0보다 작을 경우에는 speed 값을 0으로 초기화하고 isStop 변수를 true로 변경
 *    2) isStop에 대한 Setter
 *       -> 매개변수의 값을 isStop에 초기화하고, speed 역시 0으로 초기화 
 *          "차량을 정지하겠습니다!" 출력
 *          
 */

class Car2 {
	private int speed;
	private boolean isStop;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int newSpeed) {
		if(newSpeed < 0) {
			speed = 0;
			isStop = true;
		} else {
			speed = newSpeed;
			isStop = false;
		}
		
	}
	
	public boolean isStop() {
		return isStop;
	}
	
	public void setStop(boolean newIsStop) {
		isStop = newIsStop;
		speed = 0;
		System.out.println("차량을 정지합니다.");
	}
}
public class Practice0630_5 {

	public static void main(String[] args) {


		Car2 c = new Car2();
		
		c.setSpeed(200);
		System.out.println("현재 속도 : " + c.getSpeed());
		
		if(!c.isStop()) {
			c.setStop(true);
		}
		c.setStop(true);
		System.out.println(c.isStop());

	}

}
