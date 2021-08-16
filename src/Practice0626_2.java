
public class Practice0626_2 {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.name = "배재희";
		p.age = 27;
		
		System.out.println("이름 : " + p.name + ", 나이 : " + p.age + ", 타입 : " + p.type);
		
		p.talk();
		p.eat();
		
		// 두 번째 Person 인스턴스 생성(변수 p2 사용)
		// -> 이름 : 이순신, 나이 : 40, 타입 : 장군
		
		Person p2 = new Person();
		
		p2.name = "이순신";
		p2.age = 40;
		p2.type = "장군";
		
		System.out.println("이름 : " + p2.name + ", 나이 : " + p2.age + ", 타입 : " + p2.type);
		

	}

}
