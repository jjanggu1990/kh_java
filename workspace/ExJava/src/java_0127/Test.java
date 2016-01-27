package java_0127;

class Test{
	
	int var = 0;
	
	//var = var 라고 입력하면
	//둘다 지역변수 var로 설정되므로, 영향이 없다.
	//그러므로 var는 여전히 0 기본값 그대로다.
	//지역변수와 인스턴스 변수가 같은 이름으로 존재할 때, 지역변수가 우선권을 갖는다.
	public void setInt(int var){
		//no effect
		var = var;
	}
	public int getInt(){
		return var;
	}
	public static void main(String[] args) {
		Test t= new Test();
		t.setInt(1000);
		System.out.println(t.getInt());
		
	}

}