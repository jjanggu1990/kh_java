package java_0121;

class ParameterTest2 {
	public static void main(String[] args) {

		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);

	}

	// Data 참조변수를 매개변수로 넘겨줌
	// 그러므로 d 참조변수를 통해 인스턴스 멤버 변수 수정 가능
	
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}
