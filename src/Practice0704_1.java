

/*
 *  메서드 오버로딩과 코드의 재사용
 *  
 *  사각형(Rectangle) 넓이 계산하는 클래스 가로 곱하기 세로...ㅎ
 *  cal() 메서드 작성
 *  리턴타입(double) / 매개변수 1개 - 정사각형으로 계산
 *  리턴타입(double) / 매개변수 2개 - 직사각형으로 계산
 *  
 */

class Rectangle {
	
	public double cal(double width) {
		
		return cal(width, width);
	}
	
	public double cal(double width, double height) {
		
		System.out.println("사각형 가로 길이 = " + width);
		System.out.println("사각형 세로 길이 = " + height);
		
		return width * height;
		
	}
	
	
}

class VariableArguments {
	
	// 일반 메서드 오버로딩
	// 정수 2개(n1, n2)를 전달받아 출력하는 print() 메서드 정의
	// 정수 3개(n1, n2, n3)를 전달받아 출력하는 print() 메서드 정의
	
	public void print(int n1, int n2) {
		System.out.println(n1 + " " + n2);
	}
	
	public void print(int n1, int n2, int n3) {
		System.out.println(n1 + " " + n2 + " " + n3);
	}
	
	public void print(int... nums) {
//		for(int i = 0; i < nums.length; i++) {
//			System.out.print(nums[i] + " ");
//		}
		
		for(int i : nums) {
			System.out.print(i + " ");
		}
	}
	
}


public class Practice0704_1 {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		double result = r.cal(10);
		System.out.println("정사각형 넓이 : " + result);
		result = r.cal(20, 40);
		System.out.println("직사각형 넓이 : " + result);
		
		VariableArguments vr = new VariableArguments();
		vr.print(1, 4);
		vr.print(1, 4, 5);
		vr.print(1, 4, 6, 3, 2);
		
	}

}
