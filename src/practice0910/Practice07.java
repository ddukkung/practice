package practice0910;
import java.awt.event.*;

import javax.swing.*;

public class Practice07 {
	
	public Practice07() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("이벤트처리 연습-1");
		f.setBounds(500, 500, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("버튼");
		f.add(btn);
		
		MyActionListener listener = new MyActionListener();
		btn.addActionListener(listener);
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		/*
		 *  1. 300, 200 프레임 생성(타이틀 : "이벤트처리 연습-1")
		 *  2. 닫기 버튼 클릭 시 프로그램 종료
		 *  3. "버튼"이라는 텍스트를 갖는 버튼 객체 부착
		 *  4. 클릭 이벤트 처리를 위해 ActionListener 인터페이스를 구현 핸들러(MyActionListener) 정의
		 *     -> 추상메서드 actionPerformed() 메서드 오버라이딩
		 *     -> 메서드 내에 "버튼 클릭" 문자열을 출력하는 코드 기술
		 *  5. ActionListener 인터페이스 구현체(MyActionListener) 객체 생성
		 *  6. 버튼 객체의 addActionListener() 메서드를 호출하여 MyActionListener 객체 전달
		 *  
		 */
		
		new Practice07();

	}

}

class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 클릭");
	}
	
}