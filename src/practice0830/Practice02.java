package practice0830;

import java.util.*;

public class Practice02 {

	public static void main(String[] args) {
		
		/*
		 *  트럼프 카드를 구현하여 무작위로 섞은 뒤 
		 *  3명의 플레이어에게 5장 씩 나눠주는 코드 작성
		 *  
		 *  1. ArrayList 객체(cards)를 생성하여 
		 *     기호 ♥, ◆, ♠, ♣와 숫자 2 ~ 10, 영문자 A, J, Q, K를 조합하여 카드 생성
		 *     
		 *  2. 생성된 cards를 무작위로 섞기
		 *  
		 *  3. 섞은 카드를 3명의 플레이어(player1, player2, player3)에게 1장씩 나눠서 총 5장씩 카드를 전달
		 *     -> String[] 배열 생성하여 카드의 데이터를 문자열로 저장
		 *     
		 *  4. 각각의 플레이어가 가지고 있는 카드 출력
		 */
		
		String[] marks = {"♥", "◆", "♠", "♣"};
		String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		List cards = new ArrayList();
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < marks.length; j++) {
				cards.add(marks[j] + numbers[i]);
			}
		}
		
		System.out.println(cards);
		
		Collections.shuffle(cards);
		
		String[] player1 = new String[5];
		String[] player2 = new String[5];
		String[] player3 = new String[5];
		
		for (int i = 0; i < player3.length; i++) {
			player1[i] = cards.remove(0).toString();
			player2[i] = cards.remove(0).toString();
			player3[i] = cards.remove(0).toString();
		}
		
		System.out.println(Arrays.toString(player1));
		System.out.println(Arrays.toString(player2));
		System.out.println(Arrays.toString(player3));
		

	}

}
