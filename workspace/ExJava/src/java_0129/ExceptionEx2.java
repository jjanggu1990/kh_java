package java_0129;

class ExceptionEx2 {
	public static void main(String[] args) {
		try{
			int data = Integer.parseInt(args[0]);
			System.out.println(50/data);
		}catch(NumberFormatException ne){
			System.out.println("���ڰ� �ƴմϴ�. ���ڸ� �Է��Ͻÿ�.");
		}catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("�Ű������� ����.");
		}catch(ArithmeticException ae){
			System.out.println("0���� ������ ������.");
		}catch (Exception e){
			System.out.println("�� ���� ���� �Դϴ�.");
		}finally{
			System.out.println("������ ����");
		}
		//���� ū ������ Exception �� �������� ��ġ�ؾ� �Ѵ�.
		//finally�� return �������� ���� ����. ������ ����
		try{
			
		}finally{
			
		}
	}
}