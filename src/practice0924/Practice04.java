package practice0924;
import java.awt.event.*;

import javax.swing.*;

public class Practice04 {
	
	public Practice04() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("RadioButton 기초");
		f.setBounds(600, 400, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		f.add(p);
		
		JRadioButton rb1 = new JRadioButton("선택1");
		JRadioButton rb2 = new JRadioButton("선택2");
		p.add(rb1);
		p.add(rb2);
		
		// 이 상태에선 버튼 두 개가 동시에 선택이 가능하다. 하지만 라디오 버튼은 본디 하나만 눌리는 버튼이기 때문에
		// 그룹화를 하여 하나만 선택되도록 해야 한다.
		
		// 라디오버튼 그룹화를 위해 ButtonGroup 객체 생성
		// ButtonGroup 객체의 add() 메소드를 호출하여 그룹화할 컴포넌트 객체 추가
		ButtonGroup rbGroup = new ButtonGroup();
		rbGroup.add(rb1);
		rbGroup.add(rb2);
		
		// ActionListener 활용하여 라디오버튼 이벤트 처리
		// -> 선택 여부에 따라 "XXX 선택됨" 출력
		rb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rb1.isSelected()) {
					System.out.println(rb1.getText() + " 선택됨");
				}
			}
		});
		
		rb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rb2.isSelected()) {
					System.out.println(rb2.getText() + " 선택됨");
				}
			}
		});
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		new Practice04();

	}

}
