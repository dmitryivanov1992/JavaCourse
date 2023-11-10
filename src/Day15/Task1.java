package Day15;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File fileRead = new File("src/main/resources/shoes12.csv");

        try {
            Scanner scanner = new Scanner(fileRead);
            PrintWriter writer = new PrintWriter("src/main/resources/missing_shoes.txt", StandardCharsets.UTF_8);

            while (scanner.hasNext()) {
                String lineString = scanner.nextLine();
                if (!lineString.contains(";")) throw new IOException("Некорректный входной файл");
                String[] line = lineString.split(";");
                if (line.length != 3) throw new IOException("Некорректный входной файл");
                if (Integer.parseInt(line[2]) == 0) {
                    writer.println(line[0] + ", " + line[1] + ", " + line[2]);
                }
            }
            scanner.close();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
