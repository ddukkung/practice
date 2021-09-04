package practice0904;

import java.util.*;

public class Practice05 {

	public static void main(String[] args) {
		
		/*
		 *  Stack 객체 1개 생성
		 *  -> 웹사이트 주소 5개 추가
		 *     ex) www.itwillbs.co.kr / www.naver.com / www.youtube.com / www.nate.com / www.gmarket.com
		 *  -> 반복문을 사용하여 하나씩 객체를 꺼내서 출력
		 */
		
		Stack stack = new Stack();
		stack.push("www.itwillbs.co.kr");
		stack.push("www.naver.com");
		stack.push("www.youtube.com");
		stack.push("www.nate.com");
		stack.push("www.gmarket.com");
		
//		while(!stack.isEmpty()) { // 내가 한 거
//			System.out.println(stack.pop());
//		}
		
		while(stack.size() > 0) {
			System.out.println(stack.pop());
		}

	}

}
