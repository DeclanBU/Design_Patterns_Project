package Strategy;

/**
 * Created by Declan on 27/09/2018.
 */
public class DrivingUnder30 implements DrivingBehaviour {

    @Override
    public String drive(){
        return "driving under 30 miles an hour in";
    }
}
