package practice0910;
import java.awt.event.*;

import javax.swing.*;

public class Practice08 {
	
		public Practice08() {
			showFrame();
		}
		
		public void showFrame() {
			JFrame f = new JFrame("이벤트처리-2");
			f.setBounds(600, 400, 300, 200);
			
			// 이벤트 처리 2단계. 어댑터 클래스를 구현한 핸들러 클래스 정의하여 사용
			// 현재 프레임(JFrame 객체)에 WindowAdapter 구현체 연결
			// 1. 핸들러 객체(WindowAdapter 구현체) 생성
			MyWindowAdapter listener = new MyWindowAdapter();
			
			// 2. 이벤트 연결을 위한 대상 객체(JFrame)의 accXXXListener() 메서드를 호출하여
			//	  파라미터로 핸들러 객체를 전달 -> 대상과 이벤트 리스너 연결이 완료됨
			f.addWindowListener(listener);
			
			f.setVisible(true);
			
		}

	public static void main(String[] args) {
		
		/*
		 *  < 이벤트 처리 5단계 >
		 *  2. 리스너 인터페이스 대신 어댑터 클래스 사용
		 *     - 추상메서드가 2개 이상인 인터페이스를 구현할 경우 불필요한 메서드까지 구현해야하므로 코드가 길어짐
		 *     - 리스너 인터페이스를 미리 구현해놓은 어댑터 클래스를 상속받는 핸들러에서 
		 *       원하는 메서드만 선택하여 오버라이딩이 가능하므로 코드가 간결해짐
		 *     - XXXListener 인터페이스에 대응하는 XXXAdapter 클래스가 제공됨
		 *       단, 추상메서드가 하나뿐인 인터페이스는 어댑터 클래스가 제공되지 않음
		 *       ex) ActionListener 인터페이스는 추상메서드가 1개이므로 ActionAdapter 제공X
		 */
		
		new Practice08();

	}

}

// 이벤트 처리 2단계
// 이벤트 처리를 위해 리스너 인터페이스 대신 어댑터 클래스를 구현하는 핸들러 클래스를 별도로 정의
// 윈도우(프레임)에 대한 이벤트 처리 담당 리스너 : WindowListener 인터페이스
// -> 이에 대한 어댑터 클래스 : WindowAdapter 클래스
class MyWindowAdapter extends WindowAdapter {

	// 상속받은 슈퍼클래스의 메서드 중 필요한 메서드만 선택적 오버라이딩
	// -> windowClosing() 메서드 오버라이딩
	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("windowClosing");
		System.exit(0); // setDefaultCloseOperation() 메서드로 종료를 지정하지 않아도 프로그램이 계속 실행되지 않고 종료된다.
	}
	
}
