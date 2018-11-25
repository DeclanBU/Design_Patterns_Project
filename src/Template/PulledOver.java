package Template;
import Strategy.DrivingOver60;
import Strategy.RoadUser;

/**
 * Created by Declan on 25/11/2018.
 */
public abstract class PulledOver {
    protected RoadUser stoppedDriver;

    public PulledOver(RoadUser stoppedDriver) {
        this.stoppedDriver = stoppedDriver;
    }


    public void pulledOver(){
            namePlease();
            areYouAfterBooze();

        if(stoppedDriver.getCurrentState() != stoppedDriver.getDrunkState());
           speeding();
        }

    public void namePlease(){
            System.out.print( " Good evening what is your name please");

        }
    public void speeding(){
        System.out.print( " Ok but you were speedeing");
        stoppedDriver.setdrivingBehaviour(new DrivingOver60());
        System.out.print( "GARDA: Here is your ticket .. be more careful ");

    }
    public void areYouAfterBooze() {
        System.out.print( " Have you been drinking alcohol ") ;
    }
    public void handCuff() {};
    public void backUpNeeded() {};
    public abstract void breathaliser();
}

