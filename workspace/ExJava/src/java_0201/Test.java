package java_0201;

class Test {

	public static void main(String[] args) {
		String a = "a";
		String b = "a";
		if(a==b){
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}
		String c = new String("a");
		String d = new String("a");
		
		if(c==d){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
	}

}
