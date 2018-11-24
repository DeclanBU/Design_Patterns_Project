package Strategy;

/**
 * Created by Declan on 27/09/2018.
 */
public class Walker extends RoadUser {

   public Walker() {
       super();
       drivingBehaviour = new CantDrive();
       lightBehaviour = new CannotTurnOnHeadLights();
   }
}
