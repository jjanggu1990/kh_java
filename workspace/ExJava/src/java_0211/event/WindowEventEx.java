package java_0211.event;
import java.awt.*;
import java.awt.event.*;

class WindowEventEx extends Frame implements WindowListener{
	public WindowEventEx(){
		super("WihdowEvent �׽�Ʈ");
		
		Label exit = new Label("�������� ���� ��ư�� ���� �ּ���");

		add(exit);

		setBounds(300,300,200,200);
		setVisible(true);
		
		addWindowListener(new WindowEventHandler1());
		//addWindowListener(this);
	}

	public static void main(String[] args){
		new WindowEventEx();
	}

	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
		
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}	
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}


class WindowEventHandler1 extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
	
}