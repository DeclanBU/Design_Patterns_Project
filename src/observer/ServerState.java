package observer;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Declan on 29/11/2018.
 */
public class ServerState implements Observer {

    private MacDonalds state = MacDonalds.SERVERWAITING;

    @Override
    public void update(Observable o, Object arg) {

        Moving action = (Moving) arg;
        switch (action){
            case DRIVEUPTO: open(); break;
            case COLLECTFOOD: takeOrder(); break;
            case LEAVE: thankYou(); break;
        }
    }
    public void state(){
        System.out.println("STATE: " + state.toString());
    }
    private void open(){
        System.out.println("The window hatch is open for order");
        state = MacDonalds.READYFORORDER;
    }
    private void takeOrder(){
        System.out.println("The window hatch remains to collect food");
        state = MacDonalds.ORDER;
    }
    private void thankYou(){
        System.out.println("Thank you Server waiting for next customer");
        state = MacDonalds.SERVERWAITING;
    }

}