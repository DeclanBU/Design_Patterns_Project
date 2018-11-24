package Strategy;

/**
 * Created by t00189550 on 18/09/2018.
 */
public abstract class RoadUser {

    DrivingBehaviour drivingBehaviour;
    LightBehaviour lightBehaviour;

    final int FULL_FUEL = 50;
    final int HALF_FUEL = 25;
    final int NEARLY_OUT = 10;
    final int OUT_OF_FUEL = 0;
    private int currentFuel;

    public RoadUser(){

        setCurrentState(FULL_FUEL);
    }


    public String brake() {
        return " breaking ";
    }

    public String manoveur() {
        return "manoveuring";
    }


    public String getLightingBehaviour() {
        return lightBehaviour.turnOnLights();
    }


    public String getDrivingBehaviour() {
        return drivingBehaviour.drive();
    }
    public void setCurrentState(int state){
        this.currentFuel = state;
    }

    public int getCurrentFuel(){ return currentFuel; }


}

