package mail_sender;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    int id;
    String name;
    int age;
    Gender sex;

    public Client(){
        this.id = ClientGenerator.generateId();
    }

    public static class ClientGenerator {
        private static  int counter = 0;

        public static int generateId(){
            counter++;
            return counter;
        }
    }
}
