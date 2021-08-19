package practice0819;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Practice0819_01 {

	public static void main(String[] args) {

		// 날짜 및 시각 정보에 대한 형식화 클래스
		
		// SimpleDateForamt 클래스 사용
		Date now = new Date();
		
		// 1. 표현 형식을 지정하기 위해 형식 지정 문자를 사용한 문자열 패턴 생성
		String pattern = "yyyy년 MM월 dd일 EEEE HH:mm:ss";
		
		// 2. SimpleDateFormat 클래스 객체 생성(파라미터로 패턴 문자열 전달)
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		// 3. SimpleDateFormat 객체의 format() 메서드를 호출해 Date 객체 전달
		// 리턴 타입이 String이므로 String 타입 변수에 저장
		String formattingNow = sdf.format(now);
		
		System.out.println(formattingNow);
		
		System.out.println("------------------------------------------");
		
		// DateTimeFormatter 클래스 사용
		LocalDateTime now2 = LocalDateTime.now();
		// LocalDateTime 클래스는 객체를 생성하지 못하기 때문에 static 메서드를 바로 호출해서 사용
		
		String pattern2 = "yy년 MM월 dd일 E a hh:mm:ss";
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern2);
		// 마찬가지로 객체를 생성하지 못하므로 ofPattern() 메서드를 바로 호출해서 사용
		
		System.out.println(now2.format(dtf));
		
	}

}
