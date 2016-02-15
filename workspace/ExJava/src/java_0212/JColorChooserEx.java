package java_0212;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class JColorChooserEx extends JFrame implements ActionListener{
	
	JMenuBar mb =new JMenuBar();
	JMenu mnuselect = new JMenu("����");
	JMenuItem mnucolor=new JMenuItem("����");
	JLabel l=new JLabel("���â");
	JTextArea ta=new JTextArea();
			
	public JColorChooserEx(){
		super("JColorChooser �׽�Ʈ");
			
		mnuselect.add(mnucolor);
		
		mb.add(mnuselect);
		
		setJMenuBar(mb);
		
		add("North",l);
		add("Center",ta);
		
		setBounds(300, 300, 300, 200);
		setVisible(true);
		
		mnucolor.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==mnucolor){
			JColorChooser chooser = new JColorChooser();
			Color col=chooser.showDialog(this,"������ ��������",Color.blue);
			l.setText("������ ������"+col);
			ta.setBackground(col);
		}
	}
	
	public static void main(String[] args){
		new JColorChooserEx();
	}
}