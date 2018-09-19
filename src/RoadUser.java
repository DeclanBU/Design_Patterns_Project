/**
 * Created by t00189550 on 18/09/2018.
 */
public abstract class RoadUser {

    public String accelerate(){
        return "accelerating";
    }
    public String brake(){
        return " braking ";
    }
    public String manoveur(){
        return "manoveuring";
    }


    public String turnOnHeadLights(){
        return "Car headlights on for night driving";
    }
    public abstract String drive();


}

