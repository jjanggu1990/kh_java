package java_0215;

import java.util.Scanner;

class ScannerConsoleEx {

	public static void main(String[] args) {
		System.out.println("�Է� : ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.printf("��ĵ : %d", number);
		scan.close();
	}

}
