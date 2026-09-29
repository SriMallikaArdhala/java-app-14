package mathematics.threedshape;

import mathematics.threedshape.BasicThreedShape;

public class Cylinder extends BasicThreedShape {
    public Cylinder() {
        shapeName = "Cylinder";
    }

    @Override
    public double calculateVolume() {
        return pie * radius * height;

    }

    @Override
    public double calculateSurfaceArea() {
        return 2.0 * pie * radius * (radius + height);

    }

}
