

/*
 *  설계 단계 - 사람 클래스 정의
 *  1) 속성(멤버변수) : 이름 -> name, 문자열 / 나이 -> age, 정수
 *  2) 동작(메서드) : 말하기 -> talk() / 먹기 -> eat()
 */

public class Person {
	
	String name;
	int age;
	String type = "사람";
	
	public void talk() {
		System.out.println("사람 객체의 말하기 동작");
	}
	
	public void eat() {
		System.out.println("사람 객체의 먹기 동작");
	}
	

}
