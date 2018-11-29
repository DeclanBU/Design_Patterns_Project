package observer;

import java.util.Observable;

/**
 * Created by Declan on 29/11/2018.
 */
public class Customer extends Observable {

        public void approachWindowHatch(){
            System.out.println("Approaching order window");
            setChanged();
            notifyObservers(Moving.DRIVEUPTO);
        }

        public void orderFood(){
            System.out.println("Order a big mac meal.");
            setChanged();
            notifyObservers(Moving.COLLECTFOOD);
        }

        public void foodCollected(){
            System.out.println("Leave with food");
            setChanged();
            notifyObservers(Moving.LEAVE);
        }
    }

