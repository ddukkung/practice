

class Student {
	
	// 인스턴스 멤버변수 선언
	// 1. 학생 이름(name, 문자열)
	// 2. 학생 반 이름 (className, 문자열)
	// 3. 학생 나이(age, 정수)
	String name;
	String className;
	int age;
	
}


public class Practice0626_3 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		// 이름 = 각자 이름
		// 과정명 = 스마트웹 하이브리드앱 자바 개발자 양성
		// 나이 = 각자 나이
		
		s1.name = "배재희";
		s1.className = "스마트웹 하이브리드앱 자바 개발자 양성";
		s1.age = 27;
		
		System.out.println("이름 : " + s1.name);
		System.out.println("과정명 : " + s1.className);
		System.out.println("나이 : " + s1.age);

	}

}
