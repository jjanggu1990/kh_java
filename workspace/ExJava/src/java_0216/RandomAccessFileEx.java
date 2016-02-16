package java_0216;

import java.io.*;
public class RandomAccessFileEx {
	public static void main(String[] args) {
		RandomAccessFile ra = null;
		try {
			ra = new RandomAccessFile("f:\\random.txt", "rw");
			String receive = "�ѱ����ȵǴ°ǰ�";
			ra.seek(ra.length());
			ra.write(receive.getBytes());
			byte[] buf = new byte[(int) ra.length()];
			ra.seek(0);
			ra.read(buf);
			System.out.print("ó�� ���� ���� : ");
			System.out.println(new String(buf));
			ra.seek(4);
			ra.read(buf);
			System.out.println(ra.length());
			System.out.print("�ٽ� ���� ���� : ");
			System.out.println(new String(buf).trim());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (ra != null) ra.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}