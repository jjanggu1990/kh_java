package java_0212;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;


class NotePad extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JMenuBar jmenubar;
	JMenu jmenu_file, jmenu_edit, jmenu_help;
	JMenuItem jmenuitem_newfile,jmenuitem_open,jmenuitem_save,jmenuitem_exit,
	jmenuitem_cut, jmenuitem_copy,jmenuitem_paste,jmenuitem_selectall,jmenuitem_delete,
	jmenuitem_help;
	
	JPanel jpanel;
	JTextArea jtextarea;
	JScrollPane jscrollpanel;
	JFileChooser fc;
	NotePad(){
		super("�޸���");

		fc = new JFileChooser();
		jmenubar = new JMenuBar();
		jtextarea = new JTextArea();
		
		jscrollpanel = new JScrollPane(jtextarea);
		jscrollpanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jscrollpanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		//JMenu
		jmenu_file = new JMenu("����");
		jmenu_edit = new JMenu("����");
		jmenu_help = new JMenu("����");
		
		//JMenuItem
		jmenuitem_newfile = new JMenuItem("������");
		jmenuitem_open = new JMenuItem("����");
		jmenuitem_save = new JMenuItem("����");
		jmenuitem_exit = new JMenuItem("����");
		jmenuitem_cut = new JMenuItem("�߶󳻱�");
		jmenuitem_copy = new JMenuItem("�����ϱ�");
		jmenuitem_paste = new JMenuItem("�ٿ��ֱ�");
		jmenuitem_selectall = new JMenuItem("��ü����");
		jmenuitem_delete = new JMenuItem("����");
		jmenuitem_help = new JMenuItem("����");
		
		jmenuitem_newfile.addActionListener(this);
		jmenuitem_open.addActionListener(this);
		jmenuitem_save.addActionListener(this);
		jmenuitem_exit.addActionListener(this);
		jmenuitem_cut.addActionListener(this);
		jmenuitem_copy.addActionListener(this);
		jmenuitem_paste.addActionListener(this);
		jmenuitem_selectall.addActionListener(this);
		jmenuitem_delete.addActionListener(this);
		
		jmenuitem_help.addActionListener(this);
		
		
		
		jmenu_file.add(jmenuitem_newfile);
		jmenu_file.add(jmenuitem_open);
		jmenu_file.add(jmenuitem_save);
		jmenu_file.add(jmenuitem_exit);
		
		jmenu_edit.add(jmenuitem_cut);
		jmenu_edit.add(jmenuitem_copy);
		jmenu_edit.add(jmenuitem_paste);
		jmenu_edit.add(jmenuitem_selectall);
		jmenu_edit.add(jmenuitem_delete);
		
		jmenu_help.add(jmenuitem_help);
		
		jmenubar.add(jmenu_file);
		jmenubar.add(jmenu_edit);
		jmenubar.add(jmenu_help);
		
		add(jscrollpanel,BorderLayout.CENTER);
		add(jmenubar,BorderLayout.NORTH);
		
		
		
		setBounds(100,100,300,500);
		setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		//frame���� �����ư ���� ��
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				int i = JOptionPane.showConfirmDialog(null,"�����Ͻðڽ��ϱ�?", "����",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
				if(i == 0){
					System.exit(0);
				}
				else{
				}
			}
		});
	}
	String tmp ="";
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String value = arg0.getActionCommand();
		
		if(value.equals("������")){
			if(jtextarea.getText().equals("")){}
			else{
				int i = JOptionPane.showConfirmDialog(null,"�����Ͻðڽ��ϱ�?", "����",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
				if(i==0){
					JOptionPane.showMessageDialog(null,"����");
					jtextarea.setText("");
				}else{

				}
			}
		}else if(value.equals("����")){
			fc.showOpenDialog(this);
		}else if(value.equals("����")){
			JOptionPane.showMessageDialog(null,"����");
		}else if(value.equals("����")){
			int i = JOptionPane.showConfirmDialog(null,"�����Ͻðڽ��ϱ�?", "����",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
			if(i==0){
				JOptionPane.showMessageDialog(null,"����");
				System.exit(0);
			}else{
				System.exit(0);
			}
		}else if(value.equals("�߶󳻱�")){
			tmp = jtextarea.getSelectedText();
			jtextarea.replaceRange("", jtextarea.getSelectionStart(), jtextarea.getSelectionEnd());
		}else if(value.equals("�����ϱ�")){
			tmp = jtextarea.getSelectedText();
		}else if(value.equals("�ٿ��ֱ�")){
			jtextarea.insert(tmp, jtextarea.getCaretPosition());
		}else if(value.equals("��ü����")){
			jtextarea.selectAll();
		}else if(value.equals("����")){
			jtextarea.replaceRange("", jtextarea.getSelectionStart(), jtextarea.getSelectionEnd());
		}else if(value.equals("����")){
			JOptionPane.showMessageDialog(null, jtextarea.getText());
		}
	}

	public static void main(String[] args) {
		new NotePad();
	}
}