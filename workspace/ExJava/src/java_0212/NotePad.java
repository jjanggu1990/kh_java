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
		super("메모장");

		fc = new JFileChooser();
		jmenubar = new JMenuBar();
		jtextarea = new JTextArea();
		
		jscrollpanel = new JScrollPane(jtextarea);
		jscrollpanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jscrollpanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		//JMenu
		jmenu_file = new JMenu("파일");
		jmenu_edit = new JMenu("편집");
		jmenu_help = new JMenu("도움말");
		
		//JMenuItem
		jmenuitem_newfile = new JMenuItem("새파일");
		jmenuitem_open = new JMenuItem("열기");
		jmenuitem_save = new JMenuItem("저장");
		jmenuitem_exit = new JMenuItem("종료");
		jmenuitem_cut = new JMenuItem("잘라내기");
		jmenuitem_copy = new JMenuItem("복사하기");
		jmenuitem_paste = new JMenuItem("붙여넣기");
		jmenuitem_selectall = new JMenuItem("전체선택");
		jmenuitem_delete = new JMenuItem("삭제");
		jmenuitem_help = new JMenuItem("도움말");
		
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
		
		//frame에서 종료버튼 누를 때
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				int i = JOptionPane.showConfirmDialog(null,"종료하시겠습니까?", "종료",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
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
		
		if(value.equals("새파일")){
			if(jtextarea.getText().equals("")){}
			else{
				int i = JOptionPane.showConfirmDialog(null,"저장하시겠습니까?", "저장",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
				if(i==0){
					JOptionPane.showMessageDialog(null,"저장");
					jtextarea.setText("");
				}else{

				}
			}
		}else if(value.equals("열기")){
			fc.showOpenDialog(this);
		}else if(value.equals("저장")){
			JOptionPane.showMessageDialog(null,"저장");
		}else if(value.equals("종료")){
			int i = JOptionPane.showConfirmDialog(null,"저장하시겠습니까?", "저장",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
			if(i==0){
				JOptionPane.showMessageDialog(null,"저장");
				System.exit(0);
			}else{
				System.exit(0);
			}
		}else if(value.equals("잘라내기")){
			tmp = jtextarea.getSelectedText();
			jtextarea.replaceRange("", jtextarea.getSelectionStart(), jtextarea.getSelectionEnd());
		}else if(value.equals("복사하기")){
			tmp = jtextarea.getSelectedText();
		}else if(value.equals("붙여넣기")){
			jtextarea.insert(tmp, jtextarea.getCaretPosition());
		}else if(value.equals("전체선택")){
			jtextarea.selectAll();
		}else if(value.equals("삭제")){
			jtextarea.replaceRange("", jtextarea.getSelectionStart(), jtextarea.getSelectionEnd());
		}else if(value.equals("도움말")){
			JOptionPane.showMessageDialog(null, jtextarea.getText());
		}
	}

	public static void main(String[] args) {
		new NotePad();
	}
}