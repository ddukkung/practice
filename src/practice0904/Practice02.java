package practice0904;

import java.util.*;

public class Practice02 {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		// 키로 사용할 데이터 : Person 객체
		// 값으로 사용할 데이터 : 전화번호
		// key
		// "홍길동", "901010-1234567" / "010-1234-5678"
		// "이순신", "911010-1111111" / "010-2222-3333"
		// "홍길동", "901010-1234567" / "010-3333-4444"
		map.put(new Person("홍길동", "901010-1234567"), "010-1234-5678");
		map.put(new Person("이순신", "911010-1111111"), "010-2222-3333");
		map.put(new Person("홍길동", "901010-1234567"), "010-3333-4444");
		// -> Person 객체를 키로 갖는 경우
		//	  new 연산자를 통해 객체 생성 코드를 키에 전달할 경우
		//	  데이터는 동일하지만 생성된 객체의 주소값이 다르므로 서로 다른 키로 인식된다.
		// -> 따라서, 이름과 주민번호가 같은 객체라도 서로 다른 전화번호가 별개의 위치에 저장된다.
		
		System.out.println(map);
		
		System.out.println("-----------------------------------------------------------------------");
		
		Map map2 = new HashMap();
		
		Person p = new Person("홍길동", "901010-1234567");
		
		map2.put(p, "010-1234-5678");
		map2.put(p, "010-3333-4444");
		// -> Person 객체의 참조변수 p를 키에 두 번 전달하는 경우
		// 	  전화번호가 다르더라도 참조변수는 1개이므로 하나의 키로 인식된다.
		// -> 따라서, 이름과 주민번호가 같은 객체는 뒤의 전화번호를 덮어쓰게 됨.
		
		System.out.println(map2); // 두 개의 키값쌍이 아닌 {Person [name=홍길동, jumin=901010-1234567]=010-3333-4444}가 출력된다.
		

	}

}

class Person {
	String name;
	String jumin;
	
	public Person(String name, String jumin) {
		super();
		this.name = name;
		this.jumin = jumin;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", jumin=" + jumin + "]";
	}
	
}