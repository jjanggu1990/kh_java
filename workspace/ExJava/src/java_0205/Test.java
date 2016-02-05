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
//	T(){
//		Runnable a = new A();
//		Runnable b = new B();
//		Runnable c = new C();
//		Thread th1 = new Thread(a);
//		Thread th2 = new Thread(b);
//		Thread th3 = new Thread(c);
//		th1.start();
//		th2.start();
//		th3.start();
//	}
//	T(){
//		Runnable a = new D();
//		Thread th = new Thread(a);
//		th.start();
//	}
	
	T(){
		Runnable a = new D();
		Runnable b = new D();
		
		Thread th = new Thread(a,"first");
		Thread th1 = new Thread(b,"second");
		
		th.start();
		th1.start();
	}
	
	
}

class A implements Runnable{

	@Override
	public synchronized void run() {
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
	public synchronized void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i< 500;i++){
			Test.i = i;
			Test.tmp = "B";
			System.out.println(Test.tmp+" : "+Test.i);
		}
	}
}

class C implements Runnable{
	public synchronized void run() {
		// TODO Auto-generated constructor stub
		for(int i = 0; i< 500;i++){
			Test.i = i;
			Test.tmp = "C";
			System.out.println(Test.tmp+" : "+Test.i);
		}
	}
}
class D implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		a();
		b();
		c();
	}

	public synchronized void a(){
		for(int i = 0;i<500; i++){
			System.out.println(Thread.currentThread().getName()+"a"+i);
		}
	}
	public synchronized void b(){
		for(int i = 0;i<500; i++){
			System.out.println(Thread.currentThread().getName()+"b"+i);
		}
	}
	public synchronized void c(){
		for(int i = 0;i<500; i++){
			System.out.println(Thread.currentThread().getName()+"c"+i);
		}
	}
	
}