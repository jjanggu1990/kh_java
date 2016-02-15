package java_0215;

import java.io.*;

public class FileOutputStreamEx {
	public static void main(String arg[]) throws FileNotFoundException, IOException {
		FileOutputStream fos = null;
		String path = "f:\\fileout.txt";
		try {

			/*
			 * �ι�° ���ڴ� �̾� ���� ���. �⺻���� false ��� ���� ��.
			 */

			// fos = new FileOutputStream("f:\\fileout.txt");

			fos = new FileOutputStream(path, true);

			String message = "Hello FileOutputStream!!";
			fos.write(message.getBytes());
			fos.close();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

		/*
		 * File f1 = new File(path); System.out.println(f1.exists());
		 * ������ �����ϴ��� ���� ��
		 */

	}
}