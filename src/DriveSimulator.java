/**
 * Created by t00189550 on 19/09/2018.
 */
public class DriveSimulator {
    public static void main(String[] args) {

        CarDriver carDriver = new CarDriver();
        System.out.println("Car Driver is " + carDriver.drive() + " a car");

        MotorBikeDriver	motorBikeDriver = new MotorBikeDriver();
        System.out.println("Motorbike Driver is " + carDriver.drive() + " a motorbike");

        TractorDriver tractorDriver = new TractorDriver();
        System.out.println("Tractor driver is " + carDriver.drive() + " a tractor");

        RoadUser newCarDriver = new CarDriver();
        System.out.println("New Car Driver is " + newCarDriver.manoveur());
        System.out.println("New Tractor Driver is" + motorBikeDriver.brake());



    }
}

