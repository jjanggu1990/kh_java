package java_0211;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Test extends JFrame implements ActionListener{
	
	JTextField tf;
	JButton bt []  =  new JButton [30];
	JPanel panel_top, panel_bottom;
	
	Test(){
		for(int i =0;i<10; i++){
			bt[i] = new JButton(i+"");
			bt[i].addActionListener(this);
		}
		panel_top = new JPanel();
		panel_top.setLayout(new GridLayout(1, 0));
		panel_bottom = new JPanel();
		panel_bottom.setLayout(new GridLayout(4, 0));
		tf = new JTextField();
		tf.setEditable(false);
		bt[10] = new JButton("C");
		bt[10].addActionListener(this);
		bt[11] = new JButton("+");
		bt[11].addActionListener(this);
		bt[12] = new JButton("-");
		bt[12].addActionListener(this);
		bt[13] = new JButton("*");
		bt[13].addActionListener(this);
		bt[14] = new JButton("/");
		bt[14].addActionListener(this);
		bt[15] = new JButton("=");
		bt[15].addActionListener(this);
		setResizable(false);
		setLayout(new BorderLayout());
		
		panel_top.add(tf);
		panel_bottom.add(bt[7]);
		panel_bottom.add(bt[8]);
		panel_bottom.add(bt[9]);
		panel_bottom.add(bt[11]);
		
		panel_bottom.add(bt[4]);
		panel_bottom.add(bt[5]);
		panel_bottom.add(bt[6]);
		panel_bottom.add(bt[12]);
		
		panel_bottom.add(bt[1]);
		panel_bottom.add(bt[2]);
		panel_bottom.add(bt[3]);
		panel_bottom.add(bt[13]);
		
		panel_bottom.add(bt[10]);
		panel_bottom.add(bt[0]);
		panel_bottom.add(bt[14]);
		panel_bottom.add(bt[15]);
		add(panel_top,BorderLayout.NORTH);
		add(panel_bottom,BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500,500 , 200,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test();
	}
	String tmp = "";
	String signal = "";
	String tmp2 = "";
	@Override
	public void actionPerformed(ActionEvent e) {
		String arg = e.getActionCommand();
		
		if(arg.equals("1")){
			tmp+= arg;
			tf.setText(tmp);
			System.out.println(1);
		}else if(arg.equals("2")){
			tmp+= arg;
			tf.setText(tmp);
			System.out.println(2);
		}else if(arg.equals("3")){
			tmp+= arg;
			tf.setText(tmp);
			System.out.println(3);
		}else if(arg.equals("4")){
			tmp+= arg;
			tf.setText(tmp);
			System.out.println(4);
		}else if(arg.equals("5")){
			tmp+= arg;
			tf.setText(tmp);
			System.out.println(5);
		}else if(arg.equals("6")){
			tmp+= arg;
			tf.setText(tmp);
			System.out.println(6);
		}else if(arg.equals("7")){
			tmp+= arg;
			tf.setText(tmp);
			System.out.println(7);
		}else if(arg.equals("8")){
			tmp+= arg;
			tf.setText(tmp);
			System.out.println(8);
		}else if(arg.equals("9")){
			tmp+= arg;
			tf.setText(tmp);
			System.out.println(9);
		}else if(arg.equals("0")){
			tmp+= arg;
			tf.setText(tmp);
			System.out.println(0);
		}else if(arg.equals("+")){
			tmp2 = tf.getText();
			signal = "+";
			tf.setText("");
			tmp = "";
		}else if(arg.equals("-")){
			tmp2 = tf.getText();
			signal = "-";
			tf.setText("");
			tmp = "";
		}else if(arg.equals("*")){
			tmp2 = tf.getText();
			signal = "*";
			tf.setText("");
			tmp = "";
		}else if(arg.equals("/")){
			tmp2 = tf.getText();
			signal = "/";
			tf.setText("");
			tmp = "";
		}else if(arg.equals("C")){
			tmp2 = "";
			tf.setText("");
			tmp = "";
			signal = "";
		}
		
		
		else if(arg.equals("=")){
			int b=0,a=0;
			try{
			b = Integer.parseInt(tmp);
			a = Integer.parseInt(tmp2);
			}catch(Exception ex){}
			if(signal.equals("+")){
				tf.setText((a+b)+"");
				tmp = "";
				tmp2 = "";
				signal ="";
			}else if(signal.equals("-")){
				tf.setText((a-b)+"");
				tmp = "";
				tmp2 = "";
				signal ="";
			}else if(signal.equals("*")){
				tf.setText((a*b)+"");
				tmp = "";
				tmp2 = "";
				signal ="";
			}else if(signal.equals("/")){
				tf.setText((a/(double)b)+"");
				tmp = "";
				tmp2 = "";
				signal ="";
			}
			
		}
		
	}

}
