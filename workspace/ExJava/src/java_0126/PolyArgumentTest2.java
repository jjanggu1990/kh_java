package java_0126;

class PolyArgumentTest2 {

	public static void main(String[] args) {
		
		Buyer1 b = new Buyer1();
		Tv1 tv = new Tv1();
		Computer1 com = new Computer1();
		Audio1 audio = new Audio1();
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		

	}

}

class Product1{
	int price;
	int bonusPoint;
	
	Product1(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	Product1(){
		price = 0;
		bonusPoint=0;
		
	}
}


class Tv1 extends Product1{
	Tv1(){
		super(100);
	}
	
	public String toString(){
		return "Tv";
	}
}

class Computer1 extends Product1{
	Computer1(){
		super(200);
	}
	
	public String toString(){
		return "Computer";
	}
}

class Audio1 extends Product1{
	Audio1(){
		super(50);
	}
	
	public String toString(){
		return "Audio";
	}
}

class Buyer1{
	int money = 1000;
	int bonusPoint = 0;
	Product1[] item = new Product1[10];
	int i = 0;
	
	void buy(Product1 p){
		if(money < p.price){
			System.out.println("�ܾ� ����");
			return;
		}
		
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	
	void summary(){
		int sum =0;
		String itemList="";
		for(int i = 0; i<item.length;i++){
			if(item[i] == null)break;
			sum+= item[i].price;
			itemList += item[i] + ", ";
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum+"�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+itemList + "�Դϴ�.");
		
	}
}