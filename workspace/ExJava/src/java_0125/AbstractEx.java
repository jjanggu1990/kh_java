package java_0125;


//abstract ȥ�� ��� �Ұ�
//�Ϲ�Ŭ�������� ��� �� ��� ����
abstract class AbstractEx {
	int a;
	String b;
	final static int c=0;
	
	
	void move(int b){};
	
	abstract int move1(int a);

}

class ex extends AbstractEx{

	@Override
	int move1(int a) {
		
		System.out.println("�������̵� �ƽ��ϴ�.");
		return 0;
	}
	
	
}