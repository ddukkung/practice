package practice0910;
import javax.swing.*;

public class Practice03 {
	
	/*
	 *  400 * 400 크기의 창 생성
	 *  제목 : JFrame 생성 연습
	 *  닫기 버튼 클릭 시 프로그램 종료
	 */
	
	public Practice03() {
		showFrame();
	}
	
	public void showFrame() {
		
		JFrame f = new JFrame("JFrame 생성 연습");
		
		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
				
	}
	

	public static void main(String[] args) {
		
		new Practice03();

	}

}
