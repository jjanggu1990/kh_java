package java_0202;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class InnerEx7 
{
	public static void main(String[] args) 
	{
		Frame fr = new Frame("test");
		fr.setBounds(500,500,200,100);
		Button b = new Button("Start");
		b.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						System.out.println(e.getID());
					}
				});
		fr.add(b);
		fr.setVisible(true);
		
	}
}

/*
class EventHandler implements ActionListener
{
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
		System.out.println(e.getActionCommand());
	}
}*/