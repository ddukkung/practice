package pratice0917;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Practice03 {
	
	/*
	 *  JTextField
	 */
	
	JTextField tf; // 다른 메서드에서 접근하기 위해 멤버변수로 선언
	
	public Practice03() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame();
		f.setBounds(600, 400, 300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JTextField 객체 생성
//		JTextField tf = new JTextField();
		
		tf = new JTextField();  // 다른 메서드에서 접근하기 위해 멤버변수로 선언
		
		//JFrame 객체의 CENTER 영역에 부착
		f.add(tf);
		
		// JButton 객체 생성 후 JFrame 객체의 SOUTH 영역에 부착
		JButton btn = new JButton("입력");
		f.add(btn, BorderLayout.SOUTH);
		
		// JButton 개겣 이벤트 처리
		// -> 버튼 클릭 시 JTextField의 내용을 콘솔창에 출력
		// -> JTextField의 텍스트 값을 초기화
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(tf.getText());
				tf.setText("");
			}
		});
		
		// JTextField 컴포넌트의 엔터키 입력에 대한 이벤트 처리
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(tf.getText());
				tf.setText("");
			}
		});
		
		f.setVisible(true);
		
	}
	
	// JTextField에 입력된 텍스트를 가져와서 출력하는 메서드 정의 

	public static void main(String[] args) {
		
		new Practice03();

	}

}
