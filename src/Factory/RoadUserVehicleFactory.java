package Factory;

import Adapter.FireBrigadeAdapter;

/**
 * Created by Declan on 30/10/2018.
 */
public class RoadUserVehicleFactory extends VehicleFactory{
    @Override
    public IVehicle makeVehicle(String type){

    if (type.equals("F")) {

        return new FireBrigadeAdapter(new FireBrigade());


    } else if (type.equals("A")) {

        return new Ambulance();
    }
    return null;
}
}
