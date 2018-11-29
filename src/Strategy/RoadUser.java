package Strategy;
import State.*;

/**
 * Created by t00189550 on 18/09/2018.
 */
public abstract class RoadUser {
    String userName;
    DrivingBehaviour drivingBehaviour;
    LightBehaviour lightBehaviour;


   DrivingState drunk,sober,lucky,alcoholLevel;


    public RoadUser(String userName){
        this.userName = userName;

        alcoholLevel = drunk;
    }


    public String brake() {
        return getUserName() + " breaking ";
    }

    public String manoveur() {
        return this.getUserName() +  "manoveuring";
    }


    public String getLightingBehaviour() {
        return lightBehaviour.turnOnLights();
    }
    public String getUserName() { return this.userName; }


    public String getDrivingBehaviour() {
        return drivingBehaviour.drive();
    }
    public void setdrivingBehaviour(DrivingBehaviour drivingBehaviour){
        this.drivingBehaviour = drivingBehaviour;
    }
    public void setLightBehaviour(LightBehaviour lightBehaviour){
        this.lightBehaviour = lightBehaviour;
    }

    public void setAlcoholLevel(DrivingState state){
        this.alcoholLevel = state;
    }
    public DrivingState getCurrentState()
    { return alcoholLevel; }

    public void gotStopped(String roadUser)
    {
       alcoholLevel.gotStopped(roadUser);

    }

    public DrivingState getDrunkState() { return drunk; }
    public DrivingState getLuckyState() { return lucky; }
    public DrivingState getSoberState() { return sober; }


}

