package Strategy;



/**
 * Created by t00189550 on 18/09/2018.
 */
public abstract class RoadUser {

    DrivingBehaviour drivingBehaviour;
    LightBehaviour lightBehaviour;


    public enum FUEL_STATE {
        FULL_FUEL(50), HALF_FUEL(25), NEARLY_OUT(10), OUT_OF_FUEL(0);
        private int fuel;

        FUEL_STATE(int fuel) {
            this.fuel = fuel;

        }
    }
    FUEL_STATE currentFuel;

    public RoadUser(){

        setCurrentFuel(FUEL_STATE.FULL_FUEL);
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
    public void setCurrentFuel(FUEL_STATE fuel){
        this.currentFuel = fuel;
    }

    public FUEL_STATE getCurrentFuel() {
        return currentFuel;
    }


}

