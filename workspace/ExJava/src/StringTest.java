public class StringTest {

	public static void main(String[] args) {
		String name="�ѱ�";
		try{
		String a = new String(name.getBytes("utf-8"),"iso-8859-1");
		System.out.println(a);
		}catch(Exception e){
			
		}
		
	}

}
