package java_0202;

import java.util.StringTokenizer;

class StringTokenizerEx1 {
	
	StringTokenizer st;
	public StringTokenizerEx1(String str){
		System.out.println("str : "+str);
		st = new StringTokenizer(str);
	}
	
	public StringTokenizerEx1(String str, String delim){
		System.out.println("str : "+str);
		st = new StringTokenizer(str, delim);
		//����° �Ű����� , boolean ���� true �� �ָ�, �����ڵ� ��ū���� ���� �ȴ�.
	}
	
	public void print(){
		System.out.println("Token count : "+ st.countTokens());
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("------------------------------");
	}

	public static void main(String[] args) {
		StringTokenizerEx1 st1 = new StringTokenizerEx1("Happy day");
		st1.print();
		
		StringTokenizerEx1 st2 = new StringTokenizerEx1("2005/08/15","/");
		st2.print();

	}

}
