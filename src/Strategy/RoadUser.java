package Strategy;

/**
 * Created by t00189550 on 18/09/2018.
 */
public abstract class RoadUser {

    DrivingBehaviour drivingBehaviour;
    LightBehaviour lightBehaviour;

    public String accelerate() {
        return "accelerating";
    }

    public String brake() {
        return " breaking ";
    }

    public String manoveur() {
        return "manoveuring";
    }

    public void setLightingBehaviour(LightBehaviour lightBehaviour )
    {
       this.lightBehaviour=lightBehaviour;
    }

    public String getLightingBehaviour() {
        return lightBehaviour.turnOnLights();
    }


    public String getDrivingBehaviour() {
        return drivingBehaviour.drive();
    }



    //public String turnOnHeadLights(){
     //   return "headlights for night driving";
 //   }



}

