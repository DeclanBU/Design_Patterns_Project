/**
 * Created by t00189550 on 19/09/2018.
 */
public class DriveSimulator {
    public static void main(String[] args) {

        CarDriver carDriver = new CarDriver();
        System.out.println("Car Driver is " + carDriver.drive() + " a car");

        MotorBikeDriver	motorBikeDriver = new MotorBikeDriver();
        System.out.println("Motorbike Driver is " + motorBikeDriver.drive() + " a motorbike");

        TractorDriver tractorDriver = new TractorDriver();
        System.out.println("Tractor driver is " + tractorDriver.drive() + " a tractor");

        RoadUser newCarDriver = new CarDriver();
        System.out.println("Car Driver is " + newCarDriver.manoveur());
        System.out.println("Motorbike Driver is" + motorBikeDriver.brake());
        System.out.println("Motorbike Driver turns on the " + motorBikeDriver.turnOnHeadLights());


        Walker walker = new Walker();
        System.out.println("Walker " + walker.turnOnheadLights());
        Walker newWalker = new Walker();
        System.out.println("Walker " + newWalker.drive());



    }
}

