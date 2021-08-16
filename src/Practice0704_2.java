

/*
 * 계산기(Calculator) 클래스
 * - calc() 메서드
 *   -> 연산자(char opr) 1개와 정수형 가변인자를 활용하여 메서드 작성
 *   
 */

class Calculator4 {
	
	public void calc(char opr, int... nums) {
		double result = nums[0];
		System.out.print(nums[0]);
		
		if(opr == '+') {
			for(int i = 1; i < nums.length; i++) {
				result += nums[i];
				System.out.print(" + " + nums[i]);
			}
		} else if(opr == '-') {
			for(int i = 1; i < nums.length; i++) {
				result -= nums[i];
				System.out.print(" - " + nums[i]);
			}
		} else if(opr == '*') {
			for(int i = 1; i < nums.length; i++) {
				result *= nums[i];
				System.out.print(" * " + nums[i]);
			}
		} else if(opr == '/') {
			for(int i = 1; i < nums.length; i++) {
				result /= nums[i];
				System.out.print(" / " + nums[i]);
			}
		} 
		System.out.println(" = " + result);
		
	}
	
	
}

public class Practice0704_2 {

	public static void main(String[] args) {
		
		Calculator4 c = new Calculator4();
		c.calc('+', 4, 6, 2, 2);
		c.calc('-', 30, 2, 5, 3);
		c.calc('*', 2, 4, 3, 7);
		c.calc('/', 50, 2, 3, 3);

	}

}
