package practice0910;
import javax.swing.*;

/*
 *  < 창 생성하는 기본 문법 >
 *  - 창(윈도우)을 생성하기 위해서는 Window 계열 객체 생성이 필요하다.
 *    -> 주로 JFrame 클래스를 사용
 *    -> JFrame 객체를 생성하거나 JFrame 클래스를 상속받는 서브클래스를 정의하여 창 생성
 *    ex) class Ex06 extends JFrame {} 또는 JFrame f = new JFrame();
 */
public class Practice02 extends JFrame {
	
	public Practice02() {
		showFrame();
	}
	
	public void showFrame() {
		
		/*
		 *  setDefaultCloseOperation() -> 닫기 버튼 클릭 시 수행할 동작 지정
		 *  JFrame.XXX_ON_CLOSE 상수
		 *  1) EXIT_ON_CLOSE : 닫기 버튼 클릭 시 프로그램 종료(다른 창도 모두 닫힘)
		 *     -> 현재 프로그램을 종료할 때 주로 사용
		 *  
		 *  2) DISPOSE_ON_CLOSE : 닫기 버튼 클릭 시 현재 창만 종료(닫힘)
		 *     -> 다른 창의 작업은 유지한 채 현재 창의 작업만 종료할 때 주로 사용
		 *  
		 *  3) HIDE_ON_CLOSE : 닫기 버튼 클릭 시 현재 창 숨김(종료 X -> 다시 표시 가능)
		 *     -> 현재 창의 작업도 유지한 채 창을 숨기기만 할 때 주로 사용
		 *  
		 *  4) DO_NOTHING_ON_CLOSE : 닫기 버튼 클릭 시 아무 작업도 안 함
		 */
		
		// JFrame 클래스를 상속받은 상태에서 프레임을 생성하는 경우
		// 현재 자신의 객체가 JFrame 객체이기도 하므로 JFrame 클래스의 메서드 바로 호출 가능
		setSize(500, 700);  // 가로 500픽셀, 세로 700픽셀 크기 설정
		setTitle("JFrame을 상속받아 생성");  // 제목 표시줄 타이틀 설정
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 닫기 버튼 클릭 시 현재 창만 종료됨
		setVisible(true); // 프레임을 화면에 표시
		
		// ----------------------------------------------------------------------------------------
		
		// JFrame 객체를 직접 생성하여 프레임 생성
		JFrame f = new JFrame("JFrame으로 생성한 프레임");
		
		f.setSize(500, 700);
		f.setLocation(700, 700); // 창이 열릴 위치 지정
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 클릭 시 프로그램 종료
		f.setVisible(true);
	}
	

	public static void main(String[] args) {
		
		new Practice02();

	}

}
