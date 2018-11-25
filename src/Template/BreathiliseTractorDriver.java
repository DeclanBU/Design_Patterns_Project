package Template;

import Strategy.RoadUser;

/**
 * Created by Declan on 25/11/2018.
 */
public class BreathiliseTractorDriver extends PulledOver{

    public BreathiliseTractorDriver(RoadUser driver){

        super(driver);
    }
    @Override
    public void breathaliser() {
        System.out.println("Can you blow into this breathaliser please sir...");
        if (stoppedDriver.getCurrentState() == stoppedDriver.getLuckyState()) {
            System.out.println("The farmer had only one pint coming from the bog...luckily");
            stoppedDriver.setAlcoholLevel(stoppedDriver.getSoberState());
            System.out.println("Drive on home");
        } else {
            System.out.println("Farmer had no drink ");
        }
    }
}
