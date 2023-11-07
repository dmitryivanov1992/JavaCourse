package Day9.Task2;

public class Task2 {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
        System.out.println(figures[7].perimeter());
        System.out.println(figures[7].area());
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            if ("Red".equals(figure.color)) {
                sum += figure.perimeter();
            }
        }
        return sum;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            if ("Red".equals(figure.color)) {
                sum += figure.area();
            }
        }
        return sum;
    }
}
