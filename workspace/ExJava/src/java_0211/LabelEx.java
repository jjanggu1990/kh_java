/*
// header - edit "Data/yourJavaHeader" to customize
// contents - edit "EventHandlers/Java file/onCreate" to customize
//
*/
package java_0211;
import java.awt.*;

class LabelEx{
	public static void main(String[] args){

		Frame f=new Frame("���̺� �׽�Ʈ");
		Panel p=new Panel();
		
		Label label1=new Label("�������̺�1");
		Label label2=new Label("�������̺�2", Label.CENTER);
		Label label3=new Label("�������̺�3", Label.LEFT);
		Label label4=new Label("�������̺�4", Label.RIGHT);

		label1.setBackground(Color.red);
		label2.setBackground(Color.blue);
		label3.setBackground(Color.gray);
		label4.setBackground(Color.yellow);
		p.add(label1);
		p.add(label2);
		p.add(label3);
		p.add(label4);
		
		f.add(p);
		
		//f.setSize(300,100);
		f.setBounds(500,300,300,100);
		f.setVisible(true);	
	}
}
