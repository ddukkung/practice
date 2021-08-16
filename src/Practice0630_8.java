
/*
 *  간단한 계산기(Calculator 클래스)
 *  - calc() 메서드 오버로딩
 *    -> 연산자(char opr) 1개와 정수 2 ~ 4(num1 ~ num4)를 전달받아 해당 연산자에 맞는 연산 결과를 출력하는 메서드 오버로딩
 *    다 double로 출력
 */

class Calculator2 {
	
	public void calc(char opr, int num1, int num2) {
		double result = 0;
		
		switch(opr) {
			case '+' :
				result = num1 + num2;
				break;
			case '-' :
				result = num1 - num2;
				break;
			case '*' :
				result = num1 * num2;
				break;
			case '/' :
				result = num1 / num2;
				break;
		}
		
		System.out.printf("%d %c %d = %.1f\n", num1, opr, num2, result);
	}
	
	public void calc(char opr, int num1, int num2, int num3) {
		double result = 0;
		
		switch(opr) {
			case '+' :
				result = num1 + num2 + num3;
				break;
			case '-' :
				result = num1 - num2 - num3;
				break;
			case '*' :
				result = num1 * num2 * num3;
				break;
			case '/' :
				result = num1 / num2 / num3;
				break;
		}
		
		System.out.printf("%d %c %d %c %d = %.1f\n", num1, opr, num2, opr, num3, result);
	}
	
	public void calc(char opr, int num1, int num2, int num3, int num4) {
		double result = 0;
		
		switch(opr) {
			case '+' :
				result = num1 + num2 + num3 + num4;
				break;
			case '-' :
				result = num1 - num2 - num3 - num4;
				break;
			case '*' :
				result = num1 * num2 * num3 * num4;
				break;
			case '/' :
				result = num1 / num2 / num3 / num4;
				break;
		}
		
		System.out.printf("%d %c %d %c %d %c %d = %.1f\n", num1, opr, num2, opr, num3, opr, num4, result);
	}
}


public class Practice0630_8 {

	public static void main(String[] args) {
		
		Calculator2 c = new Calculator2();
		
		c.calc('*', 10, 5);
		c.calc('+', 10, 8, 9);
		c.calc('/', 60, 8, 2, 3);

	}

}
