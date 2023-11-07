package Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = fillEvenNumbers(0,30, new ArrayList<Integer>());
        fillEvenNumbers(300, 350, numbers);
        System.out.println(numbers.toString());
    }
    public static ArrayList<Integer> fillEvenNumbers(int from, int to, ArrayList<Integer> numbers){
        for (int i = from;i<=to;i++){
            if (i%2 == 0) numbers.add(i);
        }
        return numbers;
    }
}
