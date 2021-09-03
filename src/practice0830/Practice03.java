package practice0830;

import java.util.*;

public class Practice03 {

	public static void main(String[] args) {

		/*
		 *  반복자(Iterator)
		 *  
		 */
		
		List list = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6));
		
		// Iterator 활용
		// 1. List 객체의 iterator() 메서드를 호출하여 Iterator 객체 리턴받기
		Iterator iterator = list.iterator();
		
		// 2. while문의 조건식으로 Iterator 객체의 hasNext() 메서드 결과를 전달
		// -> 다음 요소가 존재할 경우 true가 리턴되므로, 다음 요소가 존재할 동안 반복
		while(iterator.hasNext()) {
			// 3. 반복문 내에서 Iterator 객체의 next() 메서드를 호출하여 다음 요소를 리턴받아 사용
			Object o = iterator.next(); // 리턴타입이 Object이므로 Object 변수에 리턴받기
			System.out.println(o);
		}
		
		System.out.println("-------------------------------------------------------");
		
		// Set 객체 생성하여 Iterator 활용하여 출력
		Set set = new HashSet(list);
		Iterator iterator2 = set.iterator();
		
		while(iterator2.hasNext()) {
			Object o = iterator2.next();
			System.out.println(o);
		}
		// -> Set 또는 List 객체 접근 방법이 완전히 동일하며
		//	  iterator() 메서드 호출 주체만 달라지므로 통일된 접근 방법이 제공됨
		
		System.out.println("-------------------------------------------------------");
		
		printElements(list);
		
		System.out.println("-------------------------------------------------------");
		
		printElements(set);
		
		
	} // main() 메서드 끝
	
	// Set 또는 List 객체를 전달받아 내부의 모든 요소를 출력하는 메서드 정의
	// -> Set과 List 객체를 공통으로 전달 받으려면 공통으로 상속받은 Collection 인터페이스로 선언
	public static void printElements(Collection c) {
		Iterator iterator = c.iterator();
		
		while(iterator.hasNext()) {
			Object o = iterator.next();
			System.out.println(o);
		}
	}
	

}
