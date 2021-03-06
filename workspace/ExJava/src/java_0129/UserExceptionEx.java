package java_0129;

class UserException extends Exception{

	private int port = 772;
	public UserException(String msg){
		super(msg);
	}
	public UserException(String msg, int port){
		super(msg);
		this.port = port;
	}
	public int getPort(){
		return port;
	}
}


class UserExceptionEx {

	public static void main(String[] args) {
		UserExceptionEx ue = new UserExceptionEx();
		String [] str = {"a"};
		try{
			ue.test1(str);
			
		}catch(UserException e){
			e.printStackTrace();
		}
	}

	public void test1(String[] n) throws UserException{
		System.out.println("Test1");
		if(n.length < 1)
			throw new UserException("아무것도 없다네"); // 강제 exception 발생
		else
			throw new UserException("최종 예선",703); // 강제 exception 발생
	}
}
