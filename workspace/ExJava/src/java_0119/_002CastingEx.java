package java_0119;

class _002CastingEx {
	public static void main(String[] args) {

		double d = 100;
		int i = 100;

		double d2 = d + i;
		// double 형태를 int 형으로 바꾸려면 손실이 발생하므로 오류가 발생함
		// 형변환을 실행해주어야 함
		int i2 = (int) (d + i);
		int i3 = (int) d + i;

		System.out.println(d);// 100.0
		System.out.println(i);// 100
		System.out.println(d2);// 200.0
		System.out.println(i2);// 200
		System.out.println(i3);// 200
		
		short s = 10;
		short s1 = 20;
		
		// short + short 는 int 형으로 자동 형변환
		// 사칙연산은 정수형은 int로 자동 형변환
		// int 보다 큰 타입은 그 형을 따라감
		
		short s2 = (short)(s + s1);
		int s3 = s + s1;
		short s4 = (short)s3;

		
		
		byte b = 10;
		int i_1 = b;
		
		System.out.println(b);
		System.out.println(i_1);
		
		
		int i_2 = 300;
		//데이터 손실 발생 300->44
		//00000000 00000000 00000001 00101100
		//                         ? 00101100
		
		byte b_2 = (byte)i_2;
		
		System.out.println(i_2);
		System.out.println(b_2);
		
		//기본형 끼리의 형변환 가능
		//큰 형에서 작은 형으로 바꿀 때, 명시해줘야 함
		
	}

}