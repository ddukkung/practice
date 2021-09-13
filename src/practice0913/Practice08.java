package practice0913;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Practice08 {
	
	/*
	 *  1. 300, 300 프레임 생성
	 *  2. 닫기버튼 클릭 시 프로그램 종료
	 *  3. JFrame의 기본 레이아웃 BorderLayout의 5개의 영역에 버튼 5개 부착(CENTER, EAST, WEST, SOUTH, NORTH)
	 *  4. 각 버튼을 클릭하면 "XXX 클릭됨" 출력하도록 5단계로 이벤트 처리
	 */
	
	public Practice08() {
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
		
		// 각 버튼에 대한 이벤트 처리 - 4단계
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 전달된 버튼 객체가 ActionEvent 타입으로 변환되어 전달되므로
				// 각 버튼을 ActionEvent 객체(e)와 비교해야 함
				// -> e.getSource() 리턴값을 JButton 객체와 비교하거나 JButton 타입으로 형변환하여 사용
				JButton btn = (JButton)e.getSource();
				// 만약, 각 버튼에 대한 텍스트 정보만 필요할 경우
				// -> getActionCommand() 또는 getText() 활용
				System.out.println(btn.getText() + " 버튼 클릭");
				
				// 조건식의 동등비교연산을 통해 버튼 객체와 e.getSource() 결과 비교
				// -> 같을 경우 해당 버튼임을 증명하게 됨
				// -> 주로, 특정 버튼에 따라 서로 다른 작업을 수행해야 할 경우 사용하는 방법
				if(btn == btnCenter) {
//					System.out.println("CENTER 버튼 클릭");
					// CENTER 버튼 클릭 시 수행할 작업들 명시
				} else if(btn == btnEast) {
//					System.out.println("EAST 버튼 클릭됨");
					// EAST 버튼 클릭 시 수행할 작업들 명시
				}
			}
		};
		
		// 각 버튼에 리스너 4단계 연결
		btnCenter.addActionListener(listener);
		btnEast.addActionListener(listener);
		btnWest.addActionListener(listener);
		btnNorth.addActionListener(listener);
		btnSouth.addActionListener(listener);
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		new Practice08();

	}

}
