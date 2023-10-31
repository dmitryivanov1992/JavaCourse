package Day6;

public class Car {
    private String model;
    private String color;
    private int yearProd;

    public void setModel(String name) {
        this.model = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearProd(int year) {
        this.yearProd = year;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getYearProd() {
        return this.yearProd;
    }
    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int inputYear) {
        return Math.abs(this.yearProd - inputYear);
    }

}
