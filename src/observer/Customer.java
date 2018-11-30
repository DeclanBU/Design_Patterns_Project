package observer;

import Strategy.*;
import Factory.VehicleFactory;

import java.util.Observable;

/**
 * Created by Declan on 29/11/2018.
 */
public class Customer extends Observable   {
        String name = "John";
        RoadUser user = new CarDriver(name);
        public void approachWindowHatch(){

            System.out.println( user.getUserName() + " is approaching the order window");

            setChanged();
            notifyObservers(Moving.DRIVEUPTO);
        }

        public void orderFood(){
            System.out.println(user.brake() + " while ordering a big mac meal.");
            setChanged();
            notifyObservers(Moving.COLLECTFOOD);
        }

        public void foodCollected(){
            System.out.println("After " +  user.manoveur() + " around the drive thru he leaves with the food");
            setChanged();
            notifyObservers(Moving.LEAVE);
        }
    }

