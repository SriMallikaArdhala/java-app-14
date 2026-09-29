package mathematics.threedshape;

import mathematics.threedshape.BasicThreedShape;

public class Cube extends BasicThreedShape {
    public Cube() {
        shapeName = "CUBE";
    }

    @Override
    public double calculateVolume() {
        return side * side * side;

    }

    @Override
    public double calculateSurfaceArea() {
        return 6.0 * side * side;

    }

}
