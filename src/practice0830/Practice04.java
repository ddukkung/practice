package practice0830;
import java.util.*;

public class Practice04 {

	public static void main(String[] args) {

		/*
		 *  Map 계열
		 */
		
		Map map = new HashMap();
		
		
		// Object put(Obejct key, Object value) : key에 해당하는 위치에 value 저장
		map.put(1, "JAVA"); // 정수 1에 해당하는 키에 문자열 "JAVA" 값 저장
		map.put(2, "JSP"); // 정수 2에 해당하는 키에 문자열 "JSP" 값 저장
		map.put(3, "Anroid"); // 정수 3에 해당하는 키에 문자열 "Android" 값 저장
		
		System.out.println("map 객체의 모든 키와 값 출력 : " + map); // toString() 생략됨
		
		// 중복되는 키를 사용하여 다른 값을 저장하는 경우
//		map.put(3, "Oracle"); // 정수 3에 해당되는 키에 문자열 "Oracle" 값 저장됨
		// -> 기존에 3번 키가 존재하므로 "Android" 값을 제거하고, "Oracle" 깂 자징(덮어쓰기)
		//	  이때, 제거되는 값 "Android"가 Object 타입으로 리턴됨
		
		System.out.println("3번 키에 Oracle 문자열 저장 : " + map.put(3, "Oracle"));
		System.out.println("map 객체의 모든 키와 값 출력 : " + map);
		
		// 새로운 키에 중복된 값을 저장하는 경우
		map.put(4, "JSP"); // 값은 중복이 가능하므로 저장된다.
		
		System.out.println("map 객체의 모든 키와 값 출력 : " + map); 
		
		// Object get(Object key) ; key에 해당하는 value 리턴
		// -> key가 존재하지 않으면 null 값 리턴됨
		System.out.println("정수 2에 해당하는 키의 데이터 : " + map.get(2)); // JSP
		System.out.println("정수 6에 해당하는 키의 데이터 : " + map.get(6)); // null
		
		// Set keySet() : Map 객체 내의 모든 키 리턴
		// -> Set 타입 변수에 저장하거나 Set 타입 객체 형태로 직접 사용 가능
		System.out.println("map 객체 내의 모든 키 : " + map.keySet());
		
		Set keySet = map.keySet();

		System.out.println("map 객체 내의 모든 키 : " + keySet);
		
		// Collection values() : Map 객체 내의 모든 값 리턴
		// Set 타입 또는 List 타입 등의 변수에 할당 불가능(다운캐스팅도 불가능)
		System.out.println("Map 객체 내의 모든 값 : " + map.values());
		
//		Set values = (Set)map.values(); // 다운캐스팅 시에도 예외 발생
//		List values = (List)map.values(); // 다운캐스팅 시에도 예외 발생
		
		// Set 또는 List 객체 생성 시 파라미터로 전달하여 객체 변환 가능
		Set values = new HashSet(map.values());

		// -> 만약, 중복된 값이 존재할 경우 Set 타입으로 관리하면 중복이 제거되므로 주의
//		List values = new ArrayList(map.values());
		// -> 중복된 값이 존재하더라도 List 타입으로 관리하면 중복이 유지된다.
		
		System.out.println("map 객체 내의 모든 값 : " + values);
		// Set은 중복된 값을 허용하지 않으므로 원래 map 객체에 있던 중복된 값은 JSP 두 값 중 하나가 제거된 JAVA, JSP, Oracle이 출력된다.
		
		// Set enrtySet() : 키와 값을 한 쌍으로 갖는 Map.Entry 객체를 리턴
		// -> 키와 값의 한 쌍이 다른 키와 값의 한 쌍과 중복될 수 없으므로 Set 타입으로 관리됨
		Set entrySet = map.entrySet();
		System.out.println(entrySet);
		
		System.out.println("map 객체가 비어있는가? : " + map.isEmpty());
		System.out.println("map 객체에 저장된 요소 개수 : " + map.size());
		
		// 요소를 제거하는 remove() 메서드는 2가지로 제공된다.
		// Object remove(Object key) : key에 해당하는 요소(key, value)를 제거
		System.out.println("4번 key에 해당하는 요소 제거 : " + map.remove(4));
		System.out.println("map 객체의 모든 키와 값 출력 : " + map); // 키와 값 제거됨
		
		// 만약, 존재하지 않는 키를 지정할 경우 null 값이 리턴됨
		System.out.println("4번 key에 해당하는 요소 제거 : " + map.remove(6));
		
		// boolean remove(Object key, Object value) : key와 value 모두 일치하는 요소 제거
		System.out.println("3번 key의 Oracle 값에 해당하는 요소 제거 : " + map.remove(3, "Oracle"));
		System.out.println("map 객체의 모든 키와 값 출력 : " + map);
		
		// 만약, 키와 값이 일치하지 않거나 존재하지 않는 키를 지정할 경우 false 리턴
		System.out.println("3번 key의 Oracle 값에 해당하는 요소 제거 : " + map.remove(3, "Oracle"));
		System.out.println("2번 key의 JAVA 값에 해당하는 요소 제거 : " + map.remove(2, "JAVA"));
		
		System.out.println("----------------------------------------------------------------------");
		
		/*
		 *  HashMap 객체(map2) 생성 후 다음 요소 추가
		 *  KEY					VALUE
		 *  "010-1234-5678"		"홍길동"
		 *  "010-2222-3333"		"이순신"
		 *  "010-4444-5555"		"강감찬"
		 *  
		 */
		
		Map map2 = new HashMap();
		
		map2.put("010-1234-5678", "홍길동");
		map2.put("010-2222-3333", "이순신");
		map2.put("010-4444-5555", "강감찬");
		
		System.out.println(map2);
		
		// Map 객체를 반복하는 방법
		// 1. 향상된 for문을 사용하여 접근
		// ex) 이름 : 홍길동, 전화번호 : 010-1234-5678
		
		Set keySet2 = map2.keySet();
		
		for (Object phone : keySet2) {
			Object name = map2.get(phone);
			System.out.println("이름 : " + name + ", 핸드폰 : " + phone);
		}

		
		
	}

}
