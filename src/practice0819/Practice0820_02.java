package practice0819;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice0820_02 {

	public static void main(String[] args) {

		/*
		 *  Date 객체를 생성하여 오늘 날짜 및 현재 시각을 다음과 같이 변환하여 출력
		 *  ex) 2021년 8월 19일(목) 오전 9시 43분 30초
		 */
		
		Date now = new Date();
		String pattern = "yyyy년 MM월 dd일 E a hh시 mm분 ss초";
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String formattingNow = sdf.format(now);
		System.out.println(formattingNow);
	}

}
