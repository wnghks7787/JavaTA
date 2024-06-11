package Shape;

public class Circle implements Shape {

    private int radius;
    private final double PI = 3.14;

    @Override
    public String getName() {
        return "Cycle";
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public void printShape() {
        System.out.println("Name: " + getName() +
                "Area: " + getArea() +
                "Perimeter: " + getPerimeter());
    }
}
