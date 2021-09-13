package practice0913;

import java.awt.event.*;

import javax.swing.*;

public class Practice03 {
	
	/*
	 *  300, 200 프레임 생성(타이틀 : "이벤트처리 연습-4")
	 *  닫기 버튼 적용
	 *  "버튼"이라는 텍스트를 갖는 버튼 객체 부착
	 *  -> 익명 내부클래스 형태로 listener 인터페이스 생성
	 *  -> 메서드 내에 "버튼 클릭" 문자열 출력하는 코드 기술
	 *  버튼 객체에 메서드 호출하여 listener 객체 전달
	 */
	
	public Practice03() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("이벤트처리 연습-4");
		f.setBounds(600, 400, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("버튼");
		f.add(btn);
		
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭");
			}
		};
		
		btn.addActionListener(listener);
		
		f.setVisible(true);
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		new Practice03();

	}

}
