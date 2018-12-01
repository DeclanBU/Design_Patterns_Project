package Factory;

/**
 * Created by Declan on 28/09/2018.
 */
public abstract class VehicleFactory  {

    public abstract IVehicle makeVehicle(String type);

    public static VehicleFactory getVehicleFactory(String type){
        if(type.equals("Ambulance")){
            return new RoadUserVehicleFactory();
        }else if(type.equals("Garda Car")){
            return new GardaVehicleFactory();
        }
        return null;
    }
}
