package finalProject;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static finalProject.Service.returnCoordinateHash;

public class Battlefield {
    public static int FIELD_SIZE = 10;
    private final int[][] field = new int[FIELD_SIZE][FIELD_SIZE];
    private final int[][] fieldForOpponent = new int[FIELD_SIZE][FIELD_SIZE];
    private final Player player;
    static Byte SHIP_NORMAL = 1;
    static Byte SHIP_DAMAGED = 2;
    static Byte EMPTY = 3;
    static Byte SHIP_HALO = 4;
    static Byte MISSED_TURN = 5;
    private final Map<Integer, Ship> shipsAttach;
    private int shipsLeft;


    public Battlefield(Player player) {
        this.player = player;
        shipsAttach = new HashMap<>();
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                field[i][j] = 3;
                fieldForOpponent[i][j] = 3;
            }
        }
        this.fillTheField();
    }

    private void fillTheField() {
        System.out.println("Начнем расставлять корабли на поле " + this.player.getName() + " Другой игрок, не смотри!");
        new Ship((byte) 4, this);
        for (int i = 0; i < 2; i++) {
            System.out.println("Осталось расставить " + (2 - i) + " корабля размером 3!");
            new Ship((byte) 3, this);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Осталось расставить " + (3 - i) + " корабля размером 2!");
            new Ship((byte) 2, this);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Осталось расставить " + (4 - i) + " корабля размером 1!");
            new Ship((byte) 1, this);
        }
    }


    public static void print(int[][] field) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (field[i][j] == SHIP_NORMAL) System.out.print("\uD83D\uDEA2");
                else if (field[i][j] == SHIP_DAMAGED) System.out.print("\uD83D\uDFE5");
                else if (field[i][j] == EMPTY) System.out.print("⬜");
                else if (field[i][j] == SHIP_HALO) System.out.print("\uD83D\uDFE6");
                else if (field[i][j] == MISSED_TURN) System.out.print("❌");
            }
            System.out.println();
        }
    }


    public int[][] getField() {
        return field;
    }

    public void setValueOnField(byte value, byte x, byte y, int[][] field) {
        field[x][y] = value;
    }

    public int getValueOnField(int x, int y) {
        return field[x][y];
    }

    public void registerShipInHash(byte x, byte y, Ship ship) {
        shipsAttach.put(returnCoordinateHash(x, y), ship);
    }

    public Ship returnShipByHash(int hash) {
        return shipsAttach.get(hash);
    }

    public int[][] getFieldForOpponent() {
        return fieldForOpponent;
    }

    public Player getPlayer() {
        return player;
    }

    public void shipKilled() {
        shipsLeft--;
        if (shipsLeft == 0) {
            player.setLooser();
        }
    }

    public void setShipsLeft() {
        this.shipsLeft++;
    }
}

