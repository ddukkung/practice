package practice0826;
import java.util.*;

public class Practice01 {

	public static void main(String[] args) {

		/*
		 *  컬렉션 프레임워크(Collection Framework)
		 *  
		 *  1. Set 계열
		 */
		
		// HashSet 객체 생성
		Set set = new HashSet(); // Set은 인터페이스이므로 인스턴스를 만들 수 없다. 
		// 그러므로 HashSet -> Set 업캐스팅하여 사용
		// -> 대부분의 메서드를 부모 인터페이스인 Set 인터페이스가 보유 중이므로
		//	  업캐스팅 상태에서도 대부분의 기능을 사용하는 데 문제가 없음
		
		// Set 객체의 메서드
		// boolean isEmpty() : 컬렉션 객체가 비어있는지 판별
		System.out.println("set 객체는 비어있는가? : " + set.isEmpty());
		
		// int size() : 컬렉션 객체 내의 요소(데이터)의 개수를 리턴
		System.out.println("set 객체의 요소 개수 : " + set.size());
		
		// toString() : 컬렉션 객체 내의 모든 요소를 문자열로 리턴 
		System.out.println("set 객체의 모든 요소 : " + set.toString());
		System.out.println("set 객체의 모든 요소 : " + set); 
		// toString()이 오버라이딩 되어 있기 때문에 변수명만 쳐도 toString()을 붙인 것과 같은 결과가 나온다.(toString() 생략 가능)
		
		// boolean add(Object e) : 요소 1개(e)를 컬렉션에 추가 후 추가 성공 여부 리턴
		// -> 파라미터가 Object 타입이므로 모든 데이터타입 추가 가능(기본형, 객체 모두 가능)
		// -> 리턴타입이 boolean 이므로 요소 추가 성공 여부 리턴됨(중복 데이터는 추가 X)
		System.out.println("set 객체에 데이터가 추가 되었는가? : " + set.add(3));
		set.add('육');
		set.add(3.14);
		set.add("Two");
		
		System.out.println("set 객체는 비어있는가? : " + set.isEmpty());
		System.out.println("set 객체의 요소 개수 : " + set.size());
		System.out.println("set 객체의 모든 요소 : " + set); 
		
		System.out.println("--------------------------------------------------------------");
		
		// boolean contains(Object o) : 특정 요소가 컬렉션 객체에 포함되어 있는지 판별
		System.out.println("set 객체에 3.14가 포함되어 있는가? : " + set.contains(3.14));
		
		// boolean remove(Object o) : 특정 요소를 컬렉션 객체에서 제거
		// -> 삭제 성공 시 true, 실패 시 false 값 리턴
		System.out.println("set 객체에서 육이 제거되었는가? : " + set.remove('육'));
		
		// Object toArray() : 컬렉션 내의 모든 요소를 갖는 배열을 생성하여 리턴
		Object[] objArr = set.toArray();
		System.out.println(Arrays.toString(objArr));
		
		// boolean addAll(Collection c) : 컬렉션 내의 모든 요소를 다른 컬렉션에 한꺼번에 추가
		// HashSet 객체(set2) 생성
		Set set2 = new HashSet();
		
		set2.add(9);
		set2.add("eight");
		set2.add(3.14);

		System.out.println("set2에 set의 모든 요소 추가 : " + set2.addAll(set));
		// -> 중복된 요소가 존재하지만 중복되지 않는 요소 추가가 가능하므로 true 리턴됨
		
		System.out.println("set2의 모든 요소 : " + set2);
		
		System.out.println("set2에 set의 모든 요소 추가 : " + set2.addAll(set));
		// -> 추가할 모든 요소가 이미 존재하므로 추가가 불가능하기 때문에 false가 리턴됨
		
		// void clear() : 컬렉션 내의 모든 요소 초기화(제거)
		set2.clear(); // 리턴타입이 void이기 때문에 출력문에 찍어도 나오는 게 없다.
		System.out.println("set2의 모든 요소 : " + set2);
		
		// HashSet 등 컬렉션 객체 생성 시 파라미터로 다른 컬렉션 객체를 전달하면
		// 해당 컬렉션 객체의 요소를 갖는 새로운 컬렉션 객체가 생성됨
		Set set3 = new HashSet(set);

		System.out.println("set과 set3의 주소는 같은가? : " + (set == set3));
		// -> 데이터가 저장된 주소를 공유하는 것이 아닌 실제 요소를 복사하여 전달하므로
		//	  저장된 요소는 갖지만 주소는 다르게 생성됨

		// boolean equals(Collection c) : 컬렉션 요소가 동일한지 판별
		System.out.println("set과 set3은 동일한 데이터를 갖고 있는가? : " + set.equals(set3));
		
		System.out.println("--------------------------------------------------------------");
		
		// TreeSet 객체를 활용하면 같은 타입 데이터가 저장된 Set 객체 정렬 가능
		// -> 주의! 반드시 같은 타입 데이터만 저장해야 한다
		// -> 수치 데이터는 수치의 크기 순으로 오름차순 정렬되며(0 -> 9)
		//	  문자 데이터는 문자 코드 값의 크기 순으로 오름차순 정렬된다.
		Set set4 = new HashSet();
		
		set4.add(2);
		set4.add(999);
		set4.add(100);
		set4.add(500);
		set4.add(99);
		set4.add(35);
		
		System.out.println("set4의 모든 요소 : " + set4);
		// [2, 99, 35, 100, 500, 999] -> 결과가 다를 수 있음(비정렬)		
		
		Set set5 = new TreeSet(set4); // 기존 set4의 요소를 그대로 set5로 추가(자동 정렬됨)
		
		System.out.println("set5의 모든 요소 : " + set5); // [2, 35, 99, 100, 500, 999] -> 항상 결과가 같음(정렬)
		
		System.out.println("--------------------------------------------------------------");
		
		/*
		 *  Set 계열의 모든 요소를 반복문을 통해 출력
		 *  -> 인덱스 사용이 불가능하므로 일반 for문을 통해 접근 불가능
		 *  -> 대신, 향상된 for문을 통해 저장된 요소를 차례대로 접근 가능
		 *  
		 *  < 기본 문법 > 
		 *  for( 요소를 꺼내서 저장할 변수 : 컬렉션객체) {
		 *  -> 저장할 변수는 모든 데이터를 저장할 수 있는 Object 타입으로 선언해야 한다.
		 *  }
		 *  
		 *  for(Object o : 컬렉션객체) {}
		 */
		
		// set5에 저장되어 있는 요소를 향상된 for문을 이용해서 출력
		for (Object o : set5) {
			System.out.println(o);
		}
		
		
	}

}
