package java_0122;

class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10;
		
		ctv.channelUp();
		
		System.out.println(ctv.channel);
		ctv.displaycaption("1_Hello, World");
		ctv.caption = true;
		ctv.displaycaption("2_Hello, world");

	}

}


class Tv{
	boolean power;
	int channel;
	
	void power(){power = !power;}
	void channelUp(){ ++channel;}
	void channelDown(){--channel;}
	
}


class CaptionTv extends Tv{
	boolean caption;
	void displaycaption(String text){
		if(caption){
			System.out.println(text);
		}
	}
}