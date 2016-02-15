package java_0215;

import java.io.*;
public class FileWriterEx {
	public static void main(String arg[]) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("f:\\fileWriter.txt");
			// fw = new FileWriter("c:\\fileWriter.txt",true);
			String message = "안녕하세요 FileWriter 테스트\r\n테스트";
			fw.write(message);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (fw != null)	fw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}