
public class Practice0626_1 {

	public static void main(String[] args) {
		// 1. 매개변수도 없고, 리턴값도 없는 메서드 호출
		sister_1();
		
		// 2. 매개변수는 없고, 리턴값만 있는 메서드 호출
		// -> sister_2() 메서드는 매개변수가 없으므로 메서드 호출 시 소괄호 내부에 아무 데이터도 전달하지 못함
		// -> 리턴값이 있으므로 변수에 리턴값을 저장하거나 출력문에 바로 사용할 수도 있음
		String result = sister_2();
		System.out.println(result);
		
		// 3. 매개변수만 있고, 리턴값은 없는 메서드 호출
		sister_3(500000);
		
		// 4. 매개변수도 있고, 리턴값도 있는 메서드 호출
		
		int result2 = sister_4(500000);
		System.out.println(result2);
		
		// 5. 매개변수가 2개 이상이고, 리턴값도 있는 메서드 호출
		result2 = sister_5(800000, 300000);
		System.out.println("여윳돈 : " + result2);
				
		
		

	}
	
	// 1. 매개변수도 없고 리턴값도 없는 메서드 정의
	// -> 리턴값이 없으므로 리턴타입 부분에 특수 자료형인 void를 명시
	// -> 매개변수가 없으므로 메서드 선언부 소괄호() 안에 비워둠
	
	public static void sister_1() {
		System.out.println("우미노 히비키노 요우나 에로틱");
	}
	
	// 2. 매개변수는 없고, 리턴값만 있는 메서드 정의
	// -> 리턴값이 있으므로, 리턴값에 해당하는 자료형을 명시
	// -> 매개변수가 없으므로 메서드 선언부 소괄호() 안에 비워둠
	
	public static String sister_2() {
		return "와타시가 호시갓테루 모노오 사가시다시테요";
	}
	
	//  3. 매개변수만 있고, 리턴값은 없는 메서드 정의
	// -> 리턴값이 없으므로 리턴타입에 void 명시
	// -> 메서드 호출 시 정수 한 개를 전달하므로 정수를 저장할 매개변수 선언
	public static void sister_3(int money) {
		System.out.println("국취제 지원금 : " + money + " 원");
	}
	
	// 4. 매개변수도 있고, 리턴값도 있는 메서드 정의
	// -> 리턴값이 있으므로, 리턴타입 부분에 리턴할 데이터타입 명시
	// -> 매개변수가 있으므로 소괄호() 안에 전달받은 데이터를 저장할 변수 선언
	public static int sister_4(int money) {
		System.out.println("지원금 : " + money);
		money -= 200000;
		System.out.println("여윳돈 : " + money);
		return money;
	}
	
	// 5. 매개변수가 2개 이상이고, 리턴값도 있는 메서드 정의
	// -> 매개변수가 여러 개일 때 해당 개수와 타입만큼 변수 선언 필요
	//    주의사항! 전달된 데이터의 순서대로 선언해야 함.
	//    메서드 정의 시 매개변수 선언 순서대로 호출되어야 함 
	public static int sister_5(int money, int expense) {
		System.out.println("총 지원금 :" + money);
		System.out.println("예상되는 지출 : " + expense);
		money -= expense;
		return money;
	}
	

}
