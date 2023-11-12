package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.prefs.InvalidPreferencesFormatException;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("day14_task1.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String[] numbers = scanner.nextLine().split(" ");
            if (numbers.length != 10) {
                throw new InvalidPreferencesFormatException("Некорректный входной файл");
            }
            int sum = 0;
            for (String s : numbers) {
                sum += Integer.parseInt(s);
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден!");
        } catch (InvalidPreferencesFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
