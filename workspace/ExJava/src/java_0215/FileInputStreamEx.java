package java_0215;

import java.io.*;

public class FileInputStreamEx {
	public static void main(String arg[]) {

		// InputStream �̹Ƿ�, 1byte �� �о� ����.
		// �׷��Ƿ� byte �迭�� ������

		//trim �� �� �� ������ ���ִ� ��.
		FileInputStream fis = null;
		byte _read[] = new byte[100];
		byte console[] = new byte[100];
		try {
			System.out.print("���ϸ� : ");
			System.in.read(console);
			String file = new String(console).trim();
			fis = new FileInputStream(file);
			fis.read(_read);
			System.out.println(new String(_read).trim());
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}