package practice0921;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Practice02 {
	
	public Practice02() {
		showFrame();
	}
	
	public void showFrame() {
		
		// 프레임 생성
		JFrame frame = new JFrame("계산기");
		frame.setBounds(600, 400, 400, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 액정 패널 생성
		JPanel displayPanel = new JPanel();
		frame.add(displayPanel, BorderLayout.NORTH);
		
		JTextField tf = new JTextField(10);
		tf.setFont(new Font("맑은고딕", Font.BOLD, 40));
		displayPanel.add(tf);
		
		// 버튼 패널 생성
		JPanel buttonPanel = new JPanel();
		GridLayout grid = new GridLayout(5, 3, 5, 5);
		buttonPanel.setLayout(grid);
		frame.add(buttonPanel);
		
		// 버튼명을 저장할 문자열 배열 
		String[] buttonName = {"CE", "C", "←", "÷", "7", "8", "9", "x", 
				"4", "5", "6", "-", "1", "2", "3", "+", "±", "0", ".", "="
		};
		
		// JButton 또한 배열로 선언. 버튼명 배열의 크기와 크기가 같으므로 크기에는 buttonName.length를 주면 된다.
		JButton[] buttons = new JButton[buttonName.length];
		
		// for문으로 버튼 생성 후 패널에 부착
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(buttonName[i]);
			buttonPanel.add(buttons[i]);
		}
		
		tf.setText("0");
		
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				if(tf.getText().equals("0")) {
					tf.setText("");
					String data = tf.getText()+btn.getText();
					tf.setText(data);
				} else {
					String data = tf.getText()+btn.getText();
					tf.setText(data);
				}
			}
		};
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addActionListener(listener);
		}
		
		buttons[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("0");
			}
		});
		
		buttons[2].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = e.getActionCommand();
				
				if(str.equals("←")) {
					int textLength = tf.getText().length();
					
					if(textLength == 0) {
						tf.setText("0");
					} else if(textLength > 0) {
						String data = tf.getText().substring(0, textLength - 1);
						tf.setText(data);
					}
				}
			}
		});
		
		
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		
		new Practice02();

	}

}
