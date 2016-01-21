package java_0121;

class Tv {
	
	/*
	 * 속성 -> 변수
	 * 
	 */
	
	boolean power;
	String color;
	int ch;
	String model;
	
	/*
	 * 기능 -> 메서드
	 * 
	 */
	
	void power(){
		power = !power;
	}
	void chup(){
		ch++;
	}
	void chdown(){
		ch--;
	}
}

class TvTest{
	
	public static void main(String [] args){
		
		Tv t = new Tv();
		t.ch=10;
		t.chup();
		System.out.println("channel : "+t.ch);
		
		Tv t1 = new Tv();
		
	}
}