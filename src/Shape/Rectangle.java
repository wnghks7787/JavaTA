package Shape;

public class Rectangle implements Shape {
    private String name;
    private double area;
    private int perimeter;

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public void printShape() {
        System.out.println("Name: " + name +
                "Area: " + area +
                "Perimeter: " + perimeter);
    }
}
