public class TestCube {
    public static void main (String[]args){
        Cube cube = new Cube(3.0);

        double volume = cube.volume();
        double surfaceArea = cube.surfaceArea();

        System.out.println("The surface area is " + surfaceArea + " sq. units\nThe volume is " + volume + " cu. units");
        cube.setSideForVolume(125);
        
        double newSide = cube.getSide();
        double newArea = cube.surfaceArea();

        System.out.println("The side is now " + newSide + " units\nThe surface area is " + newArea + " sq. units");

    }
    
}
