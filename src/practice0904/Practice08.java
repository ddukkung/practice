package practice0904;

public class Practice08 {

	public static void main(String[] args) {
		
		/*
		 *  사용자 정의 클래스에 대한 제네릭 타입 적용
		 *  - 클래스 정의 시점에서 클래스명 뒤에 <> 기호를 쓰고, 기호 사이에 '가상의 데이터타입' 명시
		 *    -> 보통 1글자 영문 대문자 사용(주로 E(Element), T(Type) 등을 사용)
		 *    -> 가상의 데이터타입이므로 실제 데이터타입으로 사용은 불가능하나, 제네릭 타입에서 '임시'로 설정하여 관리함.
		 *  - 지정된 가상의 자료형은 클래스 내부에서 실제 데이터타입 명시하는 부분에 대체가 가능하다.
		 *  
		 */
		
		NormalIntegerClass nic =  new NormalIntegerClass();
		
		nic.data = 10; // 정수 저장 가능
//		nic.data = 3.14; // 실수 저장 불가
//		nic.data = "홍길동"; // 문자열 저장 불가
		// -> 여러 데이터타입 데이터를 모두 저장하려면 최소한 최상위 클래스인 Object 타입 변수를 선언해야 한다.
		
		NormalObjectClass noc = new NormalObjectClass();
		noc.data = 10;
		noc.data = 3.14;
		noc.data = "홍길동"; 
		// -> Object 타입 변수이므로 모든 데이터타입 저장 가능
		// -> 단, 객체 내의 데이터를 꺼내서 사용할 때 타입 판별이 필수이다.
//		System.out.println(noc.data + 10);
		
		// 제네릭을 사용한 클래스의 인스턴스 생성
		// -> 제네릭 타입 지정 시 반드시 클래스 타입(참조형)으로 명시해야 한다.
		// 1. 제네릭타입 T를 Integer 타입으로 지정
		GenericClass<Integer> gc = new GenericClass<Integer>();
		
		gc.setData(1); // setData(Integer data) 형태로 바뀌어 있음
//		gc.setData("홍길동"); // 컴파일에러 발생. Integer 타입만 전달 가능
		System.out.println(gc.getData()); // 리턴타입이 Integer 타입으로 바뀌어 있다. 
		
		
		// 2. 제네릭 타입 T를 Double 타입으로 지정
		GenericClass<Double> gc2 = new GenericClass<Double>();
		
		gc2.setData(3.14); // -> GenericClass 클래스 내의 모든 T 타입이 Double 타입으로 변경됨
		System.out.println(gc2.getData());
		
		// 3. 제네릭 타입 T를 String 타입으로 지정
		GenericClass<String> gc3 = new GenericClass<String>();
		
		gc3.setData("홍길동");
		System.out.println(gc3.getData());
		
		// 4. 제네릭 타입 T를 Person 타입으로 지정(gc4)
		//	  Setter 호출하여 Person 객체 전달하고(이름, 나이)
		//	  Getter 호출하여 Person 객체를 Person p로 리턴받아
		//	  이름, 나이 데이터 출력
		GenericClass<Person8> gc4 = new GenericClass<Person8>();
		
		gc4.setData(new Person8("홍길동", 20));
		Person8 p = gc4.getData();
		
		System.out.println("이름 : " + p.getName() + ", 나이 : " + p.getAge());
		System.out.println(gc4.getData().getName()); // 이런식으로 Person8 타입으로 바꾸지 않고도 바로 메서드를 호출하여 사용 가능
		
		// 제네릭 타입 지정 생략 시 Object 타입으로 지정된다.
		// -> Object 타입 미지정과 지정의 기능상의 차이는 없으나  제네릭 타입 자체를 생략할 경우 경고메세지가 표시된다.
		GenericClass gc5 = new GenericClass(); // 경고메세지 표시됨
		GenericClass<Object> gc6 = new GenericClass<Object>(); // 경고메세지 미표시됨

	}

}

// 제네릭을 적용하지 않는 일반 클래스 정의
// 1) 사용할 데이터타입을 특정 타입으로 관리하는 일반 클래스
class NormalIntegerClass {
	int data; // data 변수에는 정수형 데이터만 저장 가능
}

// 2) 사용할 데이터타입을 Object 타입으로 관리하는 일반 클래스
class NormalObjectClass {
	Object data; // data 변수에는 모든 데이터타입 데이터가 저장 가능
}

// 제네릭을 사용한 클래스 정의
class GenericClass<T> {
	// 제네릭 타입 T 지정 시 클래스 내의 데이터타입 부분을 T로 지정하여 임시 데이터타입으로 클래스 정의 가능
	// (실제 사용 가능한 데이터타입은 아니다.)
	// -> 차후, 객체 생성 시점에서 제네릭타입에 대한 실제 데이터타입을 명시할 경우
	//	  현재 클래스 내의 제네릭타입(T) 부분이 지정된 데이터타입으로 대체된다. 
	// -> 실제 인스턴스 생성 시점에서 어떠한 데이터타입으로도 바꿀 수 있다. 
	
	private T data;
	// 멤버변수의 데이터타입이 제네릭타입 T이므로 멤버변수에 접근하는 Getter/Setter 등의 데이터타입도 제네릭타입 T로 지정된다.

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

class Person8 {
	
	String name;
	int age;
	
	public Person8(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

