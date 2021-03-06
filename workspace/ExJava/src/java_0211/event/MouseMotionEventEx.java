package java_0211.event;
import java.awt.*;
import java.awt.event.*;

class MouseMotionEventEx extends Frame implements ActionListener, MouseMotionListener{

	Label move = new Label("마우스 따라 다니기", Label.CENTER);
	Button exit = new Button("종료");
	
	public MouseMotionEventEx(){
		setTitle("MouseMotionEvent 테스트");
		
		setLayout(null);

		move.setBounds(100,50,150,20);
		exit.setBounds(250,500,50,30);

		move.setBackground(Color.red);
		
		add(move);
		add(exit);
		
		setBounds(300,100,500,600);
		setVisible(true);
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("windowOpened");
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("windowIconified");
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("windowDeiconified");
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("windowDeactivated");
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("windowClosing");
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("windowClosed");
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("windowActivated");
			}
		});
		exit.addActionListener(this);
		addMouseMotionListener(this);
	}
	
	public static void main(String args[]){
		new MouseMotionEventEx();
	}
	
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}
	
	public void mouseMoved(MouseEvent e){
		Point p = e.getPoint();
		move.setLocation(p);
	}
	
	public void mouseDragged(MouseEvent e){}
}
		
		
	
