package mathematics.program;

import static java.lang.System.out;
import mathematics.threedshape.Cube;
import mathematics.threedshape.Cylinder;
import mathematics.twodshape.Rectangle;

public class MainProgram2 {
    public static void main(String[] args) {

        var cube = new Cube();
        cube.side = 8;
        String name = cube.shapeName;
        out.println("Shape Name: " + name);
        double cubeVol = cube.calculateVolume();
        out.println("Volume: " + cubeVol);
        double cubeSarea = cube.calculateSurfaceArea();
        out.println("SurfaceArea : " + cubeSarea);
        out.println(" ");

        var cylinder = new Cylinder();
        cylinder.setHeight(6.0);
        cylinder.setRadius(9.0);
        String name1 = cylinder.shapeName;
        out.println("Shape Name: " + name1);
        double cyVol = cylinder.calculateVolume();
        out.println("Volume: " + cyVol);
        double cySarea = cylinder.calculateSurfaceArea();
        out.println("SurfaceArea: " + cySarea);
        out.println(" ");

    }

}
