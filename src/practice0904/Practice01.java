package practice0904;
import java.util.*;
import java.util.Map.*;


public class Practice01 {

	public static void main(String[] args) {
		
		/*
		 *  Map 계열
		 *  
		 */
		
		/*
		 *  HashMap 객체(map) 생성 후 다음 요소 추가
		 *  KEY					VALUE
		 *  "010-1234-5678"		"홍길동"
		 *  "010-2222-3333"		"이순신"
		 *  "010-4444-5555"		"강감찬"
		 *  
		 */
		Map map = new HashMap();
		
		map.put("010-1234-5678", "홍길동");
		map.put("010-2222-3333", "이순신");
		map.put("010-4444-5555", "강감찬");
		
		System.out.println(map);
		
		// Map 객체 반복하는 방법
		// 1. Iterator(반복자) 사용
		// -> Map 객체의 keySet() 메서드를 호출하여 모든 키를 꺼낸 다음
		//	  해당 key가 저장된 Set 객체의 iterator() 메서드를 호출하여 Iterator 객체를 리턴받아 사용
		Set keySet = map.keySet();  // 모든 키 꺼내기
		
		System.out.println(keySet);
		
		Iterator keyIterator = keySet.iterator(); // Iterator 객체 리턴받기
		
		while(keyIterator.hasNext() ) { // 다음 요소(키)가 존재할 동안 반복
			// 1. 키를 꺼내기 위해서 next() 메서드로 반복자의 키를 하나씩 접근
			// -> 이때, next() 메서드 리턴타입이 Object이므로 상황에 따라 형변환 필요
			String phone = keyIterator.next().toString(); // 다음 요소(키) 꺼내기
			
			// 2. 값을 꺼내기 위해서는 키를 사용하여 get() 메서드를 통해 값에 접근
			// -> 이때, get() 메서드 리턴타입이 Object이므로 상황에 따라 형변환 필요
			String name = map.get(phone).toString();
					
			System.out.println("이름 : " + name + ", 전화번호 : " + phone);
		}
		
		System.out.println("------------------------------------------------------------------");
		
		// Key를 사용하지 않고, Map.Entry 객체를 통한 반복
		Set entrySet = map.entrySet(); // 모든 엔트리 가져오기
		// entrySet() 메서드의 리턴타입이 Set이기 때문에 Set 객체에 받아야 한다.
		
		System.out.println(entrySet);
		
		Iterator entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			// 엔트리 1개 꺼내서 Map.Entry 타입 변수에 저장(형변환 필요)
			Map.Entry entry = (Entry)entryIterator.next();
			
			// 1개 엔트리에서 getXXX() 메서드를 호출하여 각각의 키, 값 가져오기
			String name = entry.getValue().toString();
			String phone = entry.getKey().toString();
			
			System.out.println("이름 : " + name + ", 전화번호 : " + phone);
			
		}
		
		System.out.println("------------------------------------------------------------------");
		
		// boolean containsKey(Object key) : 해당 key의 존재 여부 리턴
		System.out.println("010-1234-5678 전화번호(키)가 존재하는가? : " + map.containsKey("010-1234-5678"));
		System.out.println("010-1234-9999 전화번호(키)가 존재하는가? : " + map.containsKey("010-1234-9999"));
		
		// boolean containsValue(Object value) : 해당 value의 존재 여부 리턴
		System.out.println("홍길동 이름이 존재하는가? : " + map.containsValue("홍길동"));
		
		// void clear() : 모든 키와 값을 초기화
		map.clear();
		
		System.out.println(map);
		
		
		
	}

}
