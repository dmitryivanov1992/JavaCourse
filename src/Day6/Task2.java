package Day6;

public class Task2 {
    public static void main(String[] args){
        Airplane boeing777 = new Airplane("Boeing", 2014,59,39000);
        boeing777.setYear(2011);
        boeing777.setLength(64);
        boeing777.fillUp(4800);
        boeing777.fillUp(5200);
        boeing777.info();

    }
}
