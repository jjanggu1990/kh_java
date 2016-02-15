package java_0215;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class ScannerReadableEx {

	public static void main(String[] args) {
		Scanner scan = null;
		FileReader fr = null;
		try{
			fr = new FileReader("f://scan.txt");
			scan = new Scanner(fr);
			while(scan.hasNextDouble()){
				System.out.printf("��ĵ  double : %,.2f %n",scan.nextDouble());
			}
		}catch (IOException ioe){
			ioe.printStackTrace();
		}finally{
			try{
				if(fr != null) fr.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
			if(scan != null) scan.close();
		}

	}

}