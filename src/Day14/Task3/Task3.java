package Day14.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> personList = new ArrayList<>();
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String[] personString = scanner.nextLine().split(" ");
                if (personString.length != 2 || Integer.parseInt(personString[personString.length - 1]) < 0) {
                    throw new IOException("Некорректный входной файл");
                }
                Person person = new Person(personString[0], Integer.parseInt(personString[1]));
                personList.add(person);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personList;
    }
}
