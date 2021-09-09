package practice0909;
import java.io.*;

public class Practice05 {

	public static void main(String[] args) {
		
		/*
		 *  키보드로부터 입력받은 내용을 readme.txt 파일에 출력
		 *  - 여러 줄을 입력 가능하도록 반복 입력 처리
		 *  - 단, ":wq" 문자열이 입력되면 입력을 종료
		 */
		
		File f = new File("D:\\jaehee\\temp\\readme2.txt");
		
		System.out.println("데이터를 입력해주세요.");
		
		try (BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			 PrintWriter out = new PrintWriter(new FileWriter(f))) {
			
			String str = buffer.readLine();
			
			// 입력된 문자열이 ":wq"가 아닐 동안 반복
			while(!str.equals(":wq")) {
				out.println(str); // 입력데이터 한 줄 출력(파일)
				str = buffer.readLine(); // 새로운 한 줄 읽어오기
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		
		System.out.println("출력 종료");

	}

}
