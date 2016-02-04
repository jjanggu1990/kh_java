package java_0204;
import java.util.*;


/*
 * 
 * roll �޼ҵ�� �ش� ���� ���ϰ�
 * add �޼ҵ�� �ش� ���� ���Կ� ���� ��, �� ���� �� ���� ���Ѵ�.
 * 
 * 
 */


class  CalendarEx4 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();

		date.set(2014, 7, 31);	// 2014�� 8�� 31��
		
		System.out.println(toString(date));
		System.out.println("= 1�� �� =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date)); //9/1

		System.out.println("= 6�� �� =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date)); //3/1

		System.out.println("= 31�� ��(roll) =");
		date.roll(Calendar.DATE, 31);			//roll�� �ش� ���� ����
		System.out.println(toString(date)); // 


		System.out.println("= 31�� ��(add) =");
		date.add(Calendar.DATE, 31);			
		System.out.println(toString(date)); // 4/1
		
		
/*
 * �� ���� 2����  31���� �������� �����Ƿ�, 29�Ϸ� ����ȴ�.
 */
		date.set(2016, 0, 31);
		date.roll(Calendar.MONTH, 1);
		System.out.println(toString(date));
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"�� "+ (date.get(Calendar.MONTH)+1) + "�� " + date.get(Calendar.DATE) + "��";
	}
}













