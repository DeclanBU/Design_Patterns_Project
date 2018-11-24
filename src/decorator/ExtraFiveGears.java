package decorator;

import Factory.Bicycle;

/**
 * Created by Declan on 30/10/2018.
 */
public class ExtraFiveGears extends ModifiedBicycle {
    public String model;
    Bicycle bike;


    public ExtraFiveGears(Bicycle bike){
        this.bike = bike;
    }
    @Override
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String getModel(){
        return bike.getModel();
    }

    @Override
    public int cost() {
        return 10 ;
    }
}

