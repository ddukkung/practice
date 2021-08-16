
class Animal {
	
	// 멤버변수 : 이름(name), 나이(age)
	
	String name;
	int age;
	
	// "동물 울음 소리!" 라는 문자를 출력하는 cry() 메서드 정의
	// -> 매개변수도 없고, 리턴값도 없는 메서드
	
	public void cry() {
		System.out.println("동물 울음 소리");
	}
	
	// 인스턴스변수 name과 age의 데이터를 출력하는 print() 메서드 정의
	
	public void print() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	
}


public class Practice0626_4 {

	public static void main(String[] args) {
		
		
		Animal a1 = new Animal();
		a1.name = "방울이";
		a1.age = 17;
		
		System.out.println("이름 : " + a1.name + ", 나이 : " + a1.age);
		
		a1.cry();
		a1.print();
		
		Animal a2 = new Animal();
		Animal a3 = new Animal();
		
		a2.name = "레이";
		a3.name = "레오";
		a2.age = 5;
		a3.age = 5;
		
		a2.print();
		a3.print();
		
		

	}

}
