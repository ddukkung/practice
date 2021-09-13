package practice0913;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Practice07 {
	
	/*
	 *  1. 300, 300 프레임 생성
	 *  2. 닫기버튼 클릭 시 프로그램 종료
	 *  3. JFrame의 기본 레이아웃 BorderLayout의 5개의 영역에 버튼 5개 부착(CENTER, EAST, WEST, SOUTH, NORTH)
	 *  4. 각 버튼을 클릭하면 "XXX 클릭됨" 출력하도록 5단계로 이벤트 처리
	 */
	
	public Practice07() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("레이아웃 연습");
		f.setBounds(600, 400, 300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnCenter = new JButton("CENTER");
		JButton btnEast = new JButton("EAST");
		JButton btnWest = new JButton("WEST");
		JButton btnSouth = new JButton("SOUTH");
		JButton btnNorth = new JButton("NORTH");
		
		f.add(btnCenter, BorderLayout.CENTER);
		f.add(btnEast, BorderLayout.EAST);
		f.add(btnWest, BorderLayout.WEST);
		f.add(btnSouth, BorderLayout.SOUTH);
		f.add(btnNorth, BorderLayout.NORTH);
		
		btnCenter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("CENTER 버튼 클릭");
			}
		});
		
		btnEast.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("EAST 버튼 클릭");
			}
		});
		
		btnWest.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("WEST 버튼 클릭");
			}
		});
		
		btnSouth.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("SOUTH 버튼 클릭");
			}
		});
		
		btnNorth.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("NORTH 버튼 클릭");
			}
		});
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		new Practice07();

	}

}
