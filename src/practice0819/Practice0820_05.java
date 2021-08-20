package practice0819;

import java.text.MessageFormat;
import java.util.StringTokenizer;

public class Practice0820_05 {

	public static void main(String[] args) {

		// 기본적인 문자 데이터에 대한 형식화 클래스
		
		//데이터를 결합하여 출력할 포맷을 패턴 문자열로 지정
		// -> 실제 데이터가 결합될 부분을 {순서번호} 형태로 표시
		String messagePattern = "이름 : {0}, 나이 : {1}. 주민번호 : {2}";
		
		// 데이터로 사용할 변수 선언
		String name = "홍길동";
		int age = 20;
		String jumin = "920101-1010110";
		
		// 패턴 문자열과 데이터를 결합하기 위해 MessageFormat 클래스의 format() 메서드 호출
		// -> MessageFormat.format(패턴문자열, 패턴데이터1, 패턴데이터2, ..., 패턴데이터n);
		// -> 이때, 패턴데이터는 각각의 순서번호에 맞게 전달되며, 일반 변수가 아닌 데이터가 모두 포함됨
		//	  배열도 전달 가능하다.(비정형 인자 사용 가능)
		String formatStr = MessageFormat.format(messagePattern, name, age, jumin);
		System.out.println(formatStr);
		
		System.out.println("---------------------------------------------------");
		
		// 데이터로 사용할 Person 객체를 생성하여 3명의 Person 객체를 Person[]로 저장
		Person[] pArr = {
				new Person("홍길동", 22, "930101-2020220"),
				new Person("강감찬", 44, "540221-2020220"),
				new Person("이순신", 35, "901111-1212112")
		};
		
		// 반복문을 사용해 Person[] 배열을 반복하면서 각각의 Person 객체 내의 이름(name), 나이(age), 주민번호(jumin) 데이터를
		// MessageFormat 클래스의 format() 메서드에 전달하여 형식 지정 출력
		for (int i = 0; i < pArr.length; i++) {
			
			Person p = pArr[i];
			String formatStr2 = MessageFormat.format(messagePattern, p.getName(), p.getAge(), p.getJumin());
			System.out.println(formatStr2);
		}
		
		System.out.println("---------------------------------------------------");
		
		// 향상된 for문을 사용하여 객체 내의 데이터 전달
		for (Person data : pArr) {
			String formatStr3 = MessageFormat.format(messagePattern, data.getName(), data.getAge(), data.getJumin());
			System.out.println(formatStr3);
		}
		
		System.out.println("---------------------------------------------------");
		
		// 문자열로 결합된 3명의 데이터를 구분자를 사용하여 1명씩 분할 후
		// 1명의 데이터에서 다시 구분자를 사용하여 각 데이터를 분리하여 포맷 문자열의 데이터로 사용하여 출력
		String originalData = "홍길동:20:901010-1111111,이순신:44:771122-1212121,강감찬:35:830101-1231231";
		
		// String 클래스의 split() 메서드 사용
		String[] data = originalData.split(",");
		
		// 일반 for문 사용
		for (int i = 0; i < data.length; i++) {
			String[] data2 = data[i].split(":");
			String formatStr4 = MessageFormat.format(messagePattern, data2); // 배열은 그냥 배열을 통째로 넣어주면 된다
			System.out.println(formatStr4);
		}
		
		// 향상된 for문 사용
		for (String s : data) {
			String[] data2 = s.split(":");
			String formatStr5 = MessageFormat.format(messagePattern, data2);
			System.out.println(formatStr5);
		}
		
		System.out.println("---------------------------------------------------");
		
		// StringTokenizer 사용
		StringTokenizer st = new StringTokenizer(originalData, ",");
		
		// while문을 사용하여 출력
		while(st.hasMoreTokens()) {
			StringTokenizer st2 = new StringTokenizer(st.nextToken(), ":");
			String formatStr6 = MessageFormat.format(messagePattern, st2.nextToken(), st2.nextToken(), st2.nextToken());
			System.out.println(formatStr6);
		}
				
		
	}

}

class Person {
	private String name;
	private int age;
	private String jumin;
	
	public Person(String name, int age, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getJumin() {
		return jumin;
	}
	
	
}
