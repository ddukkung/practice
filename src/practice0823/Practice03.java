package practice0823;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice03 {

	public static void main(String[] args) {

		/*
		 *  Macher 클래스
		 *  
		 *  < 메서드 >
		 *  1) matches() : 원본 문자열이 정규표현식과 일치하는지 판별(전체 일치 검사)
		 *  2) lookingAt() : 원본 문자열 시작이 정규표현식과 일치하는지 판별(시작 일치 검사)
		 *  3) fine() : 원본 문자열 내에 정규표현식이 포함되는지 판별(부분 일치 검사)
		 *  4) reset() : Matcher 객체 정보를 리셋하여 인덱스 번호를 0으로 초기화
		 *     -> 2번, 3번 메서드 수행 후에는 검사에 사용되는 인덱스 번호가 검사에 사용된 부분 이후로 
		 *        변경되므로 다른 검사 수행 시 영향이 있을 수 있다.
		 *        또는, find() 메서드의 경우 파라미터로 시작인덱스 지정이 가능하므로 find(0) 형태로
		 *        0번 인덱스부터 검사를 수행하도록 설정할 수도 있음.
		 *  5) replaceFirst() : 문자열 중 정규표현식과 처음 일치하는 문자열을 치환
		 *  6) replaceAll() : 문자열 중 정규표현식과 일치하는 모든 문자열을 치환
		 *  -> String 클래스에도 동일한 메서드가 존재하며 동일한 원리로 동작하므로 패턴 문자열을 
		 *     파라미터로 전달하여 변환 대상에 대한 복합 규칙 설정 가능
		 *     
		 */
		
		String source = "Java and Javascript has no relation"; // 검사할 문자열
		String regex = "Java"; // 패턴 문자열
		
		// 1. 정규표현식 패턴 문자열을 Pattern 객체로 변환
		Pattern pattern = Pattern.compile(regex);
		
		// 2. 정규표현식이 포함된 Pattern 객체의 matcher() 메서드를 호출하여
		//    원본 문자열을 파라미터로 전달한 뒤 Matcher 타입 객체로 리턴 받음
		Matcher matcher = pattern.matcher(source);
		
		// 3. Matcher 객체의 다양한 메서드를 통해 정규표현식 검사 수행
		System.out.println("문자열이 정규표현식에 완전히 부합되는가? : " + matcher.matches());
		// -> 정규표현식 "Java"는 원본 문자열과 완전히 일치하지 않으므로 false 리턴
		
		System.out.println("문자열이 정규표현식으로 시작되는가? : " + matcher.lookingAt());
		// -> 정규표현식이 "Java" 문자열이 원본 문자열 시작과 같으므로 true 리턴
		
		System.out.println("문자열이 정규표현식을 포함하는가? : " + matcher.find());
		// 주의사항! 만약 lookingAt(), find() 메서드 등을 사용하여 부분 검색 수행 후에는
		// 시작 인덱스 번호가 변경되므로 인덱스 리셋이 필요하다 -> reset() 메서드 호출 필요 
		
		System.out.println("문자열이 정규표현식을 포함하는가? : " + matcher.find());
		// -> 이미 앞에서 "Java" 문자열을 검사했으므로 해당 위치 뒷부분부터(13번 인덱스) 검사됨
		//	  따라서, 뒷부분 문자열에 "Java"가 존재하지 않으므로 false가 리턴됨
		
//		matcher.reset(); // reset() 메서드를 통해 검색할 인덱스를 초기화
//		System.out.println("문자열이 정규표현식을 포함하는가? : " + matcher.find());
		// -> 처음부터 "Java" 문자열이 원본 문자열에 포함되었는지 확인하므로 true 리턴
		
		// 만약, reset() 메서드를 호출하지 않을 경우에는
		// find() 메서드 파라미터로 검색할 인덱스 번호를 지정해도 됨
		System.out.println("문자열이 정규표현식을 포함하는가? : " + matcher.find(0));
		
		System.out.println("Java -> 자바 replaceFirst() : " + matcher.replaceFirst("자바"));
		// -> 처음 일치하는 Java만 자바로 치환
		System.out.println("Java -> 자바 replaceFirst() : " + matcher.replaceAll("자바"));
		// -> 일치하는 모든 Java를 자바로 치환
		
	}

}
