
/*
 *  Person 클래스 정의
 *  멤버변수 : 이름(name, 문자열), 나이(age, 정수)
 *  
 */

class Person3 {
	
	String name;
	int age;
}

class DefaultPerson {
	
	String name;
	int age;
	
	// 매개변수가 없는 기본 생성자와 동일한 형태의 생성자를 정의
	// -> 출력문을 사용하여 "DefaultPerson() 생성자 호출됨" 출력
	public DefaultPerson() {
		System.out.println("DefaultPerson() 생성자 호출됨");
		name = "홍길동";
		age = 20;
	}
	
}

//파라미터가 1개 이상인 파라미터 생성자 정의
class ParameterPerson {
	
	String name;
	int age;
	
	public ParameterPerson(String newName, int newAge) {
		// 일반 메서드와 동일하게 생성자에 전달할 데이터가 있을 경우 생성자 정의 시
		// 파라미터 부분에 매개변수를 선언할 수 있다.
		// 이름과 나이를 전달받는 파라미터 생성자 정의
		// -> ParameterPerson(String, int) 생성자 호출 됨 출력 후
		//	  이름과 나이를 멤버변수에 저장
		System.out.println("ParameterPerson(String, int) 생성자 호출 됨");
		name = newName;
		age = newAge;
		
	}
}

public class Practice0704_3 {

	public static void main(String[] args) {
		
		// Person 클래스 인스턴스 생성
		Person3 p = new Person3();
		System.out.println("이름 : " + p.name);
		System.out.println("나이 : " + p.age);
		
		DefaultPerson dp = new DefaultPerson();
		System.out.println("이름 : " + dp.name);
		System.out.println("나이 : " + dp.age);
		
		ParameterPerson pp = new ParameterPerson("강감찬", 40);
		System.out.println("이름 : " + pp.name);
		System.out.println("나이 : " + pp.age);
		

	}

}
