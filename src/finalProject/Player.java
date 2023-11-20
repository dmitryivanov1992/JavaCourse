package finalProject;

import java.util.Arrays;
import java.util.Scanner;

import static finalProject.Service.returnCoordinateHash;

public class Player {
    private String name;
    private Battlefield field;
    private boolean looser=false;

    public Player(String name) {
        this.name = name;
        this.field = new Battlefield(this);
    }

    public String getName() {
        return name;
    }

    public void printBattlefield() {
        System.out.println("Поле игрока "+ getName());
        Battlefield.print(this.field.getField());
    }

    public void shoot(Player player) {
        if (player.getLooser()) return;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ход игрока  " + getName());
        System.out.println("Введите координаты выстрела в формате: x,y");
        String line = scanner.nextLine();
        if (!line.contains(",")){
            System.out.println("Введите координаты в требуемом формате");
            this.shoot(player);
            return;
        }
        int[] result = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        for (int x : result) {
            if (x < 0 || x > Battlefield.FIELD_SIZE || result.length!=2){
                System.out.println("Введите числа от 0 до 9");
                this.shoot(player);
                return;
            }
        }

        Ship ship = player.field.returnShipByHash(returnCoordinateHash((byte) result[0], (byte) result[1]));
        if (ship == null){
            System.out.println("Промах");
            System.out.println("Поле игрока "+ player.getName());
            player.field.setValueOnField(Battlefield.MISSED_TURN,(byte) result[0], (byte) result[1], player.field.getFieldForOpponent());
            Battlefield.print(player.field.getFieldForOpponent());
            return;
        }
        ship.shipHit((byte) result[0], (byte) result[1],player.field);
        this.shoot(player);
        return;
    }

    public void setLooser(){
        looser=true;
    }

    public boolean getLooser(){
        return looser;
    }
}
