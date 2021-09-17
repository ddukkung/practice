package pratice0917;
import java.awt.*;

import javax.swing.*;

public class Practice02 {
	
	/*
	 *  GridLayout
	 */
	
	public Practice02() {
		showFrame();
	}
	
	public void showFrame() {
		
		JFrame f = new JFrame();
		f.setBounds(600, 400, 300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 현재 JFrame 객체를 GfidLayout의 3행 2열 구조로 변경
//		GridLayout gridLayout = new GridLayout(3, 2);
		// -> 행, 열, 수평간격, 수직간격
		GridLayout gridLayout = new GridLayout(3, 2, 10, 20);
		
		// JFrame 객체의 setLayout() 메서드를 호출하여 GridLayout 객체 전달
		f.setLayout(gridLayout);
		
		JButton btn1 = new JButton("BUTTON 1");
		JButton btn2 = new JButton("BUTTON 2");
		JButton btn3 = new JButton("BUTTON 3");
		JButton btn4 = new JButton("BUTTON 4");
		JButton btn5 = new JButton("BUTTON 5");
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		
		JButton btn6 = new JButton("BUTTON 6");
		f.add(btn6);
		
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Practice02();

	}

}
