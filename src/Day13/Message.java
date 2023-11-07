package Day13;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;
    Calendar calendar = new GregorianCalendar();

    public Message(User sender, User receiver, String text){
        this.sender=sender;
        this.receiver = receiver;
        this.text = text;
        date = calendar.getTime();
    }

    public String getText() {
        return text;
    }

    public User getReceiver() {
        return receiver;
    }

    public User getSender() {
        return sender;
    }

    public Date getDate() {
        return date;
    }
    public String toString(){
        return "FROM: "+this.sender.toString()+"\nTO: "+this.receiver.toString()+"\nON: "+date+"\n"+this.text;
    }
}
