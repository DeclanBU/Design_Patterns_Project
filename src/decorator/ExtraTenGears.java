package decorator;

import Factory.Bicycle;

/**
 * Created by Declan on 24/11/2018.
 */
public class ExtraTenGears extends ModifiedBicycle{
    public String model;
    Bicycle bike;


    public ExtraTenGears(Bicycle bike){
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
        return 12 ;
    }
}
