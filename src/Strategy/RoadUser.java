package Strategy;
import State.*;

/**
 * Created by t00189550 on 18/09/2018.
 */
public abstract class RoadUser {

    DrivingBehaviour drivingBehaviour;
    LightBehaviour lightBehaviour;


   DrivingState drunk,sober,lucky,alcoholLevel;


    public RoadUser(){

        alcoholLevel = drunk;
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

    public void setAlcoholLevel(DrivingState state){
        this.alcoholLevel = state;
    }

    public void gotStopped(String roadUser)
    {
       alcoholLevel.gotStopped(roadUser);

    }
    public DrivingState getDrunkState() { return drunk; }
    public DrivingState getLuckyState() { return lucky; }
    public DrivingState getSoberState() { return sober; }


}

