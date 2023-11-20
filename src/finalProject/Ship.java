package finalProject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static finalProject.Service.returnCoordinateHash;

public class Ship {
    private byte size;
    private boolean alive;
    private byte[][] shipCoordinates;
    private Battlefield battlefield;
    private final Map<Integer, Byte> shipHealth = new HashMap<>();


    public Ship(byte size, Battlefield battlefield) {
        this.size = size;
        alive = true;
        this.battlefield = battlefield;
        createTheShip();
    }

    private void createTheShip() {
        switch (size) {
            case 1 -> System.out.println("Введи координаты однопалубного корабля( формат:x,y)");
            case 2 -> System.out.println("Введи координаты двухпалубного корабля( формат:x,y;x,y)");
            case 3 -> System.out.println("Введи координаты треххпалубного корабля( формат:x,y;x,y;x,y)");
            default -> System.out.println("Введи координаты четырехпалубного корабля( формат:x,y;x,y;x,y;x,y)");
        }
        Scanner scanner = new Scanner(System.in);
        String[] coordinatesString = scanner.nextLine().split(";");

        //проверяем, соответствует ли корабль требуемой длине
        if (coordinatesString.length != this.size) {
            System.out.println("Введите " + this.size + "пары координат!");
            createTheShip();
            return;
        }


        //создаем int массив с координатами корабля
        String[][] coordinates = new String[this.size][2];
        for (int i = 0; i < coordinatesString.length; i++) {
            coordinates[i] = coordinatesString[i].split(",");
        }

        //проверяем на правильное указание координат
        byte[][] shipCoordinates = new byte[this.size][2];
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < 2; j++) {
                int point = Integer.parseInt(coordinates[i][j]);
                if (point >= 0 && point < Battlefield.FIELD_SIZE) {
                    shipCoordinates[i][j] = Byte.parseByte(coordinates[i][j]);
                } else {
                    System.out.println("Введите координаты больше либо равные нулю, но меньше " + Battlefield.FIELD_SIZE);
                    createTheShip();
                    return;
                }
            }
        }


        //проверяем, что корабли стоят на одной линии
        for (int i = 0; i < shipCoordinates.length - 1; i++) {
            if (shipCoordinates[i][0] != shipCoordinates[i + 1][0] &&
                    shipCoordinates[i][1] != shipCoordinates[i + 1][1]) {
                System.out.println("Корабль должен стоять на одной линии!");
                createTheShip();
                return;
            }
        }

        //проверяем, что корабль не разрывен

        for (int i = 0; i < shipCoordinates.length - 1; i++) {
            if (i + 1 <= shipCoordinates.length - 1) {
                if ((shipCoordinates[i + 1][0] - shipCoordinates[i][0] > 1) ||
                        (shipCoordinates[i + 1][1] - shipCoordinates[i][1] > 1)) {
                    System.out.println("Корабль не может быть с разрывами");
                    createTheShip();
                    return;
                }
            }
        }

        //проверяем, свободно ли место для корабля
        for (byte[] coordinate : shipCoordinates) {
            int value = battlefield.getValueOnField(coordinate[0], coordinate[1]);
            if (value != Battlefield.EMPTY) {
                if (value == Battlefield.SHIP_HALO) {
                    System.out.println("Вокруг корабля должна быть область шириной в одну клетку, в которой не может быть других кораблей (ореол корабля)");
                } else System.out.println("Поле" + Arrays.toString(coordinate) + "занято!");
                createTheShip();
                return;
            }
        }
        this.shipCoordinates = shipCoordinates;
        //добавляем координаты корабля в HashMap для проверки уникальности каждой координаты и состояния корабля
        putShipInHash();
        //обозначаем ореол вокург корабля
        makeOriol(battlefield.getField());


        putTheShip();
    }

    private void makeOriol(int[][] field) {
        for (int i = shipCoordinates[0][0] - 1; i < shipCoordinates[this.size - 1][0] + 2; i++) {
            for (int j = shipCoordinates[0][1] - 1; j < shipCoordinates[this.size - 1][1] + 2; j++) {
                if (i < Battlefield.FIELD_SIZE && j < Battlefield.FIELD_SIZE && i >= 0 && j >= 0)
                    if (battlefield.getFieldForOpponent()[i][j] != Battlefield.SHIP_DAMAGED) {
                        battlefield.setValueOnField(Battlefield.SHIP_HALO, (byte) i, (byte) j, field);
                    }
            }
        }
    }

    private void putTheShip() {
        for (byte[] coordinate : this.getShipCoordinates()) {
            battlefield.registerShipInHash(coordinate[0], coordinate[1], this);
            battlefield.setValueOnField(Battlefield.SHIP_NORMAL, coordinate[0], coordinate[1], battlefield.getField());
        }
        battlefield.setShipsLeft();
    }

    private void putShipInHash() {
        for (byte[] coordinate : shipCoordinates) {
            shipHealth.put(returnCoordinateHash(coordinate[0], coordinate[1]), Battlefield.SHIP_NORMAL);
        }
        if (shipHealth.size() != size) {
            System.out.println("Координаты корабля введены неверно ");
            createTheShip();
            return;
        }
    }

    public byte[][] getShipCoordinates() {
        return shipCoordinates;
    }



    public void shipHit(byte x, byte y, Battlefield battlefield) {
        shipHealth.put(returnCoordinateHash(x, y), Battlefield.SHIP_DAMAGED);
        System.out.println("Попал");
        battlefield.setValueOnField(Battlefield.SHIP_DAMAGED, x, y, battlefield.getFieldForOpponent());
        if (checkShipDamage()) {
            makeOriol(battlefield.getFieldForOpponent());
            System.out.println("Корабль размером " + this.size + "подбит!");
            battlefield.shipKilled();
        }
        System.out.println("Поле игрока " + battlefield.getPlayer().getName());
        Battlefield.print(battlefield.getFieldForOpponent());
    }

    private boolean checkShipDamage() {
        //проверить подбит ли весь корабль
        byte result = 0;
        for (Map.Entry<Integer, Byte> entry : shipHealth.entrySet()) {
            result += entry.getValue();
        }
        return result == this.size * Battlefield.SHIP_DAMAGED;
    }

}
