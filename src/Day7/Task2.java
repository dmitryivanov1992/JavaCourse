package Day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player p1 = new Player(random.nextInt(11) + 90);
        Player p2 = new Player(random.nextInt(11) + 90);
        Player p3 = new Player(random.nextInt(11) + 90);
        Player p4 = new Player(random.nextInt(11) + 90);
        Player p5 = new Player(random.nextInt(11) + 90);
        Player p6 = new Player(random.nextInt(11) + 90);
        Player.info();
        Player p7 = new Player(random.nextInt(11) + 90);
        Player p8 = new Player(random.nextInt(11) + 90);
        Player.info();
        while (p1.getStamina() > 0) {
            p1.run();
        }
        Player.info();
    }
}
