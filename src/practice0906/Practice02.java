package practice0906;
import java.io.*;

public class Practice02 {

	public static void main(String[] args) {
		
		/*
		 *  키보드로부터 데이터를 입력받아 처리하는 방법
		 *  2. InputStream 객체를 사용하여 1Byte 단위로 입력데이터를 처리하지 않고
		 *     배열을 사용하여 한번에 여러 Byte를 모아서 처리하는 방법
		 */
		
		System.out.println("데이터를 입력해주세요.");
		
//		try (InputStream is = System.in) {
//			
//			// 1Byte씩 묵음으로 처리할 byte[] 배열을 생성
//			byte[] bArr = new byte[10];
//			
//			// read() 메서드 파라미터로 byte[] 배열을 전달할 경우 입력되는 스트림을 자동으로 배열 크기만큼 읽어서 배열에 저장
//			// -> 배열에 저장된 데이터 크기(읽어들인 바이트 수)를 리턴 
//			int n = is.read(bArr);
//			
////			System.out.println("입력받은 데이터 크기 : " + n + " byte");
//			// ABC를 입력하면 엔터키를 입력해서 들어가는 13, 10까지 포함돼 3바이트가 아닌 5바이트가 리턴된다.
//			
//			// 반복문을 사용하여 배열에 저장된 데이터를 출력
////			for (byte b : bArr) {
////				System.out.println("입력받은 데이터 크기 : " + b + ", 입력받은 데이터를 문자로 변환 : " + (char)b);
////				// 입력받은 만큼만 출력되는 것이 아니라 배열은 크기가 고정적이므로 배열의 크기(입력받은 문자 + 비어있는 인덱스)만큼 모두 출력된다. 
////			}
//			
//			// String 클래스를 활용하면 byte[] 배열 데이터를 문자로 변환 가능
//			String str = new String(bArr);
//			System.out.println("입력받은 문자 : " + str);
//			// 배열과는 달리 입력받은 문자만 출력된다.
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("입력 종료");
		
		System.out.println("-------------------------------------------------------------");
		
		// 반복문을 사용하여 Ctrl + Z 입력 시까지 입력받은 문자를 배열에 저장하여 입력 처리
		
		System.out.println("데이터를 입력해주세요.");
		
		try (InputStream is = System.in) {
			
			byte[] bArr = new byte[10];
			
			int n = is.read(bArr);
			
			// byte[] 배열 단위로 입력받은 문자들이 저장된 n의 크기가 0보다 클 때까지 반복
			while(n > 0) {
				String str = new String(bArr);
				System.out.println("입력받은 문자 : " + str);
				n = is.read(bArr);
			}
			// 근데 Ctrl + Z 입력 시까지라고 했는데 왜 n > 0 일까...  
			// 아! Ctrl + Z 하면 -1이 되니까 n이 0보다 작아져서 while문을 탈출하는구나
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("입력 종료");
		

	}

}
