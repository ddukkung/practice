package practice0904;
import java.util.*;

public class Practice04 {

	public static void main(String[] args) {
		
		/*
		 *  Queue
		 */
		
		Queue q = new LinkedList();
		
		// boolean offer(Object o) : 요소 o를 추가(추가 결과를 boolean 타입으로 리턴)
		System.out.println(q.offer("1 - Ex.java"));
		q.offer("2 - main.jsp");
		q.offer("3 - a.txt");
		
		System.out.println("모든 Queue 객체 출력 : " + q); // toString() 생략됨
		
		// Object peek() : Queue의 맨 끝의 요소(가장 먼저 추가된 요소)를 리턴(요소 제거X)
		System.out.println("맨 처음 추가된 요소 : " + q.peek());
		System.out.println("맨 처음 추가된 요소 : " + q.peek());
		
		// Object poll() : Queue의 맨 끝의 요소(가장 먼저 추가된 요소)를 리턴(요소 제거O)
		System.out.println("맨 처음 추가된 요소 : " + q.poll());
		System.out.println("맨 처음 추가된 요소 : " + q.poll());

	}

}
