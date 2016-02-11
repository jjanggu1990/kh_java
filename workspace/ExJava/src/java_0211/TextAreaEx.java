/*
// header - edit "Data/yourJavaHeader" to customize
// contents - edit "EventHandlers/Java file/onCreate" to customize
//
*/
package java_0211;
import java.awt.*;

public class TextAreaEx{
	public static void main(String[] args){

		Frame f=new Frame("TextArea Test");
		Panel p=new Panel();
		
		TextArea ta1=new TextArea("default",5,30);
		TextArea ta2=new TextArea("Vertical Scroll",10,25, TextArea.SCROLLBARS_VERTICAL_ONLY);
		TextArea ta3=new TextArea("Scrollbas none",5,15,TextArea.SCROLLBARS_NONE);
		
		p.add(ta1);
		p.add(ta2);
		p.add(ta3);
		f.add(p);
		
		f.setSize(300,600);
		f.setVisible(true);
	}
}

