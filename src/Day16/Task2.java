package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int numbersAmount = 1000;
        int MAX_NUMBER = 100;
        int groupBy = 20;
        String fileName = "src/file1.txt";
        try {
            PrintWriter pw1 = new PrintWriter(fileName);
            for (int i = 1; i <= numbersAmount; i++) {
                pw1.print((int) (Math.random() * MAX_NUMBER) + " ");
                if (i % groupBy == 0) pw1.println();
            }
            pw1.close();
            PrintWriter pw2 = new PrintWriter("src/file2.txt");
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            double sumFile = 0;
            while (scanner.hasNext()) {
                int sumLine = 0;
                String[] line = scanner.nextLine().split(" ");
                for (String s : line) {
                    sumLine += Integer.parseInt(s);
                }
                double avg = (double) sumLine / line.length;
                pw2.print(avg + " ");
                sumFile += avg;
            }
            pw2.close();
            System.out.println("Ответ: " + (int) sumFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
