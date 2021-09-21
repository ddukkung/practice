package practice0921;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Practice01 {
	
	public Practice01() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("채팅 클라이언트");
		f.setBounds(600, 400, 320, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		f.add(p);
		
		JScrollPane sp = new JScrollPane();
		JTextArea ta = new JTextArea(7, 25);
		sp.setViewportView(ta);
		p.add(sp);
		
		JPanel p2 = new JPanel();
		f.add(p2, BorderLayout.SOUTH);
		
		JTextField tf = new JTextField(12);
		JButton btnSend = new JButton("전송");
		JButton btnReset = new JButton("초기화");
		p2.add(tf);
		p2.add(btnSend);
		p2.add(btnReset);
		
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = ta.getText() + tf.getText() + "\n";
				ta.setText(message);
				tf.setText("");
				tf.requestFocus();
			}
		};
		
		btnSend.addActionListener(listener);
		
		tf.addActionListener(listener);
		
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
			}
		});
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		new Practice01();

	}

}
