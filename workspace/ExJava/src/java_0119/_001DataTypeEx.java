package java_0119;

class _001DataTypeEx {
	int c;
	public static void main(String [] args){
		//���� : �ϳ��� ���� �����ϴ� ����(������ ���� �ٲ� �� ����)
		//���� : type ������;
		//���� : ������ = ��;
		//����� ������ �ѹ��� ����
		// == ����, != ���� �ʴ�.
		
		boolean b = true;
		System.out.println(b);
		System.out.println("b");
		
		char c = 'A';
		char c1 = (char)(c+1);
		System.out.println(c);
		System.out.println(c1);
		
		
		int i = 10;
		//���̻� L�� ���̸� long Ÿ���̶�� ��� �ϴ� ��(��ҹ��� �Ȱ���)
		long i_2 = 10L;
		
		//�Ҽ��� ���ڴ� �⺻�� double ����
		double d = 3.14D;
		//���̻� f �� �ٿ��� float ���̶�� �������� ��
		float f = 3.14F;
		
		//�Ҽ��� �� ������ �дٰ� �Ǵ��ؼ� �Ǽ��� ���� ����
		double d1 = 100;
		//�Ҽ��� ������ ���� ������ f ���̻� ��� ����
		float d2 = 100;
		
		//������ ���̰� ����
		float f3 = 0.100000000001f;
		double d3 = 0.100000000001;
		System.out.println("f3 : "+f3);
		System.out.println("d3 : "+d3);

		/*
		 * ������ ũ�� ��
		 * ���������� �Ǽ����� ǥ�� ������ �� �б� ������ long ���� float�� �� ū ����
		 * byte < short == char < int < long < float < double
		 */
		
	}

}
