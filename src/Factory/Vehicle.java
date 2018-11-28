package Factory;

/**
 * Created by Declan on 28/09/2018.
 */
public abstract class Vehicle implements IVehicle{

    private String type;

    public void setType(String type){
        this.type=type;
    }

     public String getRescueType()
    {
        return type;
    }
    @Override
    public String quincheFire()
    {
      return "are coming to the rescue with a" + getRescueType();
    }
    @Override
    public String drive()
    {
        return "are driving a" + getRescueType();
    }
}

