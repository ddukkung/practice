package practice0906;
import java.io.*;

public class Practice07 {

	public static void main(String[] args) {
		
		// BufferedReader를 사용하여 입력받은 문자열을 OutputStream을 사용하여 출력
		
		System.out.println("데이터를 입력하세요.");
		
		// try ~ resource 구문 작성 시
		// try() 문장 소괄호 내에 복수 개의 객체를 세미콜론(;)으로 구분하여 전달 가능
		try ( BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			  OutputStream os = System.out) {
			
			String str = buffer.readLine();
//			os.write(str.getBytes());
			
			System.out.println("입력 데이터 : " + str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("입력 종료");

	}

}
