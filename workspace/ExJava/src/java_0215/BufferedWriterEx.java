package java_0215;

import java.io.*;

public class BufferedWriterEx {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("f:\\bufferWriter.txt", true);
			bw = new BufferedWriter(fw);
			bw.write("BufferedWriter �׽�Ʈ�Դϴ�.");
			bw.newLine();
			bw.write("�ȳ��ϼ���" + System.getProperty("line.separator"));
			// ������ ���� ��Ÿ��.(������ �������� �̾�� �Ұ���)
			bw.write("asdfasdf");
			bw.flush();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
				if (bw != null)
					bw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}