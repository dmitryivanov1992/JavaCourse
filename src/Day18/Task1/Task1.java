package Day18.Task1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers));
    }

    public static int recursionSum(int[] numbers) {
        int len = numbers.length;
        if (len > 1) {
            numbers[0] += numbers[len - 1];
            return recursionSum(Arrays.copyOf(numbers, len - 1));
        } else {
            return numbers[0];
        }
    }
}
