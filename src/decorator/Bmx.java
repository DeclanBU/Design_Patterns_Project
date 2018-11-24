package decorator;

import Factory.Bicycle;

/**
 * Created by Declan on 30/10/2018.
 */
public class Bmx extends Bicycle {
    private String model;


    public Bmx(){
        model = " off road bmx";
    }

        public void setModel (String model){
            this.model = model;
        }

        public String getModel () {
            return model;
        }

    public int cost() {
        return 400;
    }
}
