package java_0129;

class ThrowEx1 {
	
	//Exception이 발생할 수 있다.
	public void methodA(String [] n) throws Exception{
		if(n.length>0){
			for(String s : n){
				System.out.println(s);
				
			}
		}else{
			throw new Exception("배열에 요소가 없습니다.");
		}
	}

	public static void main(String[] args) {
		ThrowEx1 te = new ThrowEx1();

		try{
			te.methodA(args);
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}

}