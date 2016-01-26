package java_0126;

class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Product tv = new Tv();
		Product com = new Computer();
		
		b.buy(tv);
		b.buy(com);
		
		System.out.println("���� ���� ���� "+b.money +"�����Դϴ�.");
		System.out.println("���� ���ʽ������� "+b.bonuspoint + "");

	}

}

class Product{
	int price;
	int bonuspoint;
	
	Product(int price){

		this.price = price;
		bonuspoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv(){
		super(100);
	}
	public String toString(){
		return "Tv";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	
	public String toString(){
		return "Computer";
	}
}

class Buyer{
	int money = 1000;
	int bonuspoint = 0;
	
	void buy(Product p){
		if(money< p.price){
			System.out.println("�ܾ׺���");
			return;
		}
		
		money -= p.price;
		
		bonuspoint += p.bonuspoint;
		
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
		
	}
}