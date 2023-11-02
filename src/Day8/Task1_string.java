package Day8;

public class Task1_string {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String numbers = "";
        for (int i = 0; i <= 20000; i++) {
            numbers += (String.valueOf(i) + " ");
        }
        System.out.println(numbers);
        System.out.println("Длительность работы, в мс. :" + String.valueOf(System.currentTimeMillis() - startTime)); //453ms
    }
}
