package java_0201;

class CardToString {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("CLOVER",12);
		
		System.out.println(c1);
		System.out.println(c2.toString());

	}

}


class Card{
	String kind ;
	int num;
	Card(){
		this("SPADE",1);
	}
	Card(String kind, int num){
		if(1<=num && num<=13){
			this.kind = kind;
			this.num = num;
		}
		else{
			this.kind = kind;
			this.num = 1;
		}
	}
	
	public String toString(){
		if(11<=num && num <= 13){
			if(num == 11){
				return kind+"J";
			}else if(num == 12){
				return kind+"Q";
			}else{
				return kind+"K";
			}
		}
		return kind + num;
	}
}