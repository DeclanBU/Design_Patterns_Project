package Strategy;

import Strategy.CarDriver;
import Strategy.MotorBikeDriver;
import Strategy.RoadUser;
import Strategy.TractorDriver;

/**
 * Created by t00189550 on 19/09/2018.
 */
public class DriveSimulator {
    public static void main(String[] args) {

        CarDriver carDriver = new CarDriver();
        System.out.println("Car Driver can " + carDriver.getDrivingBehaviour());

        RoadUser motorBikeDriver = new MotorBikeDriver();
        System.out.println("Motorbike Driver is " + motorBikeDriver.getDrivingBehaviour() + " a motorbike");

        TractorDriver tractorDriver = new TractorDriver();
        System.out.println("Tractor driver is " + tractorDriver.getDrivingBehaviour() + " a tractor");

        RoadUser newCarDriver = new CarDriver();
        System.out.println("Car Driver is " + newCarDriver.manoveur());
        System.out.println("Motorbike Driver is" + motorBikeDriver.brake());

        RoadUser walker = new Walker();
        System.out.println("Walker " + walker.getLightingBehaviour());
        RoadUser newWalker = new Walker();
        System.out.println("Walker " + newWalker.getDrivingBehaviour());



    }
}

