package mail_sender;

import lombok.Getter;
import lombok.Setter;
import java.util.HashMap;

@Getter
@Setter
public class MailInfo {
    private MailCode mailCode;
    private Client client;
    private boolean SendStatus = false;

    public String getMailText(){
        String text = mailCode.generateText();
        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME%", client.getName());
        templates.put("%AGE%", Integer.toString(client.getAge()));

        for (String key: templates.keySet()){
            text = text.replace(key, templates.get(key));
        }
        return text;
    }


}
