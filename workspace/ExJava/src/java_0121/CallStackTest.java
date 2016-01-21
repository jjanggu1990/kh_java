package java_0121;

class CallStackTest {

	public static void main(String[] args) {
		CallStackTest.firstMethod();

	}
	static void firstMethod(){
		secondMethod();
	}
	static void secondMethod(){
		System.out.println("secondeMethod()");
	}

}
