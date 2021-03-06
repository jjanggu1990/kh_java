package java_0127;

class InterEx_1 implements Inter3 {
	int a = 100;

	public static void main(String[] args) {
		InterEx_1 it = new InterEx_1();

		Inter1 it1 = it;
		Inter2 it2 = it;
		Inter3 it3 = it;

		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getData());

	}

	@Override
	public int getA() {

		return a;
	}

	@Override
	public int getData() {
		return a + 10;
	}

}

interface Inter1 {
	public int getA();
}

interface Inter2 {
	public int getA();
}

interface Inter3 extends Inter1, Inter2 {
	public int getData();
}