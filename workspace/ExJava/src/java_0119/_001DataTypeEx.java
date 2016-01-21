package java_0119;

class _001DataTypeEx {
	int c;
	public static void main(String [] args){
		//변수 : 하나의 값을 저장하는 공간(데이터 값을 바꿀 수 있음)
		//선언 : type 변수명;
		//저장 : 변수명 = 값;
		//선언과 저장을 한번에 가능
		// == 같다, != 같지 않다.
		
		boolean b = true;
		System.out.println(b);
		System.out.println("b");
		
		char c = 'A';
		char c1 = (char)(c+1);
		System.out.println(c);
		System.out.println(c1);
		
		
		int i = 10;
		//접미사 L을 붙이면 long 타입이라고 명시 하는 것(대소문자 안가림)
		long i_2 = 10L;
		
		//소수점 숫자는 기본이 double 형임
		double d = 3.14D;
		//접미사 f 를 붙여서 float 형이라고 명시해줘야 함
		float f = 3.14F;
		
		//소수가 더 범위가 넓다고 판단해서 실수로 저장 가능
		double d1 = 100;
		//소수점 범위가 없기 때문에 f 접미사 없어도 가능
		float d2 = 100;
		
		//범위의 차이가 있음
		float f3 = 0.100000000001f;
		double d3 = 0.100000000001;
		System.out.println("f3 : "+f3);
		System.out.println("d3 : "+d3);

		/*
		 * 변수의 크기 비교
		 * 정수형보다 실수형의 표현 범위가 더 넓기 때문에 long 보다 float이 더 큰 범위
		 * byte < short == char < int < long < float < double
		 */
		
	}

}
