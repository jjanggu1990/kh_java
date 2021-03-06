package java_0215;

import java.io.*;

/*
 * Buffer가 먼저 비워져야만 fileoutputstream 이 닫 힐 수 있다.
 * 그러므로, 버퍼의 flush() 메소드를 먼저 실행하거나, 버퍼를 먼저 닫아 줘야만 한다.
 * 
 */

public class BufferedOutputStreamEx {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("f:\\bufferOut.txt", true);
			bos = new BufferedOutputStream(fos);
			String str = "BufferedOutputStream Test 입니다.";
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
