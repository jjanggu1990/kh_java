package java_0122;

class _001Test {

	public static void main(String[] args) {
		//_001Test.add(1,2);

	}
	static int add (int a , long b){
		System.out.println("첫 번재 add");
		return 0;
	}
	static int add (long a , int b){
		System.out.println("두 번재 add");
		return 1;
	}

}

class A{
	
	static int cv = 10;
	
	int iv = 10;
	
	int a = cv;
	
	static int b = cv;

	int c = iv;
	
	/*
	 * static 변수가 먼저 메모리에 존재 하기 때문에 
	 * 그 외에 그 값을 참조하는데 문제가 없다.
	 * 
	 */
	
}