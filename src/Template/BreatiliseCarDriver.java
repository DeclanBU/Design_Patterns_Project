package Template;

import Strategy.RoadUser;

/**
 * Created by Declan on 25/11/2018.
 */
public class BreatiliseCarDriver extends PulledOver{

    public BreatiliseCarDriver(RoadUser carDriver){

        super(carDriver);
    }
    @Override
    public void breathaliser() {
        System.out.println("Can you blow into this breathaliser please sir...");
        if (stoppedDriver.getCurrentState() == stoppedDriver.getDrunkState()) {
            System.out.println("Please step out of the vehicle sir");
            stoppedDriver.setAlcoholLevel(stoppedDriver.getDrunkState());


        } else {
            System.out.println("Driver had no drink ");
        }

    }
    @Override
    public void handCuff(){
        System.out.println("Put your hands where I can see them");
    }
}