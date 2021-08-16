

class WalkBad {
	
	// 사람의 한 걸음(보폭)의 이동거리 출력
	public void walk() {
		System.out.println("100cm 이동");
	}
	
	public void walk(int step) {
		System.out.println(step * 100 + "cm 이동");
	}
	
	public void walk(int step, String unit) {
		// ex) 2걸음, m = 100 * 2 = 200cm / 100 * 2m 결과를 출력
		// switch - case 문을 사용하여 단위 판별("cm" or "m")
		// -> "알 수 없는 단위이므로 이동 불가!"
		
		switch(unit) {
		
			case "cm" :
				System.out.println(step * 100 + "cm 이동");
				break;
			case "m" :
				System.out.println(step * 100 / 100 + "m 이동");
				break;
			default :
				System.out.println("알 수 없는 단위이므로 이동 불가");
		}
	}
	
}

class WalkGood {
	
	public void walk() {
		walk(100, "cm");
	}
	
	public void walk(int step) {
		walk(step, "cm");
	}
	
	public void walk(int step, String unit) {
		// ex) 2걸음, m = 100 * 2 = 200cm / 100 * 2m 결과를 출력
		// switch - case 문을 사용하여 단위 판별("cm" or "m")
		// -> "알 수 없는 단위이므로 이동 불가!"
		
		switch(unit) {
		
			case "cm" :
				System.out.println(step * 100 + "cm 이동");
				break;
			case "m" :
				System.out.println(step * 100 / 100 + "m 이동");
				break;
			default :
				System.out.println("알 수 없는 단위이므로 이동 불가");
		}
	}
	
	
}


public class Practice0630_9 {

	public static void main(String[] args) {


		WalkBad wb = new WalkBad();
		
		wb.walk();
		wb.walk(40);
		wb.walk(40, "m");
		wb.walk(50, "inch");
		
		WalkGood wg = new WalkGood();
		
		wg.walk();
		wg.walk(3);
		wg.walk(40, "m");
		

	}

}
