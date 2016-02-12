package java_0212;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.*;

class Test extends JFrame{
	JButton btn;
	Border bor = new LineBorder(Color.blue);
	Test(){
		btn = new JButton("Border");
		btn.setBorder(bor);
		add(btn);
		setVisible(true);
		setBounds(100,100 , 300,300);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test();
	}

}
