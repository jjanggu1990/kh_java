package java_0127;

class InterTestEx implements InterTest {

	@Override
	public int getA() {
		return A;
	}

	public static void main(String[] args) {

		InterTestEx it = new InterTestEx();
		System.out.println("getA() : " + it.getA());

	}

}

interface InterTest {

	// �������̽������� ������ ���� ����
	final static int A = 100;

	abstract int getA();
}