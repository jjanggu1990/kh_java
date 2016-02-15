package java_0215;

import java.io.*;

/*
 * Buffer�� ���� ������߸� fileoutputstream �� �� �� �� �ִ�.
 * �׷��Ƿ�, ������ flush() �޼ҵ带 ���� �����ϰų�, ���۸� ���� �ݾ� ��߸� �Ѵ�.
 * 
 */

public class BufferedOutputStreamEx {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("f:\\bufferOut.txt", true);
			bos = new BufferedOutputStream(fos);
			String str = "BufferedOutputStream Test �Դϴ�.";
			bos.write(str.getBytes());
			bos.flush();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
				if (bos != null)
					bos.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}