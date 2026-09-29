package mathematics.twodshape;

import mathematics.twodshape.BasicTwodShape;

public class Square extends BasicTwodShape {

    public Square() {
        shapeName = "SQUARE";
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;

    }

    @Override
    public double calculatePerimeter() {
        return 4 * sideLength;

    }

}
