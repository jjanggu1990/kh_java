package java_0211;
import java.awt.*;

public class CanvasEx{

	public static void main(String[] args){
		Frame f=new Frame("Canvas �׽�Ʈ");
		
		MyCanvas canvas=new MyCanvas();
		
		canvas.setBackground(Color.yellow);
		
		f.add(canvas);
		
		f.setBounds(300,300,200,200);
//		f.setLocation(300,300);
//		f.setSize(200,200);
		f.setVisible(true);
	}
}

@SuppressWarnings("serial")
class MyCanvas extends Canvas
{
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.drawRect(20,20,100,100);
	}
}