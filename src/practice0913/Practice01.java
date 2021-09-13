package practice0913;

import java.awt.event.*;

import javax.swing.*;

public class Practice01 {
	
	/*
	 *  1. 300, 200 프레임 생성(타이틀 : "이벤트처리 연습-3"
	 *  2. 닫기버튼 클릭 시 프로그램 종료
	 *  3. "버튼"이라는 텍스트를 갖는 버튼 객체 부착
	 *  4. 클릭 이벤트 처리를 위해 ActionListener 인터페이스를 멤버 내부클래스 형태로 구현하는 핸들러(MyMemberActionListener) 정의
	 *     -> 추상메서드 actionPerformed() 메서드 오버라이딩
	 *     -> 메서드 내에는 "버튼 클릭" 문자열 출력하는 코드 기술
	 *  5. ActionListener 인터페이스 구현체(MyMemberActionListener) 객체 생성
	 *  6. 버튼 객체의 addActionListener() 메서드를 호출하여 MyMemberActionListener 객체 전달
	 */
	
	public Practice01() {
		showFrame();
	}
	
	public void showFrame() {
		
		JFrame f = new JFrame("이벤트처리 연습-3");
		f.setBounds(600, 400, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("버튼");
		f.add(btn);
		
		MyMemberActionListener listener = new MyMemberActionListener();
		btn.addActionListener(listener);
		
		f.setVisible(true);
		
		
	}
	
	class MyMemberActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("버튼 클릭");
		}
		
	}
	

	public static void main(String[] args) {
		
		new Practice01();

	}

}
