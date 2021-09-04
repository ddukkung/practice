package practice0904;
import java.util.*;

public class Practice03 {

	public static void main(String[] args) {
		
		// Stack
		Stack stack = new Stack();
		
		// Object push(Obejct item) : 데이터(item)를 추가 -> 추가되는 데이터를 리턴
		System.out.println(stack.push("1 - www.itwillbs.co.kr"));
		stack.push("2 - www.naver.com");
		stack.push("3 - www.youtube.com");
		
		System.out.println("모든 요소 출력 : " + stack); // toString() 메서드 생략 가능
		
		// Object peek() : 스택의 맨 위의 요소(마지막에 추가된 요소)를 리턴(요소 제거X)
		System.out.println("맨 위(Top)의 요소 출력(peek) : " + stack.peek());
		System.out.println("맨 위(Top)의 요소 출력(peek) : " + stack.peek());
		
		System.out.println("------------------------------------------------------------------------");
		
		// Object pop() : 스택의 맨 위의 요소(마지막에 추가된 요소)를 리턴(요소 제거O)
		
		System.out.println("맨 위(Top)의 요소 출력(pop) : " + stack.pop()); // 맨 위(Top)의 요소 출력 : 3 - www.youtube.com
		System.out.println("맨 위(Top)의 요소 출력(pop) : " + stack.pop()); // 맨 위(Top)의 요소 출력 : 2 - www.naver.com
		
		

	}

}
