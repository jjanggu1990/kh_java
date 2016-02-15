package java_0215;

import java.io.*;

public class FileEx {
	public static void main(String[] args) throws IOException {
		
		//특정 위치 파일 목록 보기
		String filePath = "f:\\";
		
		//목록 볼 위치를 File 클래스로 생성
		File f1 = new File(filePath);
		
		
		//list() 메소드로 파일 목록 저장 받음(String [])
		String list[] = f1.list();
		for (int i = 0; i < list.length; i++) {
			File f2 = new File(filePath, list[i]);
			
			//isDirectory 디렉토리(폴더)인 경우랑 파일인 경우
			if (f2.isDirectory()) {
				System.out.printf("%s : 디렉토리 %n", list[i]);
			} else {
				//%,dbyte : ,로 자릿수 표시 뒤에 byte 붙임
				System.out.printf("%s : 파일(%,dbyte)%n", list[i], f2.length());
			}
		}
		
		//파일 경로 지정한다.
		File f3 = new File("f:\\test.txt");
		//새파일 생성
		System.out.println(f3.createNewFile());
		//절대 경로
		System.out.println(f3.getAbsolutePath());
		//정규 경로
		System.out.println(f3.getCanonicalPath());
		//경로
		System.out.println(f3.getPath());
		//파일 이름
		System.out.println(f3.getName());
		//상위 폴더
		System.out.println(f3.getParent());
		File f4 = new File("f:\\test.txt");
		File f5 = new File("f:\\tmp\\test1.txt");
		
		//이름 변경
		System.out.println(f4.renameTo(f5));
		
		
	}
}
