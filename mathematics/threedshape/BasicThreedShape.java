package mathematics.threedshape;

import mathematics.shape.BasicShape;

public class BasicThreedShape extends BasicShape {
    public double side;
    public double radius;
    public double height;
    public double pie = 3.141592653589703;

    public double getSide() {
        return side;
    }

    public void setSide(double sLength) {
        side = sLength;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double sRadius) {
        radius = sRadius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double sHeight) {
        height = sHeight;
    }

    public double calculateVolume() {
        return 0.0;
    }

    public double calculateSurfaceArea() {
        return 0.0;
    }

}
