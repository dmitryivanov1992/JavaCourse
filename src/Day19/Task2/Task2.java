package Day19.Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/taxi_cars.txt");
        Map<Integer, Point> taxiHash = new HashMap<>();
        try {
            Scanner scanner = new Scanner(file);

            String[] line;
            while (scanner.hasNext()) {
                line = scanner.nextLine().split(" ");
                taxiHash.put(Integer.parseInt(line[0]), new Point(Integer.parseInt(line[1]), Integer.parseInt(line[2])));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x1: ");
        int x1 = scanner.nextInt();
        System.out.println("Введите y1: ");
        int y1 = scanner.nextInt();
        System.out.println("Введите x2: ");
        int x2 = scanner.nextInt();
        System.out.println("Введите y2: ");
        int y2 = scanner.nextInt();
        try {
            if (x1>=x2 || y1 >= y2) {
                throw new IndexOutOfBoundsException("x2 должна быть больше x1, а y2 больше y1");
            } else if (x1 < 0  || x1 > 99 || x2 > 99 || y1 < 0 || y1 > 99 || y2 > 99) {
                throw new IndexOutOfBoundsException("Координаты не могут быть отрицательными");
            } else if (x2 - x1 != y2 - y1) {
                throw new IndexOutOfBoundsException("Координаты должны образовывать квадрат");
            }
            int taxiSquareCounter = 0;
            for (Map.Entry<Integer, Point> entry : taxiHash.entrySet()) {
                int x = entry.getValue().getX();
                int y = entry.getValue().getY();
                if ((x > x1 && x < x2) && (y > y1 && y < y2)) {
                    taxiSquareCounter++;
                    System.out.println("Машина " + entry.getKey() + " в квадрате");
                }
            }
            System.out.println("Всего машин в квадрате: " + taxiSquareCounter);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
