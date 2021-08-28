package practice0826;
import java.util.ArrayList;
import java.util.List;

public class Practice03 {

	public static void main(String[] args) {

		/*
		 *  컬렉션 프레임워크(Collection Framework)
		 *  2. List 계열
		 *  
		 */
		
		List list = new ArrayList(); // ArrayList -> List 업캐스팅 가능
		
		list.add("ONE");
		list.add(2);
		list.add(3.14);
		
		
		System.out.println("list 객체가 비어 있는가? : " + list.isEmpty());
		System.out.println("list 객체에 저장된 요소의 개수는? : " + list.size());
		System.out.println("list 객체의 모든 요소 출력 : " + list); // toString() 생략 가능
		
		// list 객체의 중복 허용 확인
		System.out.println("중복 데이터 3.14 추가가 가능한가? : " + list.add(3.14));
		
		System.out.println("list 객체가 비어 있는가? : " + list.isEmpty());
		System.out.println("list 객체에 저장된 요소의 개수는? : " + list.size());
		System.out.println("list 객체의 모든 요소 출력 : " + list); // toString() 생략 가능
		
		// add(int index, Object e) : 해당 인덱스에 데이터가 삽입됨(끼워넣기)
		// 기존 2번 인덱스의 데이터를 밀어나고 정수 3을 2번 인덱스에 삽입
		list.add(2, 3);
		System.out.println("list 객체의 모든 요소 출력 : " + list);
		
		// Object get(int index) : 특정 인덱스의 요소 리턴
		System.out.println("3번 인덱스 요소 : " + list.get(3));
		// 만약, 존재하지 않는 인덱스 번호를 지정할 경우 예외(오류) 발생
//		System.out.println("5번 인덱스 요소 : " + list.get(5)); // 오류 발생
		// -> java.lang.IndexOutOfBoundsException: Index: 5, Size: 5
		
		System.out.println("-------------------------------------------------");
		
		// List 객체의 모든 요소 꺼내기
		// 1. 향상된 for문 사용(Set 계열 반복 방법과 동일함)
		
		for (Object o : list) {
			System.out.println(o);
		}
		
		System.out.println("-------------------------------------------------");
		
		// 2. 일반 for문을 사용하여 list 객채의 요소 출력
		// -> get() 메서드로 인덱스를 통해 접근
		// -> 특정 인덱스 범위 반복이 가능하다는 장점(배열 접근 방법과 동일함)
		// -> 0번 인덱스부터 list 크기(개수)까지 반복
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------------------------------------------");
		
		// Object remove(int index) : index에 해당하는 요소를 제거(제거되는 요소가 리턴됨)
		// boolean remove(Object o) : o에 해당하는 요소 제거(제거될 경우 true가 리턴됨)
//		System.out.println("인덱스를 사용하여 정수 2(인덱스 1) 삭제 : " + list.remove(2));
//		System.out.println("정수 2를 지정하여 해당 요소 직접 삭제 : " + list.remove(2));
		// -> 정수 2를 지정하는 것이 아닌 2번 인덱스 지정으로 취급됨
		//	  따라서, 정수 2를 지정하여 삭제해야 하는 경우 Object 타입으로 형변환 필요
		System.out.println("정수 2를 지정하여 해당 요소 직접 삭제 : " + list.remove((Object)2));
		System.out.println("list 객체의 모든 요소 출력 : " + list);
		
		// Object set(int index, Object o) : 지정된 인덱스의 데이터를 교체(덮어쓰기)
		System.out.println("3번 인덱스 요소를 문자 '4'로 교체 : " + list.set(3, 4));
		System.out.println("list 객체의 모든 요소 출력 : " + list);
		
		// List subList(int fromIndex, int toIndex) : 부분 리스트 추출
		// -> 시작 인덱스부터 끝 인덱스 -1까지 추출됨
		System.out.println("1번 인덱스부터 3번 인덱스보다 작은 부분 리스트 추출 : " + list.subList(1, 3));
		
		System.out.println("-------------------------------------------------");
		
		// Object[] toArray() : List 객체의 모든 요소를 Object[] 배열로 리턴
		Object[] arr = list.toArray();
		
		for (Object o : arr) {
			
			System.out.println(o);
		}
		
		System.out.println("-------------------------------------------------");
		
		list.add(3);
		System.out.println("list 객체의 모든 요소 출력 : " + list);
		
		// int indexOf(Object o) : 요소 o의 인덱스 리턴(첫 인덱스부터 탐색)
		System.out.println("3이라는 요소의 인덱스 번호 : " + list.indexOf(3)); // 1
		// int lastIndexOf(Object o) : 요소 o의 인덱스 리턴(끝 인덱스부터 탐색)
		System.out.println("3이라는 요소의 인덱스 번호 : " + list.lastIndexOf(3)); // 4
		
		// 존재하지 않는 요소를 지정할 경우 인덱스 번호 -1 리턴(데이터가 없다는 뜻)
		System.out.println("10이라는 요소의 인덱스 번호 : " + list.indexOf(10)); // -1
		
		// boolean contains(Object o) : 요소 o의 존재 여부 리턴
		System.out.println("실수 3.14가 존재하는가? : " + list.contains(3.14)); // true
		System.out.println("실수 5.0이 존재하는가? : " + list.contains(5.0)); // false
		
		 // list 객체의 요소를 사용하여 list2 객체 초기화
		List list2 = new ArrayList(list);
		
		System.out.println("list2 객체의 모든 요소 출력 : " + list2);	
		
		System.out.println("list와 list2 객체는 동일한 주소값을 가지고 있는가? : " + (list == list2));
		
		System.out.println("list와 list2 객체는 요소가 동일한 객체인가? : " + list2.equals(list));
		
	}

}
