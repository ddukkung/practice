package practice0909;
import java.io.*;

public class Practice02 {

	public static void main(String[] args) {
		
		/*
		 *  자바의 기본 데이터 입출력
		 *  
		 *  < 기본 문법 >
		 *  1. 기본 데이터 출력
		 *     DataOutputStream dos = new DataOutputStream(바이트 스트림 객체);
		 *     dos.writeXXX(데이터);
		 *     
		 *  2. 기본 데이터 입력
		 *     DataInputStream dis = new DataInputStream(바이트 스트림 객체);
		 *     dis.readXXX();
		 */
		
		// 자바의 기본 데이터를 파일로 출력하기
		
//		try {
//			// 1. FileOutputStream 객체를 생성하여 출력할 파일 위치 및 파일명 지정
//			FileOutputStream fos = new FileOutputStream("D:\\jaehee\\temp\\test.dat");
//			
//			// 2. DataOutputStream 객체를 생성하여 FileOutputStream 객체 전달
//			DataOutputStream dos = new DataOutputStream(fos);
//			
//		} catch (FileNotFoundException e) {
//			// FileOutputStream에서 지정한 경로가 존재하지 않을 때 예외 발생
//			e.printStackTrace();
//		}
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\jaehee\\temp\\test.dat"))) {
			// DataOutputStream 객체를 통해 출력되는 데이터는 D 드라이브 temp 폴더 내의 test.dat 파일에 출력됨(기록됨)
			// -> dos.writeXXX() 메서드를 호출하여 기본 데이터 출력하기
			dos.writeInt(1);
			dos.writeBoolean(true); 
			dos.writeChar('A');
			dos.writeDouble(3.14);
			dos.writeUTF("String - UTF"); // 문자열을 출력하려면 String이 아닌 writeUTF() 메서드를 사용해야 한다.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("출력 완료");
		
		System.out.println("---------------------------------------------------------------------------");
		
		// 파일에 출력된 자바 기본 데이터를 읽어와서 화면에 출력하기
		try (DataInputStream dis = new DataInputStream(new FileInputStream("D:\\jaehee\\temp\\test.dat"))) {
			// dis.readXXX() 메서드를 호출하여 데이터 읽어오기(입력)
			// 읽어들일 데이터는 반드시 출력된 데이터 순으로 읽어야 한다.
			// -> 출력 순서 : int -> boolean -> char -> double -> String 이므로, 입력 순서도 동일해야 한다.
			int num = dis.readInt();
			boolean isPrinted = dis.readBoolean();
			char ch = dis.readChar();
			double dNum = dis.readDouble();
			String str = dis.readUTF();
			// -> 순서가 바뀔 경우 EOFException 예외가 발생하므로 주의
			
			// 입력받은 데이터 출력
			System.out.println("int형 정수 : " + num);
			System.out.println("boolean형 : " + isPrinted);
			System.out.println("char형 문자 : " + ch);
			System.out.println("double형 실수 : " + dNum);
			System.out.println("String형 문자열 : " + str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
