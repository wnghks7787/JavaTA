import Shape.Shape;
import Shape.Circle;
import Shape.Triangle;
import Shape.Rectangle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>(5);

        Shape c1 = new Circle();
        Shape t1 = new Triangle();
        Shape r1 = new Rectangle();
        Shape r2 = new Rectangle();
        Shape c2 = new Circle();

        shapes.add(c1);
        shapes.add(t1);
        shapes.add(r1);
        shapes.add(r2);
        shapes.add(c2);

        for(int i = 0 ; i < 5 ; i++) {

        }

    }
}