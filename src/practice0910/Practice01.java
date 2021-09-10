package practice0910;
import java.io.*;

public class Practice01 {

	public static void main(String[] args) {
		
		/*
		 *  temp 폴더에 저장된 readme.txt 파일을 읽어들여
		 *  각 라인에 라인번호를 추가하여 콘솔(화면)에 출력
		 *  - FileReader, BufferedReader 사용
		 *    (키보드로 입력받는 InputStreamReader 대신 File로부터 입력받는 FileReader 사용)
		 */
		
		File f = new File("D:\\jaehee\\temp\\readme2.txt");
		
		try (BufferedReader buffer = new BufferedReader(new FileReader(f))) {
			String str = buffer.readLine(); // 라인 번호로 사용할 변수 초기화
			
			int count = 1;
			while(str != null) {
				System.out.println(count + " " + str);
				str = buffer.readLine();
				count++; // 라인 번호 증가
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
