package practice0910;
import java.awt.event.*;

import javax.swing.*;

public class Practice06 {
	
		public Practice06() {
			showFrame();
		}
		
		public void showFrame() {
			
			JFrame f = new JFrame("이벤트 처리-1");
			f.setBounds(600, 400, 300, 200);
//			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// 이벤트 처리 1단계. 리스너를 구현한 핸들러 클래스를 정의하여 사용
			// 현재 프레임(JFrame 객체)에 WindowListener 구현체 연결
			// 1. 핸들러 객체(WindowListener 구현체) 생성
			MyWindowListener listener = new MyWindowListener();
			
			// 2. 이벤트 연결을 위한 대상 객체(JFrame)의 addXXXListener() 메서드를 호출하여
			//	  파라미터로 핸들러 객체를 전달 -> 대상과 이벤트 리스너 연결이 완료됨
			f.addWindowListener(listener);
			f.setVisible(true);
			
			// ------------------------------------------------------------------------------
			
			// JFrame 객체 생성(300, 300) 후 MyWindowListener 리스너 연결
			JFrame f2 = new JFrame("이벤트 처리-1");
			MyWindowListener listener2 = new MyWindowListener();
			
			f2.setBounds(500, 500, 300, 300);
			f2.addWindowListener(listener2);
			f2.setVisible(true);
			
		}

	public static void main(String[] args) {
		
		/*
		 *  < 이벤트 처리 5단계 >
		 *  1. 리스너 인터페이스를 구현하는 구현체 클래스(핸들러)를 정의
		 *     -> 이벤트 발생 시 수행할 동작을 구현체 내부의 메서드에 기술하고
		 *        리스너 연결 시 구현체 객체를 생성하여 addXXXListner() 메서드 파라미터로 전달
		 */
		
		new Practice06();
		

	}

}

// 이벤트 처리 1단계
// 이벤트 처리를 위해 리스너 인터페이스를 구현하는 핸들러 클래스를 별도로 정의
// 윈도우(프레임)에 대한 이벤트 처리 담당 리스너 : WindowListener 이터페이스
class MyWindowListener implements WindowListener {
	// WindowListener 인터페이스를 구현하는 MyWindowListener 클래스 정의
	// -> 추상 메서드 오버라이딩 필수
	// -> 각 메서드들은 이벤트가 발생했을 때 해당 이벤트에 맞게 자동으로 호출됨
	//	  따라서, 이벤트 발생 시 처리할 동작을 기술

	@Override
	public void windowOpened(WindowEvent e) {
		// 맨 처음 프로그램이 실행될 때 프레임이 생성되어 표시되면 호출되는 메서드(1회)
		System.out.println("windowOpened");
	}
	
	@Override
	public void windowClosing(WindowEvent arg0) {
		// 맨 마지막 프로그램이 종료될 때 닫기 버튼을 클릭하면 호출되는 메서드
		System.out.println("windowClosing");
		System.exit(0); // 프로그램 종료(0 : 정상 종료, 0 이외의 값 : 비정상 종료)
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// 프로그램 종료 후 호출되는 메서드
		System.out.println("windowClosed");
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// 프레임이 사용자와 상호작용이 가능한 상태가 될 때 호출되는 메서드
		System.out.println("windowActivated");
	}
	
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// 프레임이 사용자와 상호작용이 불가능한 상태가 될 때 호출되는 메서드
		// ex) 다른 프로그램에 가려진 상태가 될 때
		System.out.println("windowDeactivated");
	}
	
	@Override
	public void windowIconified(WindowEvent arg0) {
		// 프레임의 최소화 버튼을 클릭 시 호출되는 메서드
		System.out.println("windowIconified");
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// 프레임의 최소화가 해제될 때 호출되는 메서드
		System.out.println("windowDeiconified");
	}

}
