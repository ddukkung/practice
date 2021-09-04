package practice0904;

import java.util.*;

public class Practice07 {

	public static void main(String[] args) {
		
		// Person4 클래스의 인스턴스 두 개 생성
		// "홍길동", 20
		// "이순신", 44
		Person4 p1 = new Person4("홍길동", 20);
		Person4 p2 = new Person4("이순신", 44);
		
		// Person 객체 여러 개를 하나의 객체에 저장하여 관리할 경우
		// 1. Object[] 배열을 통해 관리
		// -> 배열은 크기가 불변이므로 추가적인 객체 저장 불가
		Object[] objArr = {p1, p2}; // Person4 -> Object 업캐스팅되어 관리됨.
		
		for (int i = 0; i < objArr.length; i++) {
			Object o = objArr[i];
			
//			System.out.println(o.getName()); // 컴파일 에러 발생
			// -> Object[] 배열 내의 Person4 객체를 Object 타입 변수에 저장하면
			// 	  업캐스팅된 상태이므로 서브클래스인 Person4의 상세정보가 보이지 않는다.
			
			// Object[] 배열 내의 Person4 객체를 꺼내서 Person4 타입 변수에 저장
			Person4 p = (Person4)objArr[i]; // Object -> Person4 다운캐스팅 필수
			
			// Getter 메서드를 호출하여 이름, 나이를 출력
			System.out.println("이름 : " + p.getName() + ", 나이 : " + p.getAge());
			
		}
		
		System.out.println("-----------------------------------------------------");
		
		// 2. Collection(ArrayList)을 활용하여 Person 객체 여러 개를 관리할 경우
		// -> 배열의 단점인 크기 불변을 해결하게 되므로 여러 객체를 자유롭게 추가 가능
		// 1) 제네릭을 사용하지 않을 경우
		// 	  - 파라미터 또는 리턴타입이 Object 타입이 되어 다양한 객체 저장 가능
		//	  - 저장 시점에서 타입 판별이 이루어지지 않으므로 편리하지만, 데이터를 꺼내는 시점에서 타입 불일치에 따른 오류 발생 가능성이 존재한다.
		//	  - 데이터를 꺼내기 전 instanceof 연산자를 통한 타입 판별을 수행해야 하며,
		//		Object 타입을 실제 데이터타입으로 다운캐스팅을 수행해야 한다.
		
		List list = new ArrayList();
		list.add(p1);
		list.add(p2);
		list.add(new Person4("강감찬", 35)); // 새로 추가되는 객체도 자동으로 확장되어 저장됨
		list.add("배방울"); // Person4 객체가 아닌 데이터도 추가 가능
		// -> Person4 객체 형태로 꺼내서 사용하는 시점에서 문제가 발생할 수 있다. 
		
		// for문을 사용하여 ArrayList 객체 반복
		// -> Person4 타입 변수에 저장 후 Getter 메서드 호출
		// 일반 for문 사용 시
		for(int i = 0; i < list.size(); i++) {
			
			// 잘못된 데이터가 저장되어 있을 수도 있으므로 타입 판별 후 형변환이 필요하다.
			if(list.get(i) instanceof Person4) {
				Person4 p = (Person4)list.get(i);
				System.out.println(p.getName() + ", " + p.getAge());
			} else {
				System.out.println("타입이 일치하지 않습니다.");
			}
		
		}
		
		System.out.println("-----------------------------------------------------");
		
		// 2) 제네릭 타입을 사용할 경우
		// 	  -> 저장할 객체 타입이 Person4 타입이므로 제네릭 타입 <Person4> 지정
		// 	  - 객체 저장 시 Person4 타입 객체만 저장 가능하도록 자동으로 판별 수행.
		//		즉, 잘못된 객체(데이터)가 저장될 우려가 없다.
		//	  - Object 타입으로 업캐스팅 되지 않고 Person4 타입 자체로 저장되기 때문에 객체(데이터)를 꺼내는 시점에서도 Person4 타입 그대로 꺼낼 수 있다.
		//	    -> 별도의 다운캐스팅 등 형변환이 불필요
		//	  - 추가적인 타입 판별도 불필요
		List<Person4> list2 = new ArrayList<Person4>();
		// 제네릭타입 <Person4> 지정 시 사용 가능한 객체는 무조건 Person4 타입 객체만 가능
		
		list2.add(p1);
		list2.add(p2);
		list2.add(new Person4("강감찬", 35));
		
		// Person4 타입이 아닌 객체를 추가할 경우 데이터타입 판별에 의해 오류가 발생한다.
//		list2.add("배방울"); // 컴파일 에러 발생
		
		for(int i = 0; i < list2.size(); i++) {
			// 제네릭 타입을 설정했기 때문에 다른 데이터타입은 저장될 수 없으므로 instanceof를 이용해 판별할 필요가 없다.
			Person4 p = (Person4)list.get(i);
			System.out.println(p.getName() + ", " + p.getAge());
		}
		

	}

}

/*
 *  Person4 클래스 정의
 *  - 멤버변수 : 이름(name, 문자열), 나이(age, 정수)
 *  - 생성자 : 이름과 나이를 전달받아 초기화하는 생성자
 *  - toString() 메서드 오버라이딩(이름과 나이를 결합하여 리턴)
 *  - Getter/Setter 정의
 *  
 */
class Person4 {
	
	String name;
	int age;
	
	public Person4(String name, int age) {
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

	@Override
	public String toString() {
		return "Person4 [name=" + name + ", age=" + age + "]";
	}
	
}