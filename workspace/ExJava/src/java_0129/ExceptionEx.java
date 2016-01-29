package java_0129;

class ExceptionEx {

	public static void main(String[] args) {
		int[] i = { 10, 20, 30 };
		
		//ArrayIndexOutOfBoundsException 발생!!
		for (int j = 0; j <= i.length; j++) {
			try{
				System.out.println(j+1 +" 실행");
				System.out.println("예외아님 : "+i[j]);
				//예외발생문장 아래는 포기하고 catch 실행
				System.out.println(j+1 + "~~~~~~~~~");
			}catch(Exception ae){
				//ae.printStackTrace();
				System.out.println("범위 초과");
			}
		}
		System.out.println("program END");
	}
}
