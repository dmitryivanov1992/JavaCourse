package finalProject;

public abstract class Service {
    public static int returnCoordinateHash(byte x, byte y){
        return (String.valueOf(x)+y).hashCode();
    }
}
