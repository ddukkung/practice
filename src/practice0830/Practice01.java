package practice0830;

import java.lang.reflect.Array;
import java.util.*;

public class Practice01 {

	public static void main(String[] args) {

		/*
		 *  컬렉션 프레임워크(Collection Framework)
		 *  2. List 계열
		 */
		
		// Arrays 클래스의 asList() 메서드를 호출하여 데이터를 연속적으로 전달하여 
		// 해당 데이터들을 List 타입 객체로 변환하여 초기화
		List arrayList = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(arrayList);

		
		// 주의! 기본 데이터타입 배열 자체를 asList() 메서드 파라미터로 전달하면
		// 정상적인 변환 불가능(asList() 메서드 파라미터로 클래스타입(Wrapper 클래스) 배열로 전달한다)
//		int[] iArr = {1, 2, 3, 4, 5, 6};
//		List arrayList = Arrays.asList(iArr);
//		System.out.println(arrayList); // 주소값이 출력된다
		// -> 오류는 발생하지 않으나 배열 데이터를 정상적으로 전달 불가능
		
		// -> int타입 대신 클래스타입인 Integer 사용할 경우
		Integer[] iArr = {1, 2, 3, 4, 5, 6};
		List arrayList2 = Arrays.asList(iArr);
		System.out.println(arrayList2); // [1, 2, 3, 4, 5, 6] 데이터가 정상적으로 출력됨
		
		// String 타입은 이미 클래스타입이므로 바로 사용 가능
		String[] strArr = {"1", "2", "3", "4", "5", "6"};
		List arrayList3 = Arrays.asList(strArr);
		System.out.println(arrayList3);
		
		System.out.println("------------------------------------------------------");
		
		// ArrayList(list3) 객체 생성하고, 정수(3, 4, 1, 6, 5, 2) 추가
		List list3 = Arrays.asList(3, 4, 1, 6, 5, 2);
		
		System.out.println("정렬 전 : " + list3);
		
		// Collection 클래스의 static 메서드 sort() 사용 시 List 객체 정렬 가능
		// void sort(List list) : 해당 List 객체의 요소를 정렬(오름차순)
		Collections.sort(list3);
		
		System.out.println("정렬 후 : " + list3);
		
		// Collections 클래스의 static 메서드 shuffle() 사용 시 List 객체 뒤섞기 가능
		// void shuffle(List list) : 해당 List 객체의 요소를 랜덤하게 섞기
		Collections.shuffle(list3);
		
		System.out.println("셔플 후 : " + list3);
		
		// 참고. TreeSet 객체에 저장된 요소를 List 객체로 변환하여 shuffle 하거나
		// HashSet 객체에 저장된 요소를 List 객체로 변환하여 sort 가능
		
		// Set 객체 생성 시 Arrays.asList() 메서드를 통해 List 객체를 생성한 후
		// 해당 객체를 Set 객체 생성자 파라미터로 전달해서 인스턴스 생성(1, 20, 3, 450, 55, 6)
		// Set < - > List 상호 변환 가능
		Set set = new HashSet(Arrays.asList(1, 20, 3, 450, 55, 6));
		System.out.println("Set 객체 : " + set);
		
		List list4 = new ArrayList(set);
		System.out.println("List 객체 : " + list4);
		// Set -> List 변환 후에 Collections.sort() 메서드를 사용하여 정렬 가능
		Collections.sort(list4);
		System.out.println("List 객체 정렬 후 : " + list4);
		
		Set set2 = new TreeSet(set);
		System.out.println("TreeSet 객체 정렬 후 : " + set2);
	}

}
