package practice0819;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Practice0820_03 {

	public static void main(String[] args) throws ParseException {

		// 기본적인 숫자 데이터에 대한 형식화 클래스
		
		// 숫자 데이터에 대한 형식화
		double dNum = 1234.5; //원본 숫자 데이터
		
		String pattern = "\\#,###,###"; // 폰트 때문은 아닌 것 같은데... 내 컴에는 원 표시가 안 나오므로...
		// 아무튼 \ 이게 이스케이프 문자라 한 번만 쓰면 오류 남. 그래서 두 번 써줘야 원하는대로
		// 원 표시를 나타낼 수 있다. 
		
		// 1. 기본데이터타입 숫자데이터 -> 형식화된 문자열
		// -> DecimalFormat 클래스의 format() 메서드 사용
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println(df.format(dNum)); // \1,234 
		
		// 뒤의 소수점까지 표시하고 싶을 때
		String pattern2 = "\\###,###.000";
		
		DecimalFormat df2 = new DecimalFormat(pattern2);
		System.out.println(df2.format(dNum)); // \1,234.500
		
		// 2. 문자열에 대한 형식 지정 -> 기본데이터타입 숫자데이터
		// -> DecimalFormat 클래스의 parse() 메서드 사용
		String strNum = df2.format(dNum);
		
		// String -> double 변환 방법(Wrapper 클래스의 parseXXX() 메서드)를 사용하면 예외가 발생한다
//		double parsedNum = Double.parseDouble(strNum); // java.lang.NumberFormatException
		
		// 반드시 DecimalFormat 클래스의 parse() 메서드를 활용해야 한다.
		// -> 리턴타입이 Number 타입이므로 서브클래스 타입인 Double, Long 등으로 변환 필수
		double parsedNum = (double) df2.parse(strNum);
		System.out.println(parsedNum); // 1234.5
		
		// int형으로 변환하거나 float 형으로 변환하면 예외가 발생한다
//		int intParsedNum = (int)df2.parse(strNum); //  java.lang.ClassCastException
		
	}

}
