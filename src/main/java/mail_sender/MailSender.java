package mail_sender;

public class MailSender {
    public String sendMail(MailInfo mailInfo){
        mailInfo.setSendStatus(true);
        return "Mail was sent successfully";
    }
}
