package java_0212;

import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;

class Memo extends Frame implements ActionListener {
	MenuBar mb;

	Menu mnufile;
	Menu mnuedit;
	Menu mnuhelp;

	MenuItem mnunew;
	MenuItem mnuopen;
	MenuItem mnusave;
	MenuItem mnuexit;

	MenuItem mnucopy;
	MenuItem mnucut;
	MenuItem mnupaste;
	MenuItem mnuall;
	MenuItem mnudelete;

	MenuItem mnuhelpinfo;

	TextArea ta;

	FileDialog openfile;
	FileDialog savefile;

	Dialog messagebox;
	Button yes, no;

	Dialog d1;
	Button bu1;

	Clipboard cb;

	String str = "";

	boolean bModify = false, bSaveas = true;

	public Memo() {
		super("�޸��� - �������");

		mb = new MenuBar();

		mnufile = new Menu("����");
		mnuedit = new Menu("����");
		mnuhelp = new Menu("����");

		mnunew = new MenuItem("������");
		mnuopen = new MenuItem("����");
		mnusave = new MenuItem("����");
		mnuexit = new MenuItem("����");

		mnucopy = new MenuItem("�����ϱ�");
		mnucut = new MenuItem("�߶󳻱�");
		mnupaste = new MenuItem("�ٿ��ֱ�");
		mnuall = new MenuItem("��ü����");
		mnudelete = new MenuItem("����");

		mnuhelpinfo = new MenuItem("�޸��� ����...");

		mnufile.add(mnunew);
		mnufile.add(mnuopen);
		mnufile.add(mnusave);
		mnufile.addSeparator();
		mnufile.add(mnuexit);

		mnuedit.add(mnucut);
		mnuedit.add(mnucopy);
		mnuedit.add(mnupaste);
		mnuedit.addSeparator();
		mnuedit.add(mnuall);
		mnuedit.addSeparator();
		mnuedit.add(mnudelete);

		mnuhelp.add(mnuhelpinfo);

		mb.add(mnufile);
		mb.add(mnuedit);
		mb.add(mnuhelp);

		setMenuBar(mb);

		ta = new TextArea(20, 40);
		add(ta);

		setBounds(300, 200, 400, 400);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				if (bModify) {
					saveFile();
				}
				System.exit(0);
			}
		});

		mnunew.addActionListener(this);
		mnuopen.addActionListener(this);
		mnusave.addActionListener(this);
		mnuexit.addActionListener(this);
		mnucopy.addActionListener(this);
		mnucut.addActionListener(this);
		mnupaste.addActionListener(this);
		mnuall.addActionListener(this);
		mnudelete.addActionListener(this);
		mnuhelpinfo.addActionListener(this);

		ta.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				bModify = true;
			}
		});

		cb = getToolkit().getSystemClipboard();
	}

	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();

		if (name.equals("������")) {
			if (bModify) {
				MessageBox();
				if (bSaveas) {
					saveFile();
				}
			}
			ta.setText("");
			ta.requestFocus();
		} else if (name.equals("����")) {
			openfile = new FileDialog(this, "Open", FileDialog.LOAD);
			openfile.show();
			ta.requestFocus();
		} else if (name.equals("����")) {
			bSaveas = true;
			saveFile();
			ta.requestFocus();
		} else if (name.equals("����")) {
			if (bModify) {
				MessageBox();
				if (bSaveas) {
					saveFile();
				}
			}
			System.exit(0);
		} else if (name.equals("�����ϱ�")) {
			String data = ta.getSelectedText(); // textarea���� ������ �Ȱ��� ����
			StringSelection ss = new StringSelection(data);
			cb.setContents(ss, ss);
		} else if (name.equals("�߶󳻱�")) {
			String data = ta.getSelectedText(); // textarea���� ������ �Ȱ��� ����
			StringSelection ss = new StringSelection(data);
			cb.setContents(ss, ss);
			ta.replaceRange("", ta.getSelectionStart(), ta.getSelectionEnd());
		} else if (name.equals("�ٿ��ֱ�")) {
			try // getTransferData��� �Լ� ������ ����ó���� ��Ÿ������ try ~ catch�� ���
			{
				Transferable content = cb.getContents(DataFlavor.stringFlavor);
				// getContents�� Ŭ�����忡�� ������ ��
				String data = (String) content.getTransferData(DataFlavor.stringFlavor);
				// getTransferData�� ����� ����
				ta.insert(data, ta.getCaretPosition());
				// Window������ ��ġ�� cursor�� ���� �ʰ� Caret�̶� �Ѵ�.
			} catch (Exception ex) {
			}
		} else if (name.equals("��ü����")) {
			ta.selectAll();
		} else if (name.equals("����")) {
			ta.replaceRange("", ta.getSelectionStart(), ta.getSelectionEnd());
		} else if (name.equals("��")) {
			bSaveas = true;
			messagebox.hide();
		} else if (name.equals("�ƴϿ�")) {
			bSaveas = false;
			messagebox.hide();
		} else if (name.equals("�޸��� ����...")) {
			d1 = new Dialog(this, "�޸� ����");
			d1.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					d1.setVisible(false);
				}
			});
			Panel pa = new Panel();
			pa.setLayout(new FlowLayout());
			bu1 = new Button("Ȯ��");
			bu1.addActionListener(this);
			pa.add(bu1);

			Label la1 = new Label("Copyright (c) : 2006-02-01");
			Label la2 = new Label("�޸��� �׽�Ʈ �����Դ�...");

			d1.setLayout(new GridLayout(3, 1));

			d1.add(la1);
			d1.add(la2);
			d1.add("South", pa);

			d1.pack();
			d1.setSize(300, 120);
			d1.show();
		} else if (name.equals("Ȯ��")) {
			d1.hide();
		}

	}

	public static void main(String[] args) {
		Memo memo = new Memo();
	}

	public void MessageBox() {
		messagebox = new Dialog(this, "���� Ȯ��", true);

		Label l = new Label("�����Ͻðڽ��ϱ�?");
		yes = new Button("��");
		no = new Button("�ƴϿ�");
		Panel p = new Panel();

		p.add(yes);
		p.add(no);

		messagebox.add(l);
		messagebox.add("South", p);
		messagebox.pack();

		yes.addActionListener(this);
		no.addActionListener(this);

		messagebox.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				messagebox.hide();
			}
		});

		messagebox.show();
	}

	public void saveFile() {
		FileDialog saveFile;
		if (bSaveas) {
			saveFile = new FileDialog(this, "����", FileDialog.SAVE);
			saveFile.show();
		}
		bSaveas = false;
		bModify = false;
	}
}