package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("day14_task1.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден!");
        }

        String[] numbers = scanner.nextLine().split(" ");
        if (numbers.length != 10) {
            throw new RuntimeException("Некорректный входной файл");
        }
        int sum = 0;
        for (String s : numbers) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
