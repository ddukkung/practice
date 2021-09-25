package practice0924;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Practice02 {
	
	public Practice02() {
		showFrame();
	}
	
	public void showFrame() {
		
		JFrame f = new JFrame("CheckBox 기초");
		f.setBounds(600, 400, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		f.add(p);
		
		JCheckBox cb1 = new JCheckBox("체크1");
//		JCheckBox cb2 = new JCheckBox("체크2");
//		JCheckBox cb3 = new JCheckBox("체크3");
		
		// JCheckBox 객체 생성 시 파라미터로 체크 여부 전달 가능(생략 시 기본값 false)
		JCheckBox cb2 = new JCheckBox("체크2", false);
		JCheckBox cb3 = new JCheckBox("체크3", true);
		
		// 패널에 체크박스 부착
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		
		// 체크박스 체크 또는 체크해제 시 이벤트 처리(ActionListener 사용)
		// -> 체크박스 각각에 이벤트 연결 필요
		// 4단계 구현방법을 통해 3개의 체크박스를 동시에 처리
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 단순히 체크박스 대상만 판별하는 경우 getActionCommand() 메소드 사용
//				System.out.println(e.getActionCommand());
				
				// 체크박스 대상에 대한 체크 여부 판별하는 경우
				// -> 파라미터로 전달된 ActionEvent 객체 -> JCheckBox 타입으로 변환 필요
				Object o = e.getSource(); // Object 타입 객체 저장
//				JCheckBox cb = (JCheckBox)e.getSource();
				// JCheckBox 타입 변환 가능 여부 판별
				if(o instanceof JCheckBox) {
					JCheckBox cb = (JCheckBox)o; // 형변환 수행
					
					if(cb.isSelected()) { // 체크 여부 판별
						System.out.println(cb.getActionCommand() + " 체크 됨");
					} else {
						System.out.println(cb.getActionCommand() + " 체크 해제됨");
					}
					
				}
				
				// 체크박스별 수행할 작업이 다를 경우
//					if(cb == cb1) {
//						// 체크1에 대한 작업
//					} else if(cb == cb2) {
//						// 체크2에 대한 작업
//					}
			}
		};
		
		// 체크박스에 ActionListener 구현체 연결
		cb1.addActionListener(listener);
		cb2.addActionListener(listener);
		cb3.addActionListener(listener);
		
		// 만약, 체크박스별 5단계로 구현할 경우
		cb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 체크 여부 확인 시 현재 체크1 체크박스에 대해 이벤트를 연결했으므로
				// 별도의 변환이나 확인 없이 cb1에 대한 체크 수행 가능
				if(cb1.isSelected()) {
					System.out.println("(5단계) 체크1 체크됨");
				} else {
					System.out.println("(5단계) 체크1 체크 해제됨");
				}
				
			}
		});
		
		// JButton 생성 및 SOUTH 영역 부착
		// 확인 버튼 클릭 시 3개의 체크박스 체크 여부를 판별하여
		// 체크되어 있는 항목에 대해 "XXX 체크됨" 출력
		JButton btn = new JButton("확인");
		f.add(btn, BorderLayout.SOUTH);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(cb1.isSelected()) {
					System.out.println("체크1 체크됨");
				}
				
				if(cb2.isSelected()) {
					System.out.println("체크2 체크됨");
				}
				
				if(cb3.isSelected()) {
					System.out.println("체크3 체크됨");
				}
				
				// if문을 따로 작성하지 않고 else if문을 사용할 경우
				// cb1을 선택하면 나머지 버튼들이 체크되어도 이미 if문에서 true가 만족되었기 때문에
				// 밑의 else if문들은 검사를 하지 않게 되므로 체크되어도 출력문이 실행되지 않는다.
				// 그렇기 때문에 각각 개별로 if문을 작성해야 모두 실행된다.
			}
		});
				
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		new Practice02();

	}

}
