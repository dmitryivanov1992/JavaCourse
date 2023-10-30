package Day5;

public class Task1 {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.setColor("Red");
        lada.setModel("Lada Vesta");
        lada.setYearProd(2018);
        System.out.println("Модель автомобиля: " + lada.getModel());
        System.out.println("Цвет автомобиля: " + lada.getColor());
        System.out.println("Год выпуска автомобиля: " + lada.getYearProd());
    }
}