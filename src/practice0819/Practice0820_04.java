package practice0819;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Practice0820_04 {

	public static void main(String[] args) throws ParseException {

		int money = 128000;
		
		// 정수 128000을 128,000원 형식으로 변경하여 출력
		
		String pattern = "###,###원";
		DecimalFormat df = new DecimalFormat(pattern);
		
		System.out.println(df.format(money));
		
		// 문자열 숫자데이터 "128,000원"을 정수 128000으로 변경하여 출력
		String strMoney = df.format(money);
		
		long parsedMoney = (long)df.parse(strMoney);
		System.out.println(parsedMoney);
	}

}
