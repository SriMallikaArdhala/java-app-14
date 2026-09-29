package mathematics.program;

import static java.lang.System.out;
import mathematics.twodshape.Square;
import mathematics.twodshape.Rectangle;

public class MainProgram1 {
    public static void main(String[] args) {

        var square = new Square();
        square.setSideLength(6.0);
        String name = square.shapeName;
        out.println("Shape Name: " + name);
        double sqArea = square.calculateArea();
        out.println("Area: " + sqArea);
        double sqPerimeter = square.calculatePerimeter();
        out.println("Perimeter: " + sqPerimeter);
        out.println(" ");

        var rectangle = new Rectangle();
        rectangle.setSideLength(6.0);
        // rectangle.setSideWidth(7.0);
        rectangle.sideWidth = 7.0;
        String name1 = rectangle.shapeName;
        out.println("Shape Name: " + name1);
        double recArea = rectangle.calculateArea();
        out.println("Area: " + recArea);
        double recPerimeter = rectangle.calculatePerimeter();
        out.println("Perimeter: " + recPerimeter);
        out.println(" ");

    }

}
