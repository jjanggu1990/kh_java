/*
// header - edit "Data/yourJavaHeader" to customize
// contents - edit "EventHandlers/Java file/onCreate" to customize
//
*/
package java_0211;

import java.awt.*;

class ListEx{
	public static void main(String[] arsg){

		Frame f=new Frame("리스트 테스트");
		Panel p=new Panel();
		
		//생성자의 숫자는 한번에 보여주는 갯수
		//boolean 은 한번에 여러개를 선택할 수 있는가
		List list1=new List(2,true);
		
		list1.add("서울");
		list1.add("대구");
		list1.add("대전");
		list1.add("부산");
		list1.select(1);
		list1.select(3);
		p.add(list1);
		
		f.add(p);
		f.setSize(300,100);
		f.setVisible(true);
		System.out.println(list1.getSelectedItem());
	}
}

