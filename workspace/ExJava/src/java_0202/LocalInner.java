package java_0202;

class LocalInner {
	
	int a = 100;
	public void innerTest(int k){
		int b = 200;
		final int c = k;
		class Inner{
			//지역변수 b 는 inner클래스 안에서는 상수로 변환
			public void getData(){
				System.out.println("int a : "+a);
				System.out.println("int b : "+b);
				System.out.println("final int c : "+c);
			}
		}
		Inner i = new Inner();
		i.getData();
	}

	public static void main(String[] args) {
		LocalInner inner = new LocalInner();
		inner.innerTest(10);

	}
}


