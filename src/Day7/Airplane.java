package Day7;

public class Airplane {

    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int yearProd, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = yearProd;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int yearProd) {
        this.year = yearProd;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return this.fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + this.manufacturer + ", год выпуска: " + this.year + ", длина: " + this.length +
                ", вес: " + this.weight + ", количество топлива в баке: " + this.fuel);
    }
    public void fillUp(int n){
        this.fuel+=n;
    }

    static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if (airplane1.length> airplane2.length) System.out.println("Самолет "+airplane1.manufacturer+" длинее, чем "+airplane2.manufacturer);
        else System.out.println("Самолет "+airplane2.manufacturer+" длинее, чем "+airplane1.manufacturer);
    }

}
