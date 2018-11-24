import Strategy.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Declan on 24/11/2018.
 */
public class StrategyTest {

    @Test
    public void testStrategy()
    {
        RoadUser walker = new Walker();

        Assert.assertEquals("cannot turn on headlights", walker.getLightingBehaviour());
        Assert.assertNotEquals("Can turn on headlights", walker.getLightingBehaviour());
    }
}
