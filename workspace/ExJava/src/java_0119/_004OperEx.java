package java_0119;

class _004OperEx {

	public static void main(String[] args) {
		
		int a = 44, b = 5, c;
		
		c = a % b;
		
		//0으로 나누는 것은 불가능
		//프로그램 상에서 0은 없다는 뜻이기 때문에 없는 수로 나눌 수 없다.
		//그 반대는 가능하다
		
		System.out.println("c = a % b : "+c);
		
		
		int d = a / b;
		
		System.out.println("int d = a / b : " + d);
		
		//이미 int 형변환으로 소수 이하가 사라진 뒤라 
		//double 형으로 변환해도 사라진 값을 복구 하지 못함
		double d1 = a / b;
		
		System.out.println("double d1 = a / b : " +d1);
		
		
		//그래서 둘 중 하나 이상의 값을 double 형으로 변환하면
		//정상적인 값으로 출력이 가능함
		d1 = (double)a / b;
		
		System.out.println(d1);
		
		
		a = 10;
		b = 7;
		
		System.out.println(a+b);
		System.out.println(a);
		
		System.out.println(a+=b); //a = a + b
		System.out.println(a);
		
		
		//String 과 같은 객체 타입은 < , > 같은 비교 연산자를
		//사용 할 수 없다.
		// ==, != 과 같은 논리연산자는 사용은 가능하나
		//주소값을 비교하므로, 정확한 결과는 아니다
		a = 10;
		b = 20;
		
		boolean bool = a<b;
		System.out.println("a < b : "+bool);
		
		bool = (a != b);
		
		System.out.println("a != b : "+ bool );
		
		a = 10;
		b = 20;
		
		bool = (a+=12) > b && (a==(b+=2));
		
		System.out.println("boolean : " + bool);
		System.out.println("a : " + a);
		System.out.println("b : " + b);

		a = 10;
		b = 20;
		
		//%%연산자에서 첫 번째 결과값이 false 이기 때문에
		//뒤에 조건이 실행이 안되서 b는 20으로 남아 있게 된다
		bool = !((a+=12) > b) && (a==(b+=2));
		
		System.out.println("boolean : " + bool);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		
		
		// or 연산자의 경우 앞에 조건이 true 이면
		//뒤에 연산자를 실행하지 않으므로 b는 20으로 그대로 있게 된다
		a = 10;
		b = 20;
		
		bool = ((a+=12) > b) || (a==(b+=2));
		
		System.out.println("boolean : " + bool);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		
		a = 10;
		b = 20;
		
		bool = ((a+=12) > b) && !(a==(b+=2));
		
		System.out.println("boolean : " + bool);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		
		a = 10;    //1010
		b = 7;     //0111
		
		c = a & b;	//0010  2
		System.out.println("a & b : "+c);
		c = a | b;	//1111  15
		System.out.println("a | b : "+c);
		c = a ^ b;	//1101  13
		System.out.println("a ^ b : "+c);
		
		
		
		a = 12;		//00001100
		b = 2;
		
	
		c = a>>b;	//00000011
		System.out.println("a >> b : "+c);
		
		d = a<<2;	//00110000
		System.out.println("a << 2 : "+d);
		
		
		//증감 연산자
		a = 10;
		
		System.out.println(++a);	//11 11
		System.out.println(a++);	//11 12
		System.out.println(a);
		
		
		a = 10;
		b = a++%2;
		System.out.println(a+"    "+ b);
		
		
		//3항 연산자 ?
		a = 15;
		b = 16;
		
		String s = "";
		
		s += (a>b) ? ((a-b)+"만큼 a가 크다") : ((b-a)+"만큼 b가 크다") ;
		System.out.println(s);
		
		//?가 두개 이상 일 경우 마지막 : 기준으로 나눔
		s ="";
		s += 
				++a >= b ?
						a == b ? "a와 b가 같다." : (a-b) + "만큼 a가 크다" 
								: (b-a)+"만큼 b가 크다"	;
		System.out.println(s);
	}

}
