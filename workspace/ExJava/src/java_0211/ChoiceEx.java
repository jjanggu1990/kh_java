/*
// header - edit "Data/yourJavaHeader" to customize
// contents - edit "EventHandlers/Java file/onCreate" to customize
//
*/
package java_0211;
import java.awt.*;

class ChoiceEx{
	public static void main(String[] args){

		Frame f=new Frame("Choice �׽�Ʈ");
		Panel p=new Panel();
		
		Choice ch= new Choice();
		
		ch.addItem("���");
		ch.addItem("����");
		ch.addItem("��");
		ch.addItem("�ٳ���");
		ch.insert("insert", 1);
		
		System.out.println(ch.getSelectedItem());
		
		p.add(ch);
		
		f.add(p);
		
		f.setSize(300,100);
		f.setVisible(true);
	}
}

