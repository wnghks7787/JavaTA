package Shape;

public class Triangle implements Shape {
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
    public int getPerimeter() {
        return 0;
    }

    @Override
    public void printShape() {

    }
}
