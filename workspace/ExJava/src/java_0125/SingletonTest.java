package java_0125;

class SingletonTest {
	public static void main(String[] args) {
		//Singleton s = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1==s2);
		s1.x=10;
		System.out.println(s1.x);
		System.out.println(s2.x);
		
	}

}

final class Singleton{
	private static Singleton s = new Singleton();
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(s == null){
			s = new Singleton();
		}
		System.out.println(s);
		return s;
	}
	int x;
}