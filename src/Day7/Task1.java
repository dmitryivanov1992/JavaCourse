package Day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing 787", 2014, 45, 98400);
        Airplane airplane2 = new Airplane("Boeing 747", 2003, 45, 95100);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
