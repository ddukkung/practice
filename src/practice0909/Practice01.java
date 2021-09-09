package practice0909;
import java.io.*;

public class Practice01 {

	public static void main(String[] args) {
		
		/* 
		 * 모니터로 데이터를 출력하는 방법
		 * 2. OutputStremaWriter 사용(char 단위로 처리)
		 * 
		 */
		
		// OutputStreamWriter 사용 시 
//		try (OutputStreamWriter writer = new OutputStreamWriter(System.out)) {
//			String str = "Hello, 자바";
//			writer.write(str); // 별도의 변환 과정 없이 String 객체를 바로 전달하여 사용 가능
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("데이터를 입력해주세요.");
		
		// BufferedReader로 입력받은 문자열을 BufferedWriter를 사용하여 출력
		// 입력받은 문자에 "From 배재희"를 추가해서 BufferedWriter를 사용하여 출력
		
		try (BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));) {
			
			String str = buffer.readLine() + " From 배재희"; // 한 줄 읽어오기
			writer.write(str); // 별도의 변환 과정 없이 바로 전달
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("입력 종료");
		// 왜 입력 종료가 출력이 안 되지... concat이랑 + 연산자 차인가했는데 강사님도 안 되는 거 보면 아닌 듯...

	}

}
