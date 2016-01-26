package java_0126;

class InstanceofTest {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine){
			System.out.println("This is a FireEngine instance.");		
		}
		
		if(fe instanceof Car){
			System.out.println("This is a Car instance");
		}
		
		if(fe instanceof Object){
			System.out.println("This is an Object instance");
		}
		
		
		Car car = null;
		Car car1 = new Car();
		
		if(car1 instanceof FireEngine){
			System.out.println("car1을 FireEngine 으로 형변환 가능하냐?");
		}
	}

}
