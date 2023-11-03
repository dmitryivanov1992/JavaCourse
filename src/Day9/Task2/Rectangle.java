package Day9.Task2;

public class Rectangle extends Figure {
    private final int width;
    private final int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return width * 2 + height * 2;
    }

    @Override
    public double area() {
        return width*height;
    }
}
