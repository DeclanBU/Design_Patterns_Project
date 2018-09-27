package Strategy;

/**
 * Created by t00189550 on 18/09/2018.
 */
public class CarDriver extends RoadUser {

    public CarDriver(){
        drivingBehaviour = new DrivingOver60();
        lightBehaviour = new TurnOnHeadLights();
    }
}
