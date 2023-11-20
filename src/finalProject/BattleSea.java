package finalProject;

import java.util.Random;

public class BattleSea {
    public static void main(String[] args) {
        Player player1 = new Player("Derek");
        player1.printBattlefield();
        Player player2 = new Player("John");
        player2.printBattlefield();
        startGame(player1, player2);
    }

    public static void startGame(Player player1, Player player2) {
        boolean nextStep; //если false ход игрока 1, если true ход игрока 2
        if (new Random().nextBoolean()) {
            //System.out.println("Ход игрока "+player1.getName());
            player1.shoot(player2);
            nextStep = true;
        } else {
            //System.out.println("Ход игрока "+player2.getName());
            player2.shoot(player1);
            nextStep = false;
        }
        while (player2.getLooser() == player1.getLooser()) {
            if (nextStep) {
                //System.out.println("Ход игрока "+player2.getName());
                player2.shoot(player1);
                nextStep = false;
            } else {
                // System.out.println("Ход игрока "+player1.getName());
                player1.shoot(player2);
                nextStep = true;
            }
        }
        if (player2.getLooser() != player1.getLooser()) {
            if (player1.getLooser()) System.out.println("Победитель " + player2.getName());
            if (player2.getLooser()) System.out.println("Победитель " + player1.getName());
            return;
        }

    }

}

//почему не заканчивается игра? -добавить проверку гетлузера при убийстве корабля или поля шипкиллд




