package mathematics.twodshape;

import mathematics.shape.BasicShape;

public class BasicTwodShape extends BasicShape {
    public double sideLength;
    public double sideWidth;

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sLength) {
        sideLength = sLength;
    }

    public double getSideWidth() {
        return sideWidth;
    }

    public void setSideWidth(double sWidth) {
        sideWidth = sWidth;
    }

    public double calculateArea() {
        return 0.0;
    }

    public double calculatePerimeter() {
        return 0.0;
    }

}
