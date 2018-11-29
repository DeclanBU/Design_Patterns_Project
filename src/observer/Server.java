package observer;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Declan on 29/11/2018.
 */
public class Server implements Observer {

    private MacDonalds state = MacDonalds.SERVERBUSY;

    @Override
    public void update(Observable o, Object arg) {

        Moving action = (Moving) arg;
        switch (action){
            case DRIVEUPTO: drive(); break;
            case COLLECTFOOD: takeOrder(); break;
            case LEAVE: thankYou(); break;
        }
    }
    private void drive(){
        System.out.println("The window hatch is open for order");
        state = MacDonalds.ORDER;
    }
    private void takeOrder(){
        System.out.println("The window hatch remains open for order");
        state = MacDonalds.ORDER;
    }
    private void thankYou(){
        System.out.println("The window hatch is closed");
        state = MacDonalds.SERVERBUSY;
    }

}