package practice0924;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Practice01 {
	
	public Practice01() {
		showFrame();
	}
	
	public void showFrame() {
		
		JFrame frame = new JFrame("계산기");
		frame.setBounds(600, 400, 400, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 상단 숫자 표시 패널
		JTextField tf = new JTextField();
		tf.setText("0"); // 초기값 0으로 설정
		tf.setEditable(false); // 숫자 편집 불가 설정
		
		// 폰트 변경을 위한 설정
		// 폰트 변경을 위한 객체의 setFont() 메소드를 호출하여 Font 객체 전달
		// -> Font 객체의 생성자 파라미터로 "폰트명", 폰트옵션, 사이즈 전달
		tf.setFont(new Font("맑은고딕", Font.BOLD, 25));
		
		// 텍스트 우측 정렬
		tf.setHorizontalAlignment(JTextField.RIGHT);
		
		frame.add(tf, BorderLayout.NORTH);
		
		// 중앙 숫자 버튼 패널
		// 생성과 동시에 GridLayout으로 설정
		JPanel pCenter = new JPanel(new GridLayout(5, 4, 0, 0));
		frame.add(pCenter);
		
		// JButton 컴포넌트 텍스트 폰트 설정을 위한 Font 객체 생성
		Font btnFont = new Font("맑은고딕", Font.BOLD, 18);
		
		JButton btnCE = new JButton("CE");
		btnCE.setFont(btnFont);
		btnCE.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnCE);
		
		JButton btnC = new JButton("C");
		btnC.setFont(btnFont);
		btnC.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnC);
		
		JButton btnDel = new JButton("←");
		btnDel.setFont(btnFont);
		btnDel.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnDel);
		
		JButton btnDiv = new JButton("÷");
		btnDiv.setFont(btnFont);
		btnDiv.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnDiv);
		
		JButton btnNum7 = new JButton("7");
		btnNum7.setFont(btnFont);
		btnNum7.setBackground(Color.WHITE);
		pCenter.add(btnNum7);
		
		JButton btnNum8 = new JButton("8");
		btnNum8.setFont(btnFont);
		btnNum8.setBackground(Color.WHITE);
		pCenter.add(btnNum8);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.setFont(btnFont);
		btnNum9.setBackground(Color.WHITE);
		pCenter.add(btnNum9);
		
		JButton btnMul = new JButton("X");
		btnMul.setFont(btnFont);
		btnMul.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnMul);
		
		JButton btnNum4 = new JButton("4");
		btnNum4.setFont(btnFont);
		btnNum4.setBackground(Color.WHITE);
		pCenter.add(btnNum4);
		
		JButton btnNum5 = new JButton("5");
		btnNum5.setFont(btnFont);
		btnNum5.setBackground(Color.WHITE);
		pCenter.add(btnNum5);
		
		JButton btnNum6 = new JButton("6");
		btnNum6.setFont(btnFont);
		btnNum6.setBackground(Color.WHITE);
		pCenter.add(btnNum6);
		
		JButton btnSub = new JButton("-");
		btnSub.setFont(btnFont);
		btnSub.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnSub);
		
		JButton btnNum1 = new JButton("1");
		btnNum1.setFont(btnFont);
		btnNum1.setBackground(Color.WHITE);
		pCenter.add(btnNum1);
		
		JButton btnNum2 = new JButton("2");
		btnNum2.setFont(btnFont);
		btnNum2.setBackground(Color.WHITE);
		pCenter.add(btnNum2);
		
		JButton btnNum3 = new JButton("3");
		btnNum3.setFont(btnFont);
		btnNum3.setBackground(Color.WHITE);
		pCenter.add(btnNum3);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setFont(btnFont);
		btnAdd.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnAdd);
		
		JButton btnSign = new JButton("±");
		btnSign.setFont(btnFont);
		btnSign.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnSign);
		
		JButton btnNum0 = new JButton("0");
		btnNum0.setFont(btnFont);
		btnNum0.setBackground(Color.WHITE);
		pCenter.add(btnNum0);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(btnFont);
		btnDot.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(btnFont);
		btnEqual.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnEqual);
		
		ActionListener btnListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 이벤트 대상 객체(e)의 getActionCommand()로 버튼 텍스트 비교하기
				// e.getActionCommand().charAt(0) -> 텍스트 첫번째 글자 가져오기
				// -> Character 클래스의 숫자 판별 메소드 사용
				char btnCh = e.getActionCommand().charAt(0);
				
				// 가져온 문자 1개가 '0' ~ '9' 범위인지 판별
				// -> Character Wrapper 클래스의 숫자를 판별하는 isDigit() 메소드 사용
				if(Character.isDigit(btnCh)) {
					String currentNum = tf.getText();
					
					if(currentNum.equals("0")) { // 0이 표시되어 있을 경우
						// 0 대신 입력받은 숫자 표시
						tf.setText(btnCh + "");
						// setText() 메소드의 파라미터는 String 타입이므로 빈문자열을 더해 String으로 변환한다.
						
					} else { // 0 이외의 숫자가 표시되어 있을 경우
						// 새로 입력된 숫자를 기존 숫자 뒤에 연결하여 표시
						tf.setText(currentNum + btnCh);
					}
				} else if(btnCh == 'C') { // C(Clear) 버튼 클릭 시
					tf.setText("0");
				} else if(btnCh == '←') { // 삭제 버튼 클릭 시
					// 현재 표시된 숫자 가져오기
					String currentNum = tf.getText();
					
					if(currentNum.length() < 2) { // 현재 숫자가 2자리 미만일 경우
						// 더 이상 삭제가 불가능하므로 0으로 초기화
						tf.setText("0");
						
					} else { // 현재 숫자가 2자리 이상일 경우
						// 마지막 숫자 제거
						// = 가장 마지막 숫자를 제외한 나머지 숫자만 추출(substring())하여 출력
						// -> 마지막 숫자 앞자리까지 추출하기 위해서는 끝인덱스 파라미터에 전체 문자열 길이 -1 값을 전달해야 함
						tf.setText(currentNum.substring(0, currentNum.length() - 1));
					}
				}
			}
		};
		
		btnC.addActionListener(btnListener);
		btnCE.addActionListener(btnListener);
		btnDiv.addActionListener(btnListener);
		btnDel.addActionListener(btnListener);
		btnMul.addActionListener(btnListener);
		btnAdd.addActionListener(btnListener);
		btnEqual.addActionListener(btnListener);
		btnSign.addActionListener(btnListener);
		btnDot.addActionListener(btnListener);
		btnSub.addActionListener(btnListener);
		btnNum0.addActionListener(btnListener);
		btnNum1.addActionListener(btnListener);
		btnNum2.addActionListener(btnListener);
		btnNum3.addActionListener(btnListener);
		btnNum4.addActionListener(btnListener);
		btnNum5.addActionListener(btnListener);
		btnNum6.addActionListener(btnListener);
		btnNum7.addActionListener(btnListener);
		btnNum8.addActionListener(btnListener);
		btnNum9.addActionListener(btnListener);
		
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		
		new Practice01();
		
		/*
		 *  개선할 점
		 *  1. 일일이 노가다로 하는 게 아니라 반복문을 사용해서 코드를 간략화하고 싶다.
		 *  2. 계산 기능 추가하기
		 *  
		 */

	}

}
