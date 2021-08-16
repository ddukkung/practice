package practice0601;

public class Ex03 {

	public static void main(String[] args) {
		
		// char타입 변수 ch의 값을 1만큼 증가시키는 방법 3가지
		
		char ch = 65;
		
		// 1. 기본 산술연산자와 대입연산자를 조합하여 사용
		
		ch = (char)(ch + 1); // 산술연산자로 계산할 땐 특정 데이터타입 외엔 기본적으로 int가 적용되기 때문에 명시적 형변환을 해줘야한다. 
		System.out.println(ch);
		
		
		// 2. 확장대입연산자를 사용
		ch += 1;
		System.out.println(ch);
		
		
		// 3. 증감연산자를 사용
		++ch;
		System.out.println(ch);
		
		byte b = 4;
		// b = b + 4; // b는 byte 타입인데 산술연산에 의해 값이 int로 바뀜. 근데 int는 byte보다 크기 때문에 명시적 형변환을 해줘야 한다.
		// 그럴 땐 이렇게 한다!
		b = (byte)(b + 4);
		// 괄호 없이 b 앞에 byte를 쓰거나 b와 4 앞에 각각 byte를 쓰는 건 잘못된 식이다.
		// 왜냐하면 각각 적어줘봤자 산술연산을 실행하고 나면 다시 int로 바뀌고, 괄호를 해주지 않으면 뭐더라...
		// 우선순위가 안 맞아서 그렇던가...? 암튼 산술 연산자를 사용해서 값을 대입할 때는 이렇게 명시적 형변환을 해줘야한다. 물론 이것도 데이터타입의 크기에따라 다른 거임. 
		
		// int형 i1에 1234를 초기화, long형 l1에 i1의 값 저장
		int i1 = 1234;
		long l1 = i1;
		System.out.println(l1);
		
		
		// byte형 b1에 i1의 값 저장
		byte b1 = (byte)i1;
		System.out.println(b1);
		
		
		// double형 d1에 i1의 값 저장
		double d1 = i1;
		System.out.println(d1);
		
		double d2 = 0.12345678912346789;
		System.out.println(d2);
		
		
		// float형 f2에 d2의 값 저장
		float f2 = (float)d2;
		System.out.println(f2);
		
		
		byte b3 = 67;
		// char형 c1에 b3의 값 저장
		char c1 = (char)b3;
		System.out.println(c1);

	}

}
