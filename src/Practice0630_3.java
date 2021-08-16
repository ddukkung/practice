
class Person2 {
	
	private String name;
	private int age;
	
	// 멤버변수 name에 접근할 Getter/Setter 메서드 정의
	// => 누구나 접근할 수 있도록 접근제한자 public 사용
	// 1) Getter 정의(매개변수는 없고, 리턴값만 있는 메서드)
	public String getName() {
		return name;
	}
	
	// 2) Setter 정의(매개변수만 있고, 리턴값은 없는 메서드)
	public void setName(String newName) {
		name = newName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	

	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + " 살");
	}
	
}



public class Practice0630_3 {

	public static void main(String[] args) {
		
		Person2 p = new Person2();
		
		p.setName("배재희");
		p.setAge(27);
		p.print();

	}

}
