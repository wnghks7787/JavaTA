package Shape;

import java.util.Scanner;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Rectangle's width: ");
        setWidth(scanner.nextDouble());

        System.out.print("Input Rectangle's height: ");
        setHeight(scanner.nextDouble());
    }

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
                " Area: " + getArea() +
                " Perimeter: " + getPerimeter());
    }
}
