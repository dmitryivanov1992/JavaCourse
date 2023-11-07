package Day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static final ArrayList<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }
    public static List<Message> getMessages(){
        return messages;
    }

    public static void showDialog(User u1, User u2){
        for (Message message: messages) {
            if (message.getSender().equals(u1) && message.getReceiver().equals(u2)) {
                System.out.println(u1.getUsername()+": "+message.getText());
            } else if (message.getSender().equals(u2) && message.getReceiver().equals(u1)) {
                System.out.println(u2.getUsername()+": "+message.getText());
            }
        }
    }
}
