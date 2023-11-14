package Day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        File myFile = new File("src/main/resources/dushi.txt");
        Map<String, Integer> countWordsHash = new HashMap<>();
        try {
            Scanner scanner = new Scanner(myFile);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            String word;
            while (scanner.hasNext()) {
                word = scanner.next();
                if (countWordsHash.containsKey(word)) countWordsHash.put(word, countWordsHash.get(word) + 1);
                else countWordsHash.put(word, 1);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

       Stream<Map.Entry<String, Integer>> stream =  countWordsHash.entrySet().
               stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed());
        Object[] array = stream.toArray();
        for (int i = 0; i < 100; i++) {
            System.out.println(array[i]);
        }
        //Чичиков - 601

    }
}
