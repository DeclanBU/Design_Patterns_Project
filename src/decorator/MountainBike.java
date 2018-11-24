package decorator;

import Factory.Bicycle;

/**
 * Created by Declan on 24/11/2018.
 */
public class MountainBike extends Bicycle {
    private String model;


public MountainBike(){
    model = "Raleigh Mountain Bike";
}

    public void setModel (String model){
        this.model = model;
    }

    public String getModel () {
        return model;
    }

    public int cost() {
        return 500;
    }
}
