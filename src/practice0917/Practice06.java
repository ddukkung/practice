package practice0917;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class Practice06 {
	
	/*
	 *  1. 320, 200 프레임 생성(타이틀 : 메모장)
	 *  2. 닫기 버튼 클릭 시 프로그램 종료
	 *  3. JPanel 객체를 생성하여 JFrame의 CENTER 영역에 부착
	 *  4. 상하, 좌우 스크롤이 항상 보이도록 출력
	 *  5. JTextArea 객체를 생성하여 JScrollPane에 부착
	 *  6. SOUTH 영역에 JButton 객체("저장")를 생성
	 *  7. 저장 버튼 클릭 시 입력된 텍스트를 가져와서 temp 폴더 내에 memo.txt 파일로 출력
	 *  8. 텍스트 입력란 초기화 및 커서 이동
	 *  9. 불러오기 버튼을 생성해 클릭 시 memo.txt에 저장된 텍스트를 가져와서 JTextArea에 출력
	 */
	
	public Practice06() {
		showFrame();
	}
	
	public void showFrame() {
		
		JFrame f = new JFrame("메모장");
		f.setBounds(600, 400, 320, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		f.add(p);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JTextArea ta = new JTextArea(7, 25);
		scrollPane.setViewportView(ta);
		
		p.add(scrollPane);
		
		JButton btnSave = new JButton("저장");
		JButton btnLoad = new JButton("불러오기");
		
		JPanel p2 = new JPanel();
		f.add(p2, BorderLayout.SOUTH);
		p2.add(btnSave);
		p2.add(btnLoad);
		
		
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String str = ta.getText();
				System.out.println(str);
				ta.setText("");
				ta.requestFocus();
				
				File f = new File("D:\\jaehee\\temp\\memo.txt");
				
				// try~catch문을 사용하여 PrintWriter 객체 생성
				// -> PrintWriter 객체 사용 시 FileWriter 객체 생략 가능
				try (PrintWriter out = new PrintWriter(f)) {
					// PrintWriter 객체의 println() 메서드를 호출하여 출력 내용 전달 
					out.write(str);
					
					
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		btnLoad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				File f = new File("D:\\jaehee\\temp\\memo.txt");
				
				try (BufferedReader buffer = new BufferedReader(new FileReader(f))) {
					String str = buffer.readLine();
					String total = "";
					
					while(str != null) {
						total += str + "\n";
						str = buffer.readLine();
					}
					
					ta.setText(total);
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
			
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		new Practice06();

	}

}
