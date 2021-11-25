import static org.junit.jupiter.api.Assertions.assertEquals;

import mail_sender.Client;
import mail_sender.MailInfo;
import mail_sender.MailSender;



public class MailSenderTest {

    private MailSender mailSender = new MailSender();

    @org.junit.jupiter.api.Test
    void send_test() {
        MailInfo mailInfo = new MailInfo();
        Client nw_client = new Client();
        mailInfo.setClient(nw_client);
        assertEquals("Mail was sent successfully", mailSender.sendMail(mailInfo));
        assertEquals(true, mailInfo.isSendStatus());


    }
}
