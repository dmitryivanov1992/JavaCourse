package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> result = new ArrayList<>();
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                if (Integer.parseInt(s.split(" ")[1]) < 0) throw new IOException("Некорректный входной файл");
                result.add(s);
            }
            return result;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
