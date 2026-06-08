package utilities;

import java.io.File;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailUtil {
	public static void sendReport() throws Exception {

		String To = "gangadhariramcharan41@gmail.com";
		String From = "moinuddinshaik7089@gmail.com";
		// mpavank70131@gmail.com
		// kindrasena579@gmail.com
		// pathanmohinkhan754@gmail.com
		// gangadhariramcharan41@gmail.com
		Properties props = new Properties();

		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.ssl.protocols", "TLSv1.2");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("moinuddinshaik7089@gmail.com", "uolp uoac wasn tnbt");
			}
		});
		session.getDebug();
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(From));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(To));
			message.setSubject("Automation Execution Report");

			MimeBodyPart bodyPart = new MimeBodyPart();

			bodyPart.setText("Please find attached Allure Report.");

			MimeBodyPart attachmentPart = new MimeBodyPart();

			attachmentPart.attachFile(new File("C:\\Users\\moinu\\eclipse-workspace\\Zproject_Real_time\\allure-results.zip"));

			Multipart multipart = new MimeMultipart();

			multipart.addBodyPart(bodyPart);

			multipart.addBodyPart(attachmentPart);

			message.setContent(multipart);

			Transport.send(message);

			System.out.println("Report Email Sent Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
