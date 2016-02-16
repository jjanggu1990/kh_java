package java_0216;

import java.net.*;
import java.io.*;

public class NetworkEx4 {
	public static void main(String args[]) {
		URL url = null;
		BufferedReader input = null;
		// String address = "http://docs.oracle.com/javase/8/docs/api/index.html";
		String address = "https://www.google.co.kr/?gfe_rd=cr&ei=VfrCVuKkJ8TC8gfOtIyoDg&gws_rd=ssl#q=diablo3";
//		String address = "http://www.google.com";
		String line = "";

		try {
			url = new URL(address);

			/*
			 *  �߿�
			 */
			input = new BufferedReader(new InputStreamReader(url.openStream()));

			/*
			 * �߿�
			 */
			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
} 