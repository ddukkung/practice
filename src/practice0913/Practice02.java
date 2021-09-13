package practice0913;
import java.awt.event.*;

import javax.swing.*;

public class Practice02 {
	
	/*
	 *  < 이벤트 처리 5단계 >
	 *  4. 익명 내부클래스(Anonymous Inner Class) 형태로 정의
	 *  - 리스터 인터페이스 또는 어댑터 클래스를 구현하는 핸들러를 별도로 정의하지 않고
	 *    해당 리스너 또는 어댑터의 이름을 그대로 사용하여 변수 선언 및 인스턴스 생성과 동시에
	 *    추상메서드 구현까지 한꺼번에 수행하는 방법
	 *  - 개발자가 별도의 핸들러 이름을 부여하지 않으므로 이름이 없다는 뜻의 익명 클래스라는 의미가 붙음
	 *  - 3단계 위치와 동일하며 클래스 정의 방법만 달라짐
	 *  
	 *  < 기본 문법 >
	 *  리스너이름 변수명 = new 리스너이름() {
	 *  		// 추상메서드 구현
	 *  };
	 */
	
	public Practice02() {
		showFrame();
	}
	
	public void showFrame() {
		
		JFrame f = new JFrame("이벤트처리-4");
		f.setBounds(600, 400, 300, 200);
		
		// 이벤트 처리 4단계
		// 익명 내부 클래스(Anonymous Inner Class) 형태로 정의 - 로컬 내부 클래스 형태로 정의
		// -> 로컬 변수와 동일한 범위에서만 접근 가능
//		WindowAdapter listener = new WindowAdapter() {
//
//			@Override
//			public void windowClosing(WindowEvent arg0) {
//				System.out.println("windowClosing");
//				System.exit(0);
//			}
//			
//		};
		
		// 현재 프레임(JFrame 객체)에 WindowAdapter 구현체 연결
		// -> 이미 익명 클래스 형태로 정의 시 객체 생성까지 끝났으므로 바로 연결 가능
		// 1. 이벤트 연결을 위한 대상 객체(JFrame)의 addXXXListener() 메서드를 호출하여 
		//	  파라미터로 핸들러 객체를 전달 -> 대상과 이벤트 리스너 연결이 완료됨
		f.addWindowListener(listener);
		
		f.setVisible(true);
		
	}
	
	// 이벤트 처리 4단계
	// 익명 내부클래스(Anonymous Inner Class) 형태로 정의 - 멤버 내부 클래스 형태로 정의
	// -> WindowAdapter 또는 WindowListener 이름을 그대로 사용하여
	//    참조 변수 선언, 객체 생성, 클래스 바디 내의 추상메서드 정의까지 한꺼번에 수행
	// -> 인스턴스 멤버와 동일한 위치에 정의하므로 인스턴스 내부 클래스라고도 함
	// -> 인스턴스 내의 여러 메서드에서 공유 가능
	WindowAdapter listener = new WindowAdapter() {

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("windowClosing");
			System.exit(0);
		}
	
	};
	
	// WindowListener 인터페이스를 익명 내부 클래스 형태로 정의할 경우
	WindowListener listener2 = new WindowListener() {
		
		@Override
		public void windowOpened(WindowEvent e) {
		}
		
		@Override
		public void windowIconified(WindowEvent e) {
		}
		
		@Override
		public void windowDeiconified(WindowEvent e) {
		}
		
		@Override
		public void windowDeactivated(WindowEvent e) {
		}
		
		@Override
		public void windowClosing(WindowEvent e) {
		}
		
		@Override
		public void windowClosed(WindowEvent e) {
		}
		
		@Override
		public void windowActivated(WindowEvent e) {
		}
	};

	public static void main(String[] args) {
		
		new Practice02();

	}

}
