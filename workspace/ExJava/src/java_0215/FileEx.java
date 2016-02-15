package java_0215;

import java.io.*;

public class FileEx {
	public static void main(String[] args) throws IOException {
		
		//Ư�� ��ġ ���� ��� ����
		String filePath = "f:\\";
		
		//��� �� ��ġ�� File Ŭ������ ����
		File f1 = new File(filePath);
		
		
		//list() �޼ҵ�� ���� ��� ���� ����(String [])
		String list[] = f1.list();
		for (int i = 0; i < list.length; i++) {
			File f2 = new File(filePath, list[i]);
			
			//isDirectory ���丮(����)�� ���� ������ ���
			if (f2.isDirectory()) {
				System.out.printf("%s : ���丮 %n", list[i]);
			} else {
				//%,dbyte : ,�� �ڸ��� ǥ�� �ڿ� byte ����
				System.out.printf("%s : ����(%,dbyte)%n", list[i], f2.length());
			}
		}
		
		//���� ��� �����Ѵ�.
		File f3 = new File("f:\\test.txt");
		//������ ����
		System.out.println(f3.createNewFile());
		//���� ���
		System.out.println(f3.getAbsolutePath());
		//���� ���
		System.out.println(f3.getCanonicalPath());
		//���
		System.out.println(f3.getPath());
		//���� �̸�
		System.out.println(f3.getName());
		//���� ����
		System.out.println(f3.getParent());
		File f4 = new File("f:\\test.txt");
		File f5 = new File("f:\\tmp\\test1.txt");
		
		//�̸� ����
		System.out.println(f4.renameTo(f5));
		
		
	}
}
