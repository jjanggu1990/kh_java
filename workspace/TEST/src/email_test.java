import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class email_test {
	public static void main(String[]args){
		for(int i =0;i<5;i++){
			sendmail("jjanggu1990@naver.com", randomPassword());
		}
	}
	
	
	static String result="";
	private static String randomPassword(){
		//33���� ! �̰�, 122 �� z �Դϴ�.
		//�׷��Ƿ� �� ���ڴ� 90���Դϴ�.
		Random ran = new Random();
		char [] letter_arr = new char[90];
		char letter = '!';
		for(int i=0;i<90;i++){
			/*if(letter=='!'){
				System.out.println("! ��ȣ : "+(int)letter);
			}
			if(letter=='z'){
				System.out.println("z ��ȣ : "+(int)letter);
			}*/
			//System.out.println(letter);
			letter_arr[i]=letter;
			letter = (char)(++letter);
		}
		
		for(int i=0;i<8;i++){
			int a =ran.nextInt(90);
			result = result+letter_arr[a];
		}
		System.out.println("�ӽú�й�ȣ : "+result);
		return result;
	}
	
	private static final String username = "fksh90@gmail.com";
	private static final String password = "q131313!#";

	private static void sendmail(String email, String key) {
		
		//�ӽ÷� ������ ���ڿ��� �����ͺ��̽��� ����
	
		
		
		Properties props = new Properties();
		/*
		 * props.put("mail.smtp.user",username); props.put("mail.smtp.password",
		 * password);
		 */
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "25");
		props.put("mail.debug", "false");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.EnableSSL.enable", "true");
		props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.setProperty("mail.smtp.socketFactory.fallback", "false");
		props.setProperty("mail.smtp.port", "465");
		props.setProperty("mail.smtp.socketFactory.port", "465");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		System.out.println("??");
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("fksh90@gmail.com"));//
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
			message.setContent("<h1>�ӽ� ��й�ȣ�� "+result+" �Դϴ�.</h1><br>","text/html; charset=UTF-8;");//�۳����� htmlŸ��
			message.setSubject("Testing Subject");
			//message.setText("<html><body><a href='http://www.naver.com'>naver</a> Dear Mail Crawler," + "\n\n No spam to my email, please!</body></html>");// ����
			System.out.println("send!!!");
			Transport.send(message);
			System.out.println("SEND");
			result="";
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
