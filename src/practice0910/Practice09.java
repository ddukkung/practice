package practice0910;
import java.awt.event.*;

import javax.swing.*;

public class Practice09 {
	
		
	public Practice09() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("이벤트처리-3");
		f.setBounds(600, 400, 300, 200);
		
		// 이벤트 처리 3단계
		// 내부클래스(Inner Class) 형태로 정의 - 로컬 내부 클래스 형태로 정의
		// -> 로컬변수와 동일한 범위에서만 접근 가능
		
		// 현재 프레임(JFrame 객체)에 WindoAdapter 구현체 연결
		// 1. 핸들러 객체(WindowAdapter 구현체) 생성
		class MyLocalWindowAdapter extends WindowAdapter {

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing");
				System.exit(0);
			}
			
		}
		
		// 2. 이벤트 연결을 위한 대상 객체(JFrame 객체)의 addXXXListener(); 메서드를 호출하여
		//	  파라미터로 핸들러 객체를 전달 -> 대상과 이벤트 리스너 연결이 완료됨
		MyLocalWindowAdapter listener = new MyLocalWindowAdapter();
//		f.addWindowListener(new MyLocalWindowAdapter());
		// 흠 그냥 인스턴스 안 만들고 이렇게 해도 될 것 같은데 인스턴스 만드는 게 나은 건가
		
		f.addWindowListener(listener);
		
		f.setVisible(true);
		
	}
	
	// 이벤트 처리 3단계
	// 내부클래스(Inner Class) 형태로 정의 - 멤버 내부 클래스 형태로 정의
	// -> 인스턴스 멤버와 동일한 정의하므로 인스턴스 내부 클래스라고도 한다.
	// -> 인스턴스 내의 여러 메서드에서 공유 가능
	public void showFrame2() {
		// 메서드가 달라지면 로컬 내부클래스는 접근이 불가능하므로 
		// 여러 메서드에서 하나의 리스너를 공유하려면 멤버 내부클래스 형태로 정의해야 한다.
//		MyLocalWindowAdapter listener; // 접근 불가
		
		MyMemberWindowAdapter listener; // 접근 가능
		
	}
	
	class MyMemberWindowAdapter extends WindowAdapter {
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("windowClosing");
			System.exit(0);
		}
		
	}
		

	
	public static void main(String[] args) {
		
		/*
		 *  < 이벤트 처리 5단계 >
		 *  3. 내부클래스(Inner Class) 형태로 정의
		 *  리스너 인터페이스 또는 어댑터 클래스를 구현 시 내부 클래스 형태로 구현하여 사용
		 *  -> 이벤트 리스너 구현체(핸들러 클래스)는 보통 GUI 클래스에서만 사용됨(= 전용 클래스)
		 *     따라서, 별도의 클래스로 외부에 정의하기보다는 내부클래스 형태로 정의해서 사용
		 *  -> 외부에 정의하는 방법과 클래스 모양은 동일하나 클래스 정의 위치만 달라짐
		 *  
		 *  [ 위치에 따른 차이점 ]
		 *  1) 멤버 레벨에 정의하는 멤버 내부 클래스(인스턴스 내부 클래스)
		 *     -> 멤버변수의 성격과 동일한 클래스가 됨(= 접근 범위가 멤버변수와 동일해짐)
		 *  
		 *  2) 메서드 내부에 정의하는 로컬 내부 클래스
		 *     -> 로컬변수의 성격과 동일한 클래스가 됨(= 접근 범위가 로컬변수와 동일해짐)
		 */
		
		new Practice09();

	}

}
