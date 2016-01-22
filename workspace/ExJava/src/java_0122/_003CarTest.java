package java_0122;

class _003CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		Car  c2 = new Car("White", "auto", 4);
		System.out.println("c1 의 color = "+ c1.color + ", gearType = "+ c1.gearType + ", door = "+c1.door);
		System.out.println("c2 의 color = "+ c2.color + ", gearType = "+ c2.gearType + ", door = "+c2.door);
		
		
		/*
		 *c2 와 아래 Car(String color, String gearType, int door) 
		 *생성자 안에 this 는 같은 주소 값을 가짐
		 */
		System.out.println("c2 = "+c2);

	}

}
class Car{
	String color;
	String gearType;
	int door;
	Car(){
		
	}
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("this"+this);
	}
}