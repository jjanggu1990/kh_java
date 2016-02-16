package java_0216;

import java.io.*;
public class RandomAccessFileEx {
	public static void main(String[] args) {
		RandomAccessFile ra = null;
		try {
			ra = new RandomAccessFile("f:\\random.txt", "rw");
			String receive = "한글은안되는건가";
			ra.seek(ra.length());
			ra.write(receive.getBytes());
			byte[] buf = new byte[(int) ra.length()];
			ra.seek(0);
			ra.read(buf);
			System.out.print("처음 읽은 내용 : ");
			System.out.println(new String(buf));
			ra.seek(4);
			ra.read(buf);
			System.out.println(ra.length());
			System.out.print("다시 읽은 내용 : ");
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