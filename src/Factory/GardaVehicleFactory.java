package Factory;

/**
 * Created by Declan on 30/10/2018.
 */
public class GardaVehicleFactory extends VehicleFactory{
    @Override
    public Vehicle makeVehicle(String type) {


        if (type.equals("C")) {

            return new GardaCar();

        } else if (type.equals("B")) {

            return new HighSpeedGardaBike();
        }
        return null;
    }
}