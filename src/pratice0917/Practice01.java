package pratice0917;
import java.awt.*;

import javax.swing.*;

public class Practice01 {

	/*
	 *  FlowLayout
	 *  
	 *  - 레이아웃 변경
	 *    -> 기존에 설정된 레이아웃을 변경하여 다른 형태로 컴포넌트 배치 가능
	 *    -> 컨테이너 객체 생성 시 생성자에 레이아웃 객체를 전달하거나 
	 *       컨테이너 객체의 setLayout() 메서드를 호출하여 레이아웃 변경
	 */
	
	public Practice01() {
		showFrame();
	}
	
	public void showFrame() {
		
		JFrame f = new JFrame();
		f.setBounds(600, 400, 300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 1. 레이아웃 객체 생성
//		FlowLayout flowLayout = new FlowLayout();
		
		// FlowLayout의 정렬 방식을 변경할 경우 생성자 파라미터로 정렬값 상수 사용 가능
//		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT); // 좌측 정렬
		
		// 2. setLayout() 메서드를 호출하여 변경할 레이아웃 객체를 전달
//		f.setLayout(flowLayout);
		
		// 위의 두 문장을 한 문장으로 결합
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		// 버튼 객체 5개 생성 및 Frame에 부착
		JButton btn1 = new JButton("btn1");
		JButton btn2 = new JButton("btn2");
		JButton btn3 = new JButton("btn3");
		JButton btn4 = new JButton("btn4");
		JButton btn5 = new JButton("btn5");
		
		// BorderLayout과 FlowLayout은 컴포넌트 배치 시 별도의 위치 지정 불필요
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		
		f.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		new Practice01();

	}

}
