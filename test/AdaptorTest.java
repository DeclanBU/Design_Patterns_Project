/**
 * Created by Declan on 28/11/2018.
 */
import Adapter.*;
import Factory.FireBrigade;
import Factory.IVehicle;
import org.junit.Assert;
import org.junit.Test;

public class AdaptorTest {
    @Test
    public void TestAdapter(){
        IVehicle fireBrigade = new FireBrigade();
        Assert.assertNotEquals("are not driving a", fireBrigade.drive());
        Assert.assertEquals("are coming to the rescue with a Fire Brigade", fireBrigade.quincheFire());
        fireBrigade = new FireBrigadeAdapter(new FireBrigade());
        Assert.assertEquals(" turned on the loud siren from the Fire Brigade", fireBrigade.quincheFire());
        Assert.assertNotEquals("turned off the siren ", fireBrigade.drive());
    }

}

