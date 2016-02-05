package java_0205;

class Test {
	public static int i=0;
	public static String tmp = "";
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new T();
	}

}
class T{
	T(){
		Runnable a = new A();
		Runnable b = new B();
		Runnable c = new C();
		Thread th1 = new Thread(a);
		Thread th2 = new Thread(b);
		Thread th3 = new Thread(c);
		th1.setPriority(10);
		th2.setPriority(8);
		th3.setPriority(5);
		th1.start();
		th2.start();
		th3.start();
	}
}

class A implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i< 500;i++){
			Test.i = i;
			Test.tmp = "A";
			System.out.println(Test.tmp+" : "+Test.i);
		}
		
	}
	
}

class B implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i< 500;i++){
			Test.i = i;
			Test.tmp = "B";
			System.out.println(Test.tmp+" : "+Test.i);
		}
	}
}

class C implements Runnable{
	public void run() {
		// TODO Auto-generated constructor stub
		for(int i = 0; i< 500;i++){
			Test.i = i;
			Test.tmp = "C";
			System.out.println(Test.tmp+" : "+Test.i);
		}
	}
}