package java_0121;
class ReturnTest {
	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();

		int result = r.add(3,5);
		System.out.println(result);
		int[] result2 = {0};
		r.add(3,5,result2);
		System.out.println(result2[0]);
	}

	int add(int a, int b) {
		return a + b;
	}

	/*
	 * result 배열은 result2 배열과 같은 주소를 가르킴
	 * call by reference
	 */
	void add(int a, int b, int[] result) {
		result[0] = a + b;
	}
}