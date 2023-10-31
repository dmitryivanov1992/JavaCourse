package Day6;

public class Task1 {
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.info();
        myCar.setYearProd(2018);
        System.out.println("Разница годов: " + myCar.yearDifference(2021));
        Motorbike myBike = new Motorbike("Yamaha JX1000", "Red", 2006);
        myBike.info();
        System.out.println(myBike.yearDifference(2022));
    }
}
