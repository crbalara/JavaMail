import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class JavaMail {
static String reciever = "chenarambalara97@gmail.com", sender ="chenarambalara97@gmail.com",
    subject ="How to send mail by Java", body ="We send Mail from java";

   static boolean send(String to,String from,String sub,String text)
   {
      boolean flag = false;
      Properties prop = new Properties();
      prop.put("mail.smtp.port","587");
      prop.put("mail.smtp.host","smtp.gmail.com");
      prop.put("mail.smtp.auth","true");
      prop.put("mail.smtp.starttls.enable","true");

      String uname = "chenarambalara97";
      String pass= "ikjzipwluvmwxjfq";

      Session session = Session.getInstance(prop, new Authenticator() {
         @Override
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(uname,pass);
         }
      });

      try
      {
         Message msg = new MimeMessage(session);
         msg.setFrom(new InternetAddress(from));
         msg.setSubject(sub);
         msg.setRecipient(Message.RecipientType.TO,new InternetAddress(to));
         msg.setText(text);

         Transport.send(msg);
         flag=true;
      }
      catch (Exception e)
      {
         System.out.println(e);
      }

      return flag;
   }

   public static void main(String[] args) {
      boolean status = send(reciever,sender,subject,body);

      if(status)
      {
         System.out.println("Email sent successfully");
      }
      else {
         System.out.println("there is some issue");
      }
   }
}
