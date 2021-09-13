package practice0913;

import java.awt.event.*;

import javax.swing.*;

public class Practice05 {
	
	/*
	 * 	300, 200 프레임 생성(타이틀 : "이벤트처리 연습-5")
	 *  닫기 버튼 적용
	 *  "버튼"이라는 텍스트를 갖는 버튼 객체 부착
	 *  Test02를 익명 내부 클래스의 임시 객체 형태로 작성
	 *  -> 클릭 이벤트 처리를 위해 ActionListener 인터페이스를 익명 내부 클래스의 임시 객체 형태로 
	 *     정의하여 버튼 객체의 addActionListener() 메서드를 호출하여 파라미터로 전달
	 */
	
	public Practice05() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("이벤트처리 연습-5");
		f.setBounds(600, 400, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("버튼");
		f.add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭");
			}
		});
		
		f.setVisible(true);
	}
	

	public static void main(String[] args) {
		
		new Practice05();

	}

}
