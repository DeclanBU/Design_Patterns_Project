import Factory.*;
import decorator.*;

import javax.swing.*;

/**
 * Created by t00189550 on 19/09/2018.
 */
public class DriveSimulator {
    public static void main(String[] args) {





       // RoadUser.ALCOHOL_LEVEL fuel = tractorDriver.getAlcoholLevel();
       // if (fuel == RoadUser.ALCOHOL_LEVEL.VERY_DRUNK)
       //     System.out.print("The tractor is currently full of fuel but after driving for 12 hours its running low");

           // tractorDriver.setAlcoholLevel(RoadUser.ALCOHOL_LEVEL.NEARLY_OUT);
        //if (fuel == RoadUser.ALCOHOL_LEVEL.NEARLY_OUT)
        //   System.out.print("\n The tractor would want to be filled up with fuel soon!");

        //IVehicle ambulance = new Ambulance();
        //IVehicle fireBrigade = new FireBrigade();
        //System.out.print("The " + fireBrigade.quincheFire() + " are on the way");


        VehicleFactory roadUserVehicleFactory = new RoadUserVehicleFactory();
        String type = JOptionPane.showInputDialog("If the accident has caused a fire choose 'F' or if needs an ambulance choose A");

        IVehicle vehicle = roadUserVehicleFactory.makeVehicle(type);

        System.out.println("\nRescue team are coming and " + vehicle.drive());

        System.out.println("Rescue team are coming and " + vehicle.quincheFire());
        //Factory
        VehicleFactory highSpeedVehicleFactory = new GardaVehicleFactory();
        type = JOptionPane.showInputDialog("If the incident needs a Garda on site quickly choose 'B' or if it not needed so quick choose C");

        vehicle = highSpeedVehicleFactory.makeVehicle(type);

        System.out.println("\nRescue team are coming and" + vehicle.drive());

        System.out.println("Rescue team are coming and" + vehicle.quincheFire());

        //Decorator
        System.out.print("\n    ******ALL BIKES IN THE STORE CAN HAVE 5 0R 10 EXTRA GEARS FITTED AT EXTRA COST*****");

        Bicycle bike1 = new Bmx();
        bike1 = new ExtraFiveGears(bike1);
        System.out.print("\nA punter bought an " + bike1.getModel() + " with the 5 gear offer at a cost of " + bike1.cost() + " euros an hour to do extra work");


        Bicycle bike2 = new MountainBike();
        bike2 = new ExtraFiveGears(bike2);
        System.out.print ("\nA different punter bought a " + bike2.getModel() + " and also wanted 5 extra gears which was also " + bike2.cost() + " an hour to do extra work");

        Bicycle bike3 = new MountainBike();
        bike3 = new ExtraTenGears(bike3);
        System.out.print ("\nAnother punter also bought the " + bike3.getModel() + " but wanted the 10 gear offer however the 10 gear offer is " + bike3.cost() +
                " euros an hour to do extra work ");


        System.out.println ("\n\n******* Pulled over by GARDAI ********** ");
        String type2;
        type2 = JOptionPane.showInputDialog("GARDA: Do you know what speed you were doing(Y or N)");


    }
}

