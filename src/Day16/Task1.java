package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("day14_task1.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String lineString = scanner.nextLine();
            String[] line = lineString.split(" ");
            if (line.length == 0) throw new IOException("Неверный формат данных");
            int sum = 0;
            for (String s : line) {
                sum += Integer.parseInt(s);
            }
            double avg = (double) sum / line.length;
            System.out.println("Числа в txt файле: " + lineString);
            System.out.print("Ответ: " + avg + " --> ");
            System.out.format("%.3f", avg);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
