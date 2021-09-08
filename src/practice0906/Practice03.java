package practice0906;
import java.io.*;

public class Practice03 {

	public static void main(String[] args) {
		
		/*
		 *  키보드로부터 데이터를 입력받아 처리하는 방법
		 *  3. InputStreamReader 객체를 사용하여 char 단위로 입력데이터를 처리하는 방법
		 *  
		 *  < 기본 문법 > 
		 *  InputStreamReader reader = new InputStreamReader(InputStream객체);
		 */
		
		// 1. System.in을 사용하여 입력스트림 가져오기
//		InputStream is = System.in;
		
		// 2. InputStreamReader 객체 생성 -> 파라미터로 InputStream 객체 전달
//		InputStreamReader reader = new InputStreamReader(is);
		
		// 위의 문법을 한문장으로 결합
//		InputStreamReader reader = new InputStreamReader(System.in);
		// -> 보조스트림을 사용하는 스트림체이닝(StreamChaining) 방식 문법
		
		System.out.println("데이터를 입력하세요.");
		
		// try ~ resource 구문을 사용하여 InputStreamReader 객체 관리
		try (InputStreamReader reader = new InputStreamReader(System.in)) {
			// InputStreamReader 객체의 read() 메서드를 호출하여 char 단위 읽어오기
			
			int n = reader.read(); // char 단위 데이터 1개(1개 문자)를 int형으로 리턴
			
			System.out.println("입력데이터 : " + n + ", 문자로 변환 : " + (char)n);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			
			
			
		

	}

}
