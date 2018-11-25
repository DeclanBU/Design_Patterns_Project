package State;

/**
 * Created by Declan on 25/11/2018.
 */
public interface DrivingState {
    void gotStopped(String character);
    void gotBreathilised(String character);
    void gotLucky(String character);

}

