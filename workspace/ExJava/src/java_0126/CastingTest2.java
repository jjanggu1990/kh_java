package java_0126;

class CastingTest2 {
	public static void main(String args[]) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		car.drive();
		fe = (FireEngine)car;		//실행 시 에러가 발생한다.
		fe.drive();
		car2 = fe;
		car2.drive();

		//FireEngine fe3 = new Car();
		//이와 같은 문제
	}
}