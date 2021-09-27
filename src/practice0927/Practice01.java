package practice0927;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Practice01 {
	
	public Practice01() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("Dialog 기초");
		f.setBounds(600, 400, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JPanel 객체를 생성하여 CENTER 영역에 부착
		JPanel p = new JPanel();
		f.add(p, BorderLayout.CENTER);
		
		// JButton 객체 3개(Message(btnMessage), Confirm(btnConfirm), Input(btnInput)) 생성
		// -> JPanl에 차례대로 부착
		JButton btnMessage = new JButton("Message");
		JButton btnConfirm = new JButton("Confirm");
		JButton btnInput = new JButton("Input");
		
		p.add(btnMessage);
		p.add(btnConfirm);
		p.add(btnInput);
		
		// 각 버튼 이벤트 처리 - 4단계
		// -> ActionListener 구현체 내부에서 버튼 3개를 구별
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//					JOptionPane.showMessageDialog(p, btnMessage, null, 0);
				if(e.getSource() == btnMessage) {
					/*
					 *  1. parentComponent : 다이얼로그를 표시할 부모 객체
					 *     -> 만약, null값을 지정하면 전체 화면의 중앙에 표시된다.
					 *  2. message : 다이얼로그에서 표시할 본문
					 *  3. title : 다이얼로그 제목표시줄에 표시할 제목
					 *  4. messageType : 메세지 종료(아이콘 형태를 결정)
					 *     -> JOptionPane.XXX_MESSAGE 상수 사용
					 *     1) INFORMATION_MESSAGE : 일반적인 메세지(보라색)
					 *     2) WARNING_MESSAGE : 경고 메세지(노란색)
					 *     3) ERROR_MESSAGE : 오류 메세지(빨간색 X)
					 *     4) QUESTION_MESSAGE : 질문 메세지(초록색 ?)
					 *     5) PLAIN_MESSAGE : 아이콘 없음
					 */
					
//					JOptionPane.showMessageDialog(
//							f, // 다이얼로그 표시 대상 객체
//							"다이얼로그 메세지", // 본문 
//							"다이얼로그 제목", // 제목
//							JOptionPane.WARNING_MESSAGE); // 메세지 형태
					
					// 만약, 간략한 메세지만 표시할 경우 대상 객체와 메세지만 지정 가능
					// -> 제목 : 메세지, 메세지 종료 : INFOPMATION_MESSAGE로 자동 지정됨
					JOptionPane.showMessageDialog(f, "다이얼로그 메세지");
					
				} else if(e.getSource() == btnConfirm) {
					
//					JOptionPane.showConfirmDialog(f, "종료하시겠습니까?");
					
					/*
					 *  ConfirmDialog는 기본적으로 MessageDialog와 파라미터가 비슷함
					 *  - optionType 파라미터 : 버튼의 종류를 결정
					 *    -> JOptionPane.XXX_OPTION 상수를 활용하여 버튼 종류 설정 가능
					 *  - 리턴값이 int이므로 선택된 버튼의 고유값이 리턴됨
					 *    -> JOptionPane.XXX_OPTION 상수를 활용하여 버튼 판별 가능
					 *       ex) JOptionPane.YES_OPTION = 0 에 해당
					 *           JOptionPane.NO_OPTION = 1 에 해당
					 */
					int select = JOptionPane.showConfirmDialog(
							f, // 표시할 대상 객체
							"종료하시겠습니까?", // 메세지
							"종료", // 제목
							JOptionPane.YES_NO_CANCEL_OPTION, 
							JOptionPane.QUESTION_MESSAGE); // 버튼 종류
					
					System.out.println("선택된 버튼 : " + select);
					
					if(select == JOptionPane.YES_OPTION) {
						System.out.println("종료");
					} else if(select == JOptionPane.NO_OPTION) {
						System.out.println("종료 안 함");
					} else if(select == JOptionPane.CANCEL_OPTION) {
						System.out.println("종료 취소");
					}
					
				} else if(e.getSource() == btnInput){
					String input = JOptionPane.showInputDialog(f, "검색할 이름 입력");
					System.out.println("입력 데이터 : " + input);
				}
				
			}
		};
		
		btnMessage.addActionListener(listener);
		btnConfirm.addActionListener(listener);
		btnInput.addActionListener(listener);
		
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		new Practice01();

	}

}
