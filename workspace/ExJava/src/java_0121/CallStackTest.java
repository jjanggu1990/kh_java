package java_0121;

class CallStackTest {

	public static void main(String[] args) {
		CallStackTest.firstMethod();

	}
	static void firstMethod(){
		// 같은 클래스에 있는 멤버는 이름만으로 호출 할 수 있다.
		secondMethod();
	}
	static void secondMethod(){
		System.out.println("secondeMethod()");
	}

}