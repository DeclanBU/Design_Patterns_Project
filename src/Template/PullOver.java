package Template;
import Strategy.DrivingOver60;
import Strategy.RoadUser;

import javax.swing.*;

/**
 * Created by Declan on 25/11/2018.
 */
public abstract class PullOver {
    protected RoadUser stoppedDriver;

    public PullOver(RoadUser stoppedDriver) {
        this.stoppedDriver = stoppedDriver;
    }


    public void pulledOver() {


        String type = JOptionPane.showInputDialog("GARDA: Do you know what speed you were doing(Y or N)");
        if (type.equals("N")) {
            speeding();
        } else
            stillSpeeding();
            speeding();
    }

    public void namePlease(){
            System.out.println( " Good evening what is your name please");

        }
    public void speeding(){
        System.out.println( " You were speedeing");
        stoppedDriver.setdrivingBehaviour(new DrivingOver60());
        System.out.println( " You were " + stoppedDriver.getDrivingBehaviour());
        breathaliser();
    }
    public void stillSpeeding() {
        System.out.println( " Well you were still speeding!! ") ;
    }
    public void breathaliser() {};

}

