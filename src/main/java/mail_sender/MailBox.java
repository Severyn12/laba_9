package mail_sender;

import java.util.LinkedList;

public class MailBox {
    MailSender mailSender = new MailSender();
    LinkedList<MailInfo> infos = new LinkedList();

    public void addMailInfo(MailInfo mailInfo){
        infos.add(mailInfo);
    }
    public void sendAll(){
        for (MailInfo mailInfo: infos){
            mailSender.sendMail(mailInfo);
        }
        infos.clear();
    }
}
