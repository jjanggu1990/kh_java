package java_0121;

class _001CardTest {

	public static void main(String[] args) {
		System.out.println("Card.widte = " + Card.width);
		System.out.println("Card.height = "+ Card.height);
		
		Card c1 = new Card();
		c1.kind = "heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", "+c1.number);
		System.out.println("c2는 " + c2.kind + ", "+c2.number);
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1의 너비 "+c1.width + " c1의 높이 "+c1.height);

	}

}

class Card{
	String kind;
	int number;
	static int width;
	static int height;
}
