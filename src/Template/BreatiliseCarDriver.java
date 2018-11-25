package Template;

import Strategy.RoadUser;

import javax.swing.*;

/**
 * Created by Declan on 25/11/2018.
 */
public class BreatiliseCarDriver extends PulledOver{

    public BreatiliseCarDriver(RoadUser carDriver){

        super(carDriver);
    }
    @Override
    public void breathaliser() {
        String type = JOptionPane.showInputDialog("Can you blow into breatiliser CarDriver('F' for fail 'P' for pass)");
        if (type.equals("F") &&  stoppedDriver.getCurrentState() == stoppedDriver.getDrunkState()) {

            System.out.println("Put your hands where I can see them");
        } else
            stoppedDriver.setAlcoholLevel(stoppedDriver.getSoberState());
        System.out.println("Drive on");
    }


}