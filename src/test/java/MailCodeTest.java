import mail_sender.MailCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MailCodeTest {
    MailCode mailCode = MailCode.HAPPY_BIRTHDAY;

    @org.junit.jupiter.api.Test
    void mailCode_test(){
        assertEquals("Hi %NAME%!\n" +
                "Happy Birthday! Now you are %AGE% years old.", mailCode.generateText());
        assertEquals("happy_birthday.txt", mailCode.getFilename());
    }
}
