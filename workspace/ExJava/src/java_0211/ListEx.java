/*
// header - edit "Data/yourJavaHeader" to customize
// contents - edit "EventHandlers/Java file/onCreate" to customize
//
*/
package java_0211;

import java.awt.*;

class ListEx{
	public static void main(String[] arsg){

		Frame f=new Frame("����Ʈ �׽�Ʈ");
		Panel p=new Panel();
		
		//�������� ���ڴ� �ѹ��� �����ִ� ����
		//boolean �� �ѹ��� �������� ������ �� �ִ°�
		List list1=new List(2,true);
		
		list1.add("����");
		list1.add("�뱸");
		list1.add("����");
		list1.add("�λ�");
		list1.select(1);
		list1.select(3);
		p.add(list1);
		
		f.add(p);
		f.setSize(300,100);
		f.setVisible(true);
		System.out.println(list1.getSelectedItem());
	}
}
