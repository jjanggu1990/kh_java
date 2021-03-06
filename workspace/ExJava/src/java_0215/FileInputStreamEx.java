package java_0215;

import java.io.*;

public class FileInputStreamEx {
	public static void main(String arg[]) {

		// InputStream 이므로, 1byte 씩 읽어 들임.
		// 그러므로 byte 배열로 저장함

		//trim 은 앞 뒤 공백을 없애는 것.
		FileInputStream fis = null;
		byte _read[] = new byte[100];
		byte console[] = new byte[100];
		try {
			System.out.print("파일명 : ");
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
