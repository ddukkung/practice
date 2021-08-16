

class Calculator3 {
	
	public void calc(char opr, int num1, int num2) {
		
		switch(opr) {
			case '+' :
			case '-' :
				calc(opr, num1, num2, 0, 0);
				break;
			case '*' :
			case '/' :
				calc(opr, num1, num2, 1, 1);
		}
	}
	
	public void calc(char opr, int num1, int num2, int num3) {
		
		switch(opr) {
		case '+' :
		case '-' :
			calc(opr, num1, num2, num3, 0);
			break;
		case '*' :
		case '/' :
			calc(opr, num1, num2, num3, 1);
	}
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
		
		System.out.println("모든 정수의 " + opr + " 결과 : " + result);
	}
	
	
}


public class Practice0630_10 {

	public static void main(String[] args) {
		
		Calculator3 c = new Calculator3();
		
		c.calc('+', 5, 8);
		c.calc('-', 40, 3, 10);
		c.calc('*', 20, 3, 9);
		c.calc('/', 40, 2, 4, 5);
		

	}

}
