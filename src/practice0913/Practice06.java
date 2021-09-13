package practice0913;
import java.awt.*;

import javax.swing.*;

public class Practice06 {

	public Practice06() {
		showFrame();
	}

	public void showFrame() {

		JFrame f = new JFrame("레이아웃 기초");
		f.setBounds(200, 200, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JButton 객체 생성
		JButton btnCenter = new JButton("CENTER");

		// 현재 프레임의 중앙(CENTER 영역)에 버튼 객체 추가(부착)
//		f.add(btnCenter, "Center"); // 문자열을 사용하여 영역 지정할 경우
//		f.add(btnCenter, "CENTER"); // 주의! 예외 발생 -> CENTER는 틀린 문자열임
		f.add(btnCenter, BorderLayout.CENTER); // 가급적 상수 사용 권장

		// 만약, 동일한 영역에 2개의 컴포넌트를 부착할 경우
		JButton btnCenter2 = new JButton("CENTER2");
//		f.add(btnCenter2, BorderLayout.CENTER);
		// 둘 다 나오는 게 아닌 나중에 부착된 btnCenter2가 표시된다.
//		f.add(btnCenter2); // 영역 지정 생략 시 CENTER 영역에 배치된다.
		
		// 두 번째 버튼을 생성하여 상단(NORTH 영역)에 버튼 부착
		JButton btnNorth = new JButton("NORTH");
		f.add(btnNorth, BorderLayout.NORTH);
		
		// EAST, WEST, SOUTH 영역에 버튼 추가
		JButton btnEast = new JButton("EAST");
		f.add(btnEast, BorderLayout.EAST);
		
		JButton btnWest = new JButton("WEST");
		f.add(btnWest, BorderLayout.WEST);
		
		JButton btnSouth = new JButton("SOUTH");
		f.add(btnSouth, BorderLayout.SOUTH);
		
		f.setVisible(true);
	}

	public static void main(String[] args) {

		new Practice06();

	}

}
