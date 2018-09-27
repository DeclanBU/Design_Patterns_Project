package Strategy;

/**
 * Created by t00189550 on 18/09/2018.
 */
public class MotorBikeDriver extends RoadUser {

    public MotorBikeDriver() {
        drivingBehaviour = new Wheelie();
    }
}
