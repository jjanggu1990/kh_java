package java_0125;

import java.util.Random;

public class Test extends A{
	int t = 0 ;
	Test(){
		//super.a = 14;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test a = new Test();
		System.out.println(a.a);
		Long tmp = 2L ;
		for(int i =0;i<10;i++){
			Random ran = new Random(tmp);
			for(int j = 0;j<3;j++){
				System.out.println(ran.nextInt(5));
			}
		}
		System.out.println(a);
	}

}


class A{
	int a = 0;
	int b = 0;
	static int st= 0;
	A(){
		a=10;
	}
	public String toString(){
		return "asdfsdf";
	}
}