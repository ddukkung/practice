package practice0924;

import java.awt.event.*;

import javax.swing.*;

public class Practice03 {
	
	/*
	 *  1. 300, 200 프레임 생성(타이틀 : "CheckBox 연습")
	 *  2. 닫기버튼 클릭 시 프로그램 종료
	 *  3. JCheckBox 생성("Java", "JSP", "Android", "전체선택")
	 *  4. 전체선택 체크박스에 대한 이벤트 처리
	 *     -> 체크 시 "Java", "JSP", "Android"를 모두 체크
	 *        체크 해제 시 "Java", "JSP", "Android"를 모두 체크 해제
	 *        -> setSelected() 메소드 활용
	 */
	
	public Practice03() {
		showFrame();
	}
	
	public void showFrame() {
		
		JFrame f = new JFrame("CheckBox 연습");
		f.setBounds(600, 400, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		f.add(p);
		
		JCheckBox cbJava = new JCheckBox("Java");
		JCheckBox cbJSP = new JCheckBox("JSP");
		JCheckBox cbAndroid = new JCheckBox("Android");
		JCheckBox cbSelectAll = new JCheckBox("전체선택");
		
		p.add(cbJava);
		p.add(cbJSP);
		p.add(cbAndroid);
		p.add(cbSelectAll);
		
		cbSelectAll.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(cbSelectAll.isSelected()) {
					cbJava.setSelected(true);
					cbJSP.setSelected(true);
					cbAndroid.setSelected(true);
				} else {
					cbJava.setSelected(false);
					cbJSP.setSelected(false);
					cbAndroid.setSelected(false);
				}
			}
		});
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		new Practice03();

	}

}
