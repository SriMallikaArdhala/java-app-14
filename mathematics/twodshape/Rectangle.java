package mathematics.twodshape;

import mathematics.shape.BasicTwodShape;

public class Rectangle extends BasicTwodShape {
    public Rectangle() {
        shapeName = "RECTANGLE";
    }

    @Override
    public double calculateArea() {
        return sideLength * sideWidth;

    }

    @Override
    public double calculatePerimeter() {
        return 2 * (sideLength + sideWidth);

    }

}
