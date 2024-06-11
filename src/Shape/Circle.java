package Shape;

public class Circle implements Shape {

    private double radius;
    private final double PI = 3.14;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
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
