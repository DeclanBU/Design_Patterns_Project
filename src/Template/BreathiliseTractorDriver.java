package Template;

import Strategy.RoadUser;

import javax.swing.*;

/**
 * Created by Declan on 25/11/2018.
 */
public class BreathiliseTractorDriver extends PullOver {

    public BreathiliseTractorDriver(RoadUser tractorDriver){

        super(tractorDriver);
    }
    @Override
    public void breathaliser() {
        String type = JOptionPane.showInputDialog("Can you blow into breatiliser TractorDriver('F' for fail 'P' for pass)");
        if (type.equals("P") &&  stoppedDriver.getCurrentState() == stoppedDriver.getSoberState()) {

            System.out.println("\nDrive on home");


        } else
            stoppedDriver.setAlcoholLevel(stoppedDriver.getLuckyState());
            System.out.println("Put your hands where I can see them");
        }
}
