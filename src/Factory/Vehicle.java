package Factory;

/**
 * Created by Declan on 28/09/2018.
 */
public abstract class Vehicle {

    private String rescueType;

    public void setType(String rescueType){
        this.rescueType= rescueType;
    }

     public String getRescueType()
    {
        return rescueType;
    }

    public String quincheFire()
    {
      return " are coming to the rescue with a" + getRescueType();
    }
    public String drive()
    {
        return " are driving a" + getRescueType();
    }
}

