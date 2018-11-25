package Template;

import Strategy.RoadUser;

/**
 * Created by Declan on 25/11/2018.
 */
public abstract class Arrest {
    protected RoadUser guiltyDriver;

    public Arrest(RoadUser guiltyDriver) {
        this.guiltyDriver = guiltyDriver;
    }
        public void arrest(){
            handCuff();
            callBackUp();

        if(guiltyDriver.getCurrentState() == guiltyDriver.getDrunkState()) {
            handCuff();
            callBackUp();

        }
    }

    public void handCuff(){
            System.out.print( " put out your 2 hands where i can see them ") ;
    }
    public void callBackUp(){
        System.out.print( " we have a problem .. calling backup ") ;
    }
}

