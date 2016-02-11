/*
// header - edit "Data/yourJavaHeader" to customize
// contents - edit "EventHandlers/Java file/onCreate" to customize
//
*/
package java_0211;
import java.awt.*;

class ChoiceEx{
	public static void main(String[] args){

		Frame f=new Frame("Choice 테스트");
		Panel p=new Panel();
		
		Choice ch= new Choice();
		
		ch.addItem("사과");
		ch.addItem("딸기");
		ch.addItem("배");
		ch.addItem("바나나");
		ch.insert("insert", 1);
		
		System.out.println(ch.getSelectedItem());
		
		p.add(ch);
		
		f.add(p);
		
		f.setSize(300,100);
		f.setVisible(true);
	}
}

