package Day13;

public class Task1 {
    public static void main(String[] args){
        User user1 = new User("Pablo");
        User user2 = new User("Derek");
        User user3 = new User("Liana");

        user1.SendMessage(user2, "Hello, i'm happy to see you!");
        user1.SendMessage(user2, "What kind of plans have you got?");
        user2.SendMessage(user1, "Hello, happy to see you too");
        user2.SendMessage(user1, "I want to go for a walk");
        user2.SendMessage(user1, "Have a Good Day");
        user3.SendMessage(user1, "Hello!");
        user3.SendMessage(user1, "Lets meet today");
        user3.SendMessage(user1, "What do you think about it?");
        user1.SendMessage(user3,"You have beatiful smile");
        user1.SendMessage(user3,"I like your smile");
        user1.SendMessage(user3,"What about to have lunch?");
        user3.SendMessage(user1, "Its a good idea. Lets meet at the center");


        MessageDatabase.showDialog(user1,user3);
    }
}
