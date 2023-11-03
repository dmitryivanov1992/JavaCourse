package Day9.Task2;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2.0);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }
}
