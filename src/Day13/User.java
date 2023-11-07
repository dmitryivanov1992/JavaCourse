package Day13;

import java.util.ArrayList;

public class User {
    private String username;
    private ArrayList<User> subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public ArrayList<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return this.subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return this.subscriptions.contains(user) && user.subscriptions.contains(this);
    }
    public void SendMessage(User user, String text){
        MessageDatabase.addNewMessage(this,user, text);
    }

    public String toString(){
        return username;
    }
}
