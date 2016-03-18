package java_0216;

import java.net.*;
import java.io.*;

public class TcpIpClient {
	public static void  conn() throws Exception{
		String serverIp = "192.168.50.49";

		System.out.println("������ �������Դϴ�. ����IP :" + serverIp);
		// ������ �����Ͽ� ������ ��û�Ѵ�.
		Socket socket = new Socket(serverIp, 7777); 

		// ������ �Է½�Ʈ���� ��´�.
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		// �������� ���� ���� �����͸� ����Ѵ�.
		System.out.println("�����κ��� ���� �޼��� :"+dis.readUTF());      
		System.out.println("������ �����մϴ�.");

		// ��Ʈ���� ������ �ݴ´�.
		dis.close();
		socket.close();
		System.out.println("������ ����Ǿ����ϴ�.");
	}
	public static void main(String args[]) {
		try {
			for(int i = 0; i<5; i++){
				conn();
			}
		} catch(ConnectException ce) {
			ce.printStackTrace();
		} catch(IOException ie) {
			ie.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();  
		}  
	} // main
} // class