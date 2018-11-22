import Factory.*;
import Strategy.CarDriver;
import Strategy.MotorBikeDriver;
import Strategy.RoadUser;
import Strategy.TractorDriver;
import Strategy.Walker;
import decorator.ModifiedBicycle;
import decorator.Bike;

import javax.swing.*;

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
         //Strategy
        RoadUser walker = new Walker();
        System.out.println("Walker " + walker.getLightingBehaviour());
        RoadUser newWalker = new Walker();
        System.out.println("Walker " + newWalker.getDrivingBehaviour());

        System.out.println("Walker " + walker.getLightingBehaviour() + " and when a car was " + newCarDriver.getDrivingBehaviour() +
                " miles an hour he hit the walker...would have been nicer to be hit " +
                "\n by a tractor " + tractorDriver.getDrivingBehaviour());

        //IVehicle ambulance = new Ambulance();
        //IVehicle fireBrigade = new FireBrigade();
        //System.out.print("The " + fireBrigade.quincheFire() + " are on the way");


        VehicleFactory roadUserVehicleFactory = new RoadUserVehicleFactory();
        String type = JOptionPane.showInputDialog("If the accident has caused a fire choose 'F' or if needs an ambulance choose A");

        IVehicle vehicle = roadUserVehicleFactory.makeVehicle(type);

        System.out.println("\nRescue team are coming and " + vehicle.drive());

        System.out.println("Rescue team are coming and " + vehicle.quincheFire());
        //Factory
        VehicleFactory highSpeedVehicleFactory = new HighSpeedVehicleFactory();
        type = JOptionPane.showInputDialog("If the incident needs a Garda on site quickly choose 'B' or if it not needed so quick choose C");

        vehicle = highSpeedVehicleFactory.makeVehicle(type);

        System.out.println("\nRescue team are coming and" + vehicle.drive());

        System.out.println("Rescue team are coming and" + vehicle.quincheFire());
        //Decorator
        Bike mountainBike = new ModifiedBicycle();
        System.out.print("A Road user has bought a bicycle");
        mountainBike.setModel("Raleigh");
        System.out.print("\nA Road user is cycling a bicycle made by " + mountainBike.getModel());


    }
}

