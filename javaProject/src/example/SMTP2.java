package example;

import java.util.Date;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;

public class SMTP2 {
	public static void main(String[] args) {
		Properties p = System.getProperties();
		p.put("mail.smtp.starttls.enable", "true");
		p.put("mail.smtp.host", "smtp.naver.com");
		p.put("mail.smtp.auth", "true");
		p.put("mail.smtp.port", "587");

		Authenticator auth = new MyAuthentication();
		Session session = Session.getDefaultInstance(p, auth);
		MimeMessage msg = new MimeMessage(session);
		try {
			msg.setSentDate(new Date());
			InternetAddress from = new InternetAddress();

			from = new InternetAddress("841450<841450@naver.com>");
			msg.setFrom(from);
			InternetAddress to = new InternetAddress("841450@naver.com");
			msg.setRecipient(Message.RecipientType.TO, to);

			msg.setSubject("title", "UTF-8");
			msg.setText("content", "UTF-8");
			msg.setHeader("content-Type", "text/html");

			javax.mail.Transport.send(msg);
		} catch (AddressException addr_e) {
			addr_e.printStackTrace();
		} catch (MessagingException msg_e) {
			msg_e.printStackTrace();
		}
	}
}

class MyAuthentications extends Authenticator {
	
	PasswordAuthentication account;

	public MyAuthentications() {
		String id = "841450@naver.com";
		String pw = "marryyou0123";
		account = new PasswordAuthentication(id, pw);
	}

	public PasswordAuthentication getPasswordAuthentication() {
		return account;
	}

}