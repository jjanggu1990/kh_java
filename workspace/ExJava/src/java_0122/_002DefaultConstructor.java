package java_0122;

class _002DefaultConstructor {
	//이렇게 생긴 기본 생성자가 생성 됨
	_002DefaultConstructor(){}

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		
		//생성자의 매개변수와 다를 경우, 에러 발생
		Data2 d2 = new Data2(3);
	}

}

class Data1{
	//이렇게 생긴 기본 생성자가 생성 됨
	Data1(){}
	int valut;
	
}
class Data2{
	int value;
	Data2(int x){
		value = x;
	}
}