package Day8;

public class Task1_StringBuilder {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            numbers.append(i).append(" ");
        }
        System.out.println(numbers);
        System.out.println("Длительность работы, в мс. :" + String.valueOf(System.currentTimeMillis()-startTime)); //31ms
    }
}
