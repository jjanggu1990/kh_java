package java_0128;

class Test extends T{
	void m(int x){
		System.out.println("int x, int y");
	}
	public static void main(String [] args){
		Test x1 = new Test ();

		x1.m(1);
	}

}



class T{
	int x ;
	
	void m(int x){
		System.out.println("int x");
	}

}