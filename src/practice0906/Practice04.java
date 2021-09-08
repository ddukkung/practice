package practice0906;
import java.io.*;

public class Practice04 {

	public static void main(String[] args) {
		
		/* 
		 * 키보드로부터 데이터를 입력받아 처리하는 방법
		 * 4. InputStreamReader 객체를 사용하여 char 단위로 읽어온 데이터를
		 *    배열을 사용하여 한번에 여러 문자로 모아서 처리하는 방법
		 */
		
		System.out.println("데이터를 입력하세요");
		
		try (InputStreamReader reader = new InputStreamReader(System.in)) {
			
			char[] cArr = new char[10];
			
//			int n = reader.read(cArr); // 입력데이터를 배열에 저장
			
			System.out.println("입력 데이터 크기 : " + reader.read(cArr));
			System.out.println("입력데이터(문자열) : " + new String(cArr));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
			
		
		System.out.println("입력 종료");
		

	}

}
