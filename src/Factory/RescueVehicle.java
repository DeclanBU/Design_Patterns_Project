package Factory;

/**
 * Created by Declan on 28/09/2018.
 */
public abstract class RescueVehicle {

    private String rescueType;

    public void setRescueType(String rescueType){
        this.rescueType= rescueType;
    }

     public String getRescueType()
    {
        return rescueType;
    }

    public String quicheFire()
    {
      return " quinching fire " + getRescueType();
    }
    public String giveBlood()
    {
        return " give blood " + getRescueType();
    }
}

