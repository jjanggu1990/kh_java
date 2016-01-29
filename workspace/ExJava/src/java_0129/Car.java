package java_0129;

class Car {
	protected int speed;
	protected String name;
	
	Car(){
	}
	Car(String name){
		this.name= name;
	}
	
	public void speedUp(){
		speed++;
	}
	public void speedDown(){
		speed--;
	}
	public void speedZero(){
		speed = 0;
	}
	@Override
	public String toString(){
		return "name : "+name+ " speed : " + speed; 
	}

}
