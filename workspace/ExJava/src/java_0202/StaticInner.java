package java_0202;

class StaticInner {

	int a = 10;
	private int b = 100;
	static int c = 200;
	
	static class Inner{
		static int d = 1000;
		int e = 2000;
		public void printData(){
			//non static ��� ��� �Ұ�
//			System.out.println("int a : "+a);
//			System.out.println("private int b : "+b);
			System.out.println("static int c : " +c);
			System.out.println("Inner static int d : "+d);
		}
	}
	public static void main(String[] args) {
		StaticInner.Inner inner = new StaticInner.Inner();
		inner.printData();
	}

}
