package Shape;

public class Rectangle implements Shape {
    private double width;
    private double height;

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void printShape() {
        System.out.println("Name: " + getName() +
                "Area: " + getArea() +
                "Perimeter: " + getPerimeter());
    }
}
