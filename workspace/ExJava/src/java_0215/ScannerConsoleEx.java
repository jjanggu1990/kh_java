package java_0215;

import java.util.Scanner;

class ScannerConsoleEx {

	public static void main(String[] args) {
		System.out.println("ÀÔ·Â : ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.printf("½ºÄµ : %d", number);
		scan.close();
	}

}
