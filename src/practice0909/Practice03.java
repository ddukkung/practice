package practice0909;
import java.io.*;

public class Practice03 {

	public static void main(String[] args) {
		
		/*
		 *  객체 직렬화(Serialization) & 역직렬화(Deserialization)
		 */
		
		// Person 객체 생성
		Person p = new Person("홍길동", 20);
		System.out.println(p);
		
		System.out.println("----------------------------------------------------------");
		
		// File 경로 관리를 위한 File 객체 생성
		File f = new File("D:\\jaehee\\temp\\serial_person2.dat");
		
		// Person 객체를 외부 파일로 출력하기(= 직렬화)
		// -> ObjectOutputStream 객체를 생성하여 FileOutputStream 객체 연결
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
			// ObjectOutputStream 객체의 writeObject() 메서드를 호출하여 객체 출력
			oos.writeObject(p);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("객체 출력 완료");
		
		System.out.println("----------------------------------------------------------");
		
		// 외부 폴더에 저장되어 있는 파일 내의 Person 객체를 ObjectInputStream 객체를 사용하여 읽어오기 -> 역직렬화
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
			
			// 다운캐스팅에서 문제가 발생하지 않도록 하려면 타입 체크 필요
			Object o = ois.readObject();
			if(o instanceof Person) {
				Person p2 = (Person)o;
				
				// 리턴받은 객체 내의 변수에 접근
				// toString() 메서드가 오버라이딩되어 있으므로 변수명 바로 전달하여 출력 가능
				System.out.println(p2);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}

// 직렬화를 위한 Person 클래스 정의
// -> 주의! 직렬화 대상이 되는 클래스를 정의할 때 반드시 Serializable 인터페이스 상속이 필수이다.
// 	  Serializable 인터페이스는 별도의 추상메서드가 없는 단순한 마커(Marker) 용도의 인터페이스이다.
class Person implements Serializable {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}