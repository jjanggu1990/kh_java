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
		super("메모장 - 제목없음");

		mb = new MenuBar();

		mnufile = new Menu("파일");
		mnuedit = new Menu("편집");
		mnuhelp = new Menu("도움말");

		mnunew = new MenuItem("새파일");
		mnuopen = new MenuItem("열기");
		mnusave = new MenuItem("저장");
		mnuexit = new MenuItem("종료");

		mnucopy = new MenuItem("복사하기");
		mnucut = new MenuItem("잘라내기");
		mnupaste = new MenuItem("붙여넣기");
		mnuall = new MenuItem("전체선택");
		mnudelete = new MenuItem("삭제");

		mnuhelpinfo = new MenuItem("메모장 정보...");

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

		if (name.equals("새파일")) {
			if (bModify) {
				MessageBox();
				if (bSaveas) {
					saveFile();
				}
			}
			ta.setText("");
			ta.requestFocus();
		} else if (name.equals("열기")) {
			openfile = new FileDialog(this, "Open", FileDialog.LOAD);
			openfile.show();
			ta.requestFocus();
		} else if (name.equals("저장")) {
			bSaveas = true;
			saveFile();
			ta.requestFocus();
		} else if (name.equals("종료")) {
			if (bModify) {
				MessageBox();
				if (bSaveas) {
					saveFile();
				}
			}
			System.exit(0);
		} else if (name.equals("복사하기")) {
			String data = ta.getSelectedText(); // textarea에서 선택이 된것을 얻어옴
			StringSelection ss = new StringSelection(data);
			cb.setContents(ss, ss);
		} else if (name.equals("잘라내기")) {
			String data = ta.getSelectedText(); // textarea에서 선택이 된것을 얻어옴
			StringSelection ss = new StringSelection(data);
			cb.setContents(ss, ss);
			ta.replaceRange("", ta.getSelectionStart(), ta.getSelectionEnd());
		} else if (name.equals("붙여넣기")) {
			try // getTransferData라는 함수 때문에 예외처리가 나타남으로 try ~ catch문 사용
			{
				Transferable content = cb.getContents(DataFlavor.stringFlavor);
				// getContents는 클립보드에서 얻어오는 것
				String data = (String) content.getTransferData(DataFlavor.stringFlavor);
				// getTransferData는 입출력 관련
				ta.insert(data, ta.getCaretPosition());
				// Window에서는 위치를 cursor라 하지 않고 Caret이라 한다.
			} catch (Exception ex) {
			}
		} else if (name.equals("전체선택")) {
			ta.selectAll();
		} else if (name.equals("삭제")) {
			ta.replaceRange("", ta.getSelectionStart(), ta.getSelectionEnd());
		} else if (name.equals("예")) {
			bSaveas = true;
			messagebox.hide();
		} else if (name.equals("아니오")) {
			bSaveas = false;
			messagebox.hide();
		} else if (name.equals("메모장 정보...")) {
			d1 = new Dialog(this, "메모 정보");
			d1.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					d1.setVisible(false);
				}
			});
			Panel pa = new Panel();
			pa.setLayout(new FlowLayout());
			bu1 = new Button("확인");
			bu1.addActionListener(this);
			pa.add(bu1);

			Label la1 = new Label("Copyright (c) : 2006-02-01");
			Label la2 = new Label("메모장 테스트 버전입다...");

			d1.setLayout(new GridLayout(3, 1));

			d1.add(la1);
			d1.add(la2);
			d1.add("South", pa);

			d1.pack();
			d1.setSize(300, 120);
			d1.show();
		} else if (name.equals("확인")) {
			d1.hide();
		}

	}

	public static void main(String[] args) {
		Memo memo = new Memo();
	}

	public void MessageBox() {
		messagebox = new Dialog(this, "저장 확인", true);

		Label l = new Label("저장하시겠습니까?");
		yes = new Button("예");
		no = new Button("아니오");
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
			saveFile = new FileDialog(this, "저장", FileDialog.SAVE);
			saveFile.show();
		}
		bSaveas = false;
		bModify = false;
	}
}
