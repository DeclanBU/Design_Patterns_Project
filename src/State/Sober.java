package State;

import Strategy.RoadUser;

/**
 * Created by Declan on 25/11/2018.
 */
public class Sober implements DrivingState{
    RoadUser roadUser;

    public Sober(RoadUser roadUser){
        this.roadUser = roadUser;
    }
    @Override
    public void gotStopped(String character) {
        System.out.println(character + " had no drink");

    }
    @Override
    public void gotBreathilised(String character) {
        System.out.println(character + " have a good evening");
    }
    @Override
    public void gotLucky(String character) {
        System.out.println(character + " could have had another one but didnt ");
    }
}