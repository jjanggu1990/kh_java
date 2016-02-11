package java_0211;
import java.awt.*;
	
class FrameEx1{
	public static void main(String args[]){
		Frame f = new Frame();
		f.setTitle("Frame Test");

		f.setSize(300,300);
		f.setAlwaysOnTop(true);
		f.setResizable(false);
		f.setVisible(true);
	}
}
