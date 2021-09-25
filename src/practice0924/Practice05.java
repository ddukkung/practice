package practice0924;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.event.*;

public class Practice05 {
	
	public Practice05() {
		showFrame();
		
	}
	
	public void showFrame() {
		
		JFrame f = new JFrame("ComboBox 기초");
		f.setBounds(600, 400, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 콤보박스에 표시할 데이터를 Vector 객체에 저장
		Vector<String> listData = new Vector<String>();
		listData.add("항목을 선택하세요");
		listData.add("항목1");
		listData.add("항목2");
		listData.add("항목3");
		
		// JComboBox 객체 생성 시 생성자 파라미터로 목록이 저장된 Vector 객체 전달
		JComboBox<String> comboBox = new JComboBox<String>(listData);
		
		// JComboBox를 먼저 생성하고 차후에 데이터를 추가하는 경우
		// => Vector 객체의 add() 메서드를 호출하여 새로 추가되는 항목을 추가
		listData.add("항목4");
		listData.add("항목5");
		
		// JFrame의 CENTER 영역에 JcomboBox 추가
		f.add(comboBox);
		
		// 콤보박스 이벤트 처리
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 콤보박스에서 선택된 항목 출력 => getSelectItem() 메서드 사용
//				System.out.println(comboBox.getSelectedItem());
				
				// => 첫번째 항목을 제외한 나머지를 선택했을 때만 항목 출력
//				System.out.println(comboBox.getSelectedIndex());
				if(comboBox.getSelectedIndex() > 0) {
					System.out.println(comboBox.getSelectedItem());
				}
			}
		});
				
		JSpinner spinner = new JSpinner();
		// 스피너에 필요한 항목 생성하려면 SpinnerXXXModel 객체 생성 필요
		// => 해당 모델 객체에 String[] 배열 또는 List 계열 객체를 추가하여 데이터 전달
		// 1-1. 배열 생성하여 데이터 저장
//		String[] items = {"자바", "JSP", "안드로이드"};
		// 1-2. List 생성하여 데이터 저장
		ArrayList<String> items = new ArrayList<String>();
		items.add("자바");
		items.add("JSP");
		items.add("안드로이드");

		// 2. 스피너 객체의 setModel() 메서드를 호출하여
		//    SpinnerXXXModle 객체 생성 및 데이터 전달
		SpinnerListModel slm = new SpinnerListModel(items);
		spinner.setModel(slm);
		
		f.add(spinner, BorderLayout.SOUTH);
		
		// 스피너 이벤트 처리 - ActionListener 없음. ChangeListener 사용
		spinner.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// 항목이 변경되면 자동으로 호출되는 메서드
//				System.out.println("변경!");
				// => getValue() 메서드를 호출하여 항목 내용 가져오기 가능
				System.out.println(spinner.getValue());
			}
		});
		
		
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Practice05();

	}

}
