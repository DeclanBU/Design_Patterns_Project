import Factory.Ambulance;
import Factory.FireBrigade;
import Factory.RescueVehicle;
import Strategy.*;

/**
 * Created by t00189550 on 19/09/2018.
 */
public class DriveSimulator {
    public static void main(String[] args) {

        CarDriver carDriver = new CarDriver();
        System.out.println("Car Driver can " + carDriver.getDrivingBehaviour());

        RoadUser motorBikeDriver = new MotorBikeDriver();
        System.out.println("Motorbike Driver is " + motorBikeDriver.getDrivingBehaviour() + "on a motorbike");

        TractorDriver tractorDriver = new TractorDriver();
        System.out.println("Tractor driver is " + tractorDriver.getDrivingBehaviour() + " a tractor");

        RoadUser newCarDriver = new CarDriver();
        System.out.println("Car Driver is " + newCarDriver.manoveur());
        System.out.println("Motorbike Driver is" + motorBikeDriver.brake());

        RoadUser walker = new Walker();
        System.out.println("Walker " + walker.getLightingBehaviour());
        RoadUser newWalker = new Walker();
        System.out.println("Walker " + newWalker.getDrivingBehaviour());

        System.out.println("Walker " + walker.getLightingBehaviour() + " and when a car was " + newCarDriver.getDrivingBehaviour() +
                            " miles an hour he hit the walker...would have been nicer to be hit " +
                          "\n by a tractor " + tractorDriver.getDrivingBehaviour());

        RescueVehicle ambulance = new Ambulance();
        RescueVehicle fireBrigade = new FireBrigade();
        System.out.print("The " + ambulance.getRescueType() + " and the " + fireBrigade.getRescueType() + " are on the way");
    }
}

