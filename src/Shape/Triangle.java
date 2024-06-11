package Shape;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Triangle implements Shape {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Triangle's side: ");
        setSide(scanner.nextDouble());
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getArea() {
        return 0.25 * sqrt(3) * Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return 3 * side;
    }

    @Override
    public void printShape() {
        System.out.println("Name: " + getName() +
                "Area: " + getArea() +
                "Perimeter: " + getPerimeter());
    }
}
