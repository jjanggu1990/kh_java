package java_0129;

class TaxiTest {

	public static void main(String[] args) {
		Taxi t = new Taxi("�����ý�");
		t.setFare();
		t.speedUp();
		t.speedUp();
		t.account();
		
		System.out.println(t);

	}

}