package java_0125;


//abstract 혼자 사용 불가
//일반클래스에서 상속 후 사용 가능
abstract class AbstractEx {
	int a;
	String b;
	final static int c=0;
	
	
	void move(int b){};
	
	abstract int move1(int a);

}

class ex extends AbstractEx{

	@Override
	int move1(int a) {
		
		System.out.println("오버라이딩 됐습니다.");
		return 0;
	}
	
	
}