package practice0906;
import java.io.*;

public class Practice06 {

	public static void main(String[] args) {
		
		/*
		 *  모니터로 데이터를 출력하는 방법
		 *  1. 기본 출력스트림인 OutputStream 사용(byte 단위로 처리)
		 */
		
		// OutputStream 객체를 연결하기 위해서는 System.out 사용
//		OutputStream os = System.out;
		
//		char ch = 'A';
//		String str = "AB";
//		
//		try (OutputStream os = System.out) {
//			// write() 메서드를 호출하여 1Byte 데이터 출력
//			os.write(ch); // A가 출력됨. 1Byte 단위로 출력하므로 한글, 한자 등 2Byte 문자는 출력 불가능
////			os.write(str); // 컴파일 전부터 오류가 난다.
//			
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
		
		// -----------------------------------------------------
		
		// String 타입 데이터를 OutputStream으로 출력
		String str = "Hello, 자바";
		
		try (OutputStream os = System.out) {
			// write(byte[] b) 메서드를 호출하여 출력할 데이터를 배열로 전달
			os.write(str.getBytes()); 
			// String 클래스의 getBytes() 메서드를 사용해 byte[] 타입 배열로 변환하여 출력.
			// 한글, 한자 등의 문자열도 출력 가능
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			

	}

}
