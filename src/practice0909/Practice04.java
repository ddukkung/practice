package practice0909;
import java.io.*;

public class Practice04 {

	public static void main(String[] args) {
		
		/*
		 *  키보드로부터 입력받은 데이터를 파일로 출력
		 */
		
		// 출력할 파일의 위치 및 파일명을 File 객체로 생성
		File f = new File("D:\\jaehee\\temp\\readme2.txt");
		
		System.out.println("데이터를 입력해주세요.");
		
		// BufferedReader를 통해서 한 줄 읽어오는 코드
		
		try (BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			 PrintWriter out = new PrintWriter(new FileWriter(f))) {
			
			String str = buffer.readLine();
			
			// PrintWriter 객체의 println() 메서드를 한 줄 입력 내용을 파일로 출력
			out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		System.out.println("파일로 출력 완료");

	}

}
