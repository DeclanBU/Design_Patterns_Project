import Strategy.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Declan on 24/11/2018.
 */
public class StrategyTest {
    private RoadUser userName;

    @Test
    public void testLightingBehaviour() {
        userName = new Walker("Walker");

        Assert.assertEquals("cannot turn on headlights", userName.getLightingBehaviour());
        Assert.assertNotEquals("Can turn on headlights", userName.getLightingBehaviour());
    }

    @Test
    public void testDrivingBehaviour() {

        userName = new CarDriver(" Car Customer");
        Assert.assertNotEquals(userName.getUserName() + " can not drive", userName.getDrivingBehaviour());
        userName.setdrivingBehaviour(new DrivingOver60());
        Assert.assertEquals("driving over 60", userName.getDrivingBehaviour());
        userName.setdrivingBehaviour(new CantDrive());
        Assert.assertNotEquals(userName.getUserName() + "can not drive", userName.getDrivingBehaviour());

    }
    @Test
    public void testGetCurrentState(){
        userName = new CarDriver("Car Customer");
        Assert.assertEquals(userName.getDrunkState(), userName.getCurrentState());
        userName.getSoberState();
    }
}