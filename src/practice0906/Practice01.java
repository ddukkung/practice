package practice0906;
import java.io.*;

public class Practice01 {

	public static void main(String[] args) {
		
		/*
		 *  자바 I/O(Input/Output)
		 *  
		 *  키보드로부터 데이터를 입력받아 처리하는 방법
		 *  1. InputStream 객체를 사용하여 1Byte 단위로 입력데이터를 처리하는 방법
		 */
		
		// 표준 입력장치인 키보드로부터 데이터를 입력받아 InputStream 객체로 관리
		// -> 입력 스트림 데이터 중 1Byte 만큼을 읽어와서 출력
		
		// 입력스트림을 저장할 변수 선언
//		InputStream is = null;
//		
//		System.out.println("데이터를 입력해주세요.");
//		
//		try {
//			is = System.in;
//			// -> System.in 코드에 의해 키보드로부터 데이터 입력이 가능하며(입력스트림 열기)
//			// 	  입력스트림 객체를 InputStream 타입 변수에 저장(연결)
//			
//			// 입력스트림 데이터 중 1Byte만큼의 데이터를 읽어와서 변수에 저장
//			int n = is.read(); // 리턴타입이 int이므로 int형 변수에 받아야 한다.
//			// IOException이 발생할 수 있으므로 try ~ catch문을 작성해야 한다.
//			
//			System.out.println("입력받은 데이터 : " + n); // 입력받은 문자열 그대로가 아닌 정수 형태가 저장되므로 정수가 출력된다.
//			
//			System.out.println("입력받은 데이터를 문자로 변환 : " + (char)n); // 정수형태인 입력받은 데이터를 문자형인 char 타입으로 형변환하여 출력
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			if(is != null) {try { is.close(); } catch (Exception e2) { e2.printStackTrace(); }
//			// 기본적으로 자원을 사용하는 객체(Connection, InputStream 등)는 사용 후 close() 메서드 호출을 통해 사용 중인 자원을 반환해야 하며, 
//			// 자원이 반환되지 않으면 반복적인 자원 요청으로인해 자원이 고각되어 더 이상 다른 사용자의 작업 요청을 수행할 수 없게 된다. 
//			// -> 예외 발생 여부와 관계없이 finally 블록 내에서 자원반환 코드 기술
//		}
		
//		System.out.println("입력 종료");
		
		System.out.println("-----------------------------------------------------------------------");
		
		/*
		 *  try ~ resource 구문을 사용하여 자원 반환(close())을 자동으로 수행
		 *  - try ~ resource 구문은 try문에서 반환할 자원을 갖는 객체를 생성하고 
		 *    try ~ catch 블록 작업이 끝나면 자동으로 자원을 반환해준다.
		 *    
		 *  < 기본 문법 >
		 *  try(자원을 반환할 객체 생성 및 변수에 저장) {
		 *  	// 작업 수행
		 *  
		 *  } catch(...) {
		 *  	// 예외 처리 작업 수행
		 *  }
		 *  
		 *  <try ~ resource 단축키 >
		 *  블럭 지정 후 -> Alt + Shift + z -> w
		 * 
		 */
		
//		System.out.println("데이터를 입력해주세요.");
//		
//		// try문의 소괄호() 내부에 자원 반환이 필요한 객체의 생성 코드를 작성
//		try (InputStream is = System.in) {
//			// -> 별도의 close() 메서드를 호출하지 않아도 자동으로 자원이 반환된다.
//			int n = is.read();
//			
//			System.out.println("입력받은 데이터 : " + n);
//			
//			System.out.println("입력받은 데이터를 문자로 변환 : " + (char)n);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("입력 종료");
		
		
		// --------------------------------------------------------------------------------------------
		
		// 반복문을 사용하여 Ctrl + Z를 입력할 때까지 1Byte씩 반복하여 입력 처리
		// -> 윈도우에서 Ctrl + Z를 EOF(End Of File)라고 하며 System.in.read()가 -1로 인식된다.
		
		System.out.println("데이터를 입력해주세요.");
		
		try (InputStream is = System.in) {
			
			int n = is.read();
			
			// 반복문을 사용하여 더 이상 읽어올 데이터가 없을 때까지 입력을 처리
			while(n != -1) { 
				
				// 읽어들인 1Byte 데이터를 화면에 출력
				System.out.println("입력받은 데이터 : " + n);
				System.out.println("입력받은 데이터를 문자로 변환 : " + (char)n);
				
				// 다음 입력데이터 1Byte 가져오기
				n = is.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("입력 종료");
		
		// 문자를 입력한 뒤 엔터를 쳤을 때 입력하지 않은 데이터 13, 10이 출력되는 이유는 엔터가 문자로 인식되어 입력되기 때문이다.
		// 그 의미는 다음과 같다.
		// ASCII 코드
		// 10 : LF(Line Feed) -> 다음 줄로 이동
		// 13 : CR(Carriage Return) -> 제일 처음 칸으로 이동
		
		
		

	}

}
