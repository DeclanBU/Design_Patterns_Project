package Factory;

import Adapter.IFireBrigade;

/**
 * Created by Declan on 28/09/2018.
 */
public class FireBrigade extends Vehicle implements IFireBrigade {


    public FireBrigade(){

        this.setType(" Fire Brigade");

    }
    @Override
    public String turnOnHose(){
        return "is turning on the hose from the " + getRescueType();
    }
} 