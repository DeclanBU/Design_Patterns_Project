package State;

import Strategy.RoadUser;

/**
 * Created by Declan on 25/11/2018.
 */
public class Drunk implements DrivingState{
    RoadUser roadUser;

    public Drunk(RoadUser roadUser){
        this.roadUser = roadUser;
    }
    @Override
    public void gotStopped(String character) {
        System.out.println(character + " had too much to drink");

    }
    @Override
    public void gotBreathilised(String character) {
        System.out.println(character + " step out of the vehicle ");
    }
    @Override
    public void gotLucky(String character) {
        System.out.println(character + " faulty breathiliser ");
    }
}
