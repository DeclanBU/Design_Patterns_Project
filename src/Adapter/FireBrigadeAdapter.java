package Adapter;

import Factory.IVehicle;

/**
 * Created by Declan on 22/11/2018.
 */
public class FireBrigadeAdapter implements IVehicle {
    private IFireBrigade iFireBrigade;

    public FireBrigadeAdapter(IFireBrigade iFireBrigade)
    {
        this.iFireBrigade = iFireBrigade;
    }
    @Override
    public String drive()
    {
        return iFireBrigade.drive();
    }
    @Override
    public String quincheFire()
    {
        return iFireBrigade.turnOnSiren();
    }
}
