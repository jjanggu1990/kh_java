package java_0119;

class _004OperEx {

	public static void main(String[] args) {
		
		int a = 44, b = 5, c;
		
		c = a % b;
		
		//0���� ������ ���� �Ұ���
		//���α׷� �󿡼� 0�� ���ٴ� ���̱� ������ ���� ���� ���� �� ����.
		//�� �ݴ�� �����ϴ�
		
		System.out.println("c = a % b : "+c);
		
		
		int d = a / b;
		
		System.out.println("int d = a / b : " + d);
		
		//�̹� int ����ȯ���� �Ҽ� ���ϰ� ����� �ڶ� 
		//double ������ ��ȯ�ص� ����� ���� ���� ���� ����
		double d1 = a / b;
		
		System.out.println("double d1 = a / b : " +d1);
		
		
		//�׷��� �� �� �ϳ� �̻��� ���� double ������ ��ȯ�ϸ�
		//�������� ������ ����� ������
		d1 = (double)a / b;
		
		System.out.println(d1);
		
		
		a = 10;
		b = 7;
		
		System.out.println(a+b);
		System.out.println(a);
		
		System.out.println(a+=b); //a = a + b
		System.out.println(a);
		
		
		//String �� ���� ��ü Ÿ���� < , > ���� �� �����ڸ�
		//��� �� �� ����.
		// ==, != �� ���� �������ڴ� ����� �����ϳ�
		//�ּҰ��� ���ϹǷ�, ��Ȯ�� ����� �ƴϴ�
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
		
		//%%�����ڿ��� ù ��° ������� false �̱� ������
		//�ڿ� ������ ������ �ȵǼ� b�� 20���� ���� �ְ� �ȴ�
		bool = !((a+=12) > b) && (a==(b+=2));
		
		System.out.println("boolean : " + bool);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		
		
		// or �������� ��� �տ� ������ true �̸�
		//�ڿ� �����ڸ� �������� �����Ƿ� b�� 20���� �״�� �ְ� �ȴ�
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
		
		
		//���� ������
		a = 10;
		
		System.out.println(++a);	//11 11
		System.out.println(a++);	//11 12
		System.out.println(a);
		
		
		a = 10;
		b = a++%2;
		System.out.println(a+"    "+ b);
		
		
		//3�� ������ ?
		a = 15;
		b = 16;
		
		String s = "";
		
		s += (a>b) ? ((a-b)+"��ŭ a�� ũ��") : ((b-a)+"��ŭ b�� ũ��") ;
		System.out.println(s);
		
		//?�� �ΰ� �̻� �� ��� ������ : �������� ����
		s ="";
		s += 
				++a >= b ?
						a == b ? "a�� b�� ����." : (a-b) + "��ŭ a�� ũ��" 
								: (b-a)+"��ŭ b�� ũ��"	;
		System.out.println(s);
	}

}
