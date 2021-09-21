package practice0917;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import practice0913.Practice01.*;

public class Practice04 {
	
	/*
	 *  JPanel(패널)
	 */
	
	JTextField tf; // 다른 메서드에서 접근하기 위해 멤버변수로 선언
	
	public Practice04() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame();
		f.setBounds(600, 400, 300, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 프레임의 CENTER 영역에 JTextField와 JButton 컴포넌트를 하나로 묶어서 부착
		// -> 복수 개의 컴포넌트를 묶기 위해서 JPanel(패널) 사용
		// 1. JPanel 객체 생성
		JPanel p = new JPanel();
		
		// 2. JPanel 컨테이너를 JFrame 컨테이너의 CENTER 영역에 부착(나중에 부착해도 상관 없음)
		f.add(p, BorderLayout.CENTER);
		
		// 3. JTextField 와 JButton 객체를 생성
		// -> 주의! FlowLayout을 갖는 JPanel에 JTextField를 부착하는 경우
		//	  반드시 JTextField의 컬럼 크기 설정이 필수이다.
		tf = new JTextField(20);
		JButton btn = new JButton("확인");
		
		// 4. JTextField와 JButton 객체를 JPanel에 부착
		p.add(tf);
		p.add(btn);
		
		// 이벤트 리스너 연결 -> 리스너 구현 코드 중복 제거를 위해 4단계 구현
		// -> 구현된 4단계 리스너 객체를 파라미터로 사용하여 리스너 연결
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				printMessage();
			}
		};
		
		btn.addActionListener(listener);
		tf.addActionListener(listener);
		
		f.setVisible(true);
	}
	
	public void printMessage() {
		// JTextField에 입력된 텍스트를 가져와서 출력 후 텍스트 초기화
		// 입력 작업 완료 후 텍스트 초기화 끝난 뒤 다시 입력을 위해 커서를 JTextField로 이동
		System.out.println(tf.getText());
		tf.setText("");
		tf.requestFocus();
	}


	public static void main(String[] args) {
		
		new Practice04();

	}

}
