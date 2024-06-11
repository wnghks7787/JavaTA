package Shape;

import java.util.Scanner;

public class Circle implements Shape {

    private double radius;
    private final double PI = 3.14;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Circle's radius: ");
        setRadius(scanner.nextDouble());
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
                " Area: " + String.format("%3f", getArea()) +
                " Perimeter: " + getPerimeter());
    }
}
