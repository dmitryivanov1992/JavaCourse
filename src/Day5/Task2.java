package Day5;

public class Task2 {
    public static void main(String[] args){
        Motorbike moto = new Motorbike("Honda ZRX1000", "White", 2017);
        System.out.println("Модель мотоцикла: " + moto.getModel());
        System.out.println("Цвет мотоцикла: " + moto.getColor());
        System.out.println("Год выпуска мотоцикла: " + moto.getYearProd());
    }
}
