package Day5;

public class Motorbike {
    private final String model;
    private final String color;
    private final int yearProd;

    public Motorbike(String name, String color, int year){
        this.model = name;
        this.color = color;
        this.yearProd = year;
    }

    public String getModel(){
        return this.model;
    }
    public String getColor(){
        return this.color;
    }
    public int getYearProd(){
        return this.yearProd;
    }
}
