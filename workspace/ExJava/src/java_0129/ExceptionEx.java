package java_0129;

class ExceptionEx {

	public static void main(String[] args) {
		int[] i = { 10, 20, 30 };
		
		//ArrayIndexOutOfBoundsException �߻�!!
		for (int j = 0; j <= i.length; j++) {
			try{
				System.out.println(j+1 +" ����");
				System.out.println("���ܾƴ� : "+i[j]);
				//���ܹ߻����� �Ʒ��� �����ϰ� catch ����
				System.out.println(j+1 + "~~~~~~~~~");
			}catch(Exception ae){
				//ae.printStackTrace();
				System.out.println("���� �ʰ�");
			}
		}
		System.out.println("program END");
	}
}