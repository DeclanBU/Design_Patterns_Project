package Strategy;

import Strategy.RoadUser;

/**
 * Created by t00189550 on 18/09/2018.
 */
public class TractorDriver extends RoadUser {

    public TractorDriver(){
    drivingBehaviour = new DrivingUnder30();
    lightBehaviour = new TurnOnHeadLights(); {

        }
    }
}
