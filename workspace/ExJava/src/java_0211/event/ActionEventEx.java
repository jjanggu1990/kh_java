package java_0211.event;

import java.awt.*;
import java.awt.event.*;

public class ActionEventEx extends Frame implements ActionListener{
	Panel p;
	Button input, exit;
	TextArea ta;

	public ActionEventEx(){
	
		super("ActionEvent Test");

		p=new Panel();
		
		input=new Button("�Է�");
		exit=new Button("����");
		ta=new TextArea();
		
		input.addActionListener(this);
		exit.addActionListener(this);
				
		p.add(input);
		p.add(exit);
		
		add(p, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);

		setBounds(300,300, 300, 200);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		String name;
		name=ae.getActionCommand();
		
		if(name.equals("�Է�"))
			for(int i =0;i<10;i++){
				ta.append("��ư�� �ԷµǾ����ϴ�."+(i+1)+"\n");
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
				
			}
		else if(name.equals("����"))
		{
			ta.append("���α׷��� �����մϴ�.\n");
			try{
					Thread.sleep(1000);
			}catch(Exception e){}

			System.exit(0);
		}
	}
	
	public static void main(String[] args){
		new ActionEventEx();	
	}
}
