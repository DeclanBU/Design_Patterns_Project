import Factory.IVehicle;
import Factory.VehicleFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Declan on 28/11/2018.
 */
public class FactoryTest {
    @Test
    public void TestFactory(){
        VehicleFactory roadUserVehicleFactory = VehicleFactory.getVehicleFactory("Ambulance");
        IVehicle vehicle = roadUserVehicleFactory.makeVehicle("A");
        Assert.assertNotEquals(null, vehicle);
        vehicle = roadUserVehicleFactory.makeVehicle("C");
        Assert.assertEquals(null, vehicle);

       VehicleFactory gardaVehicleFactory = VehicleFactory.getVehicleFactory("Garda Car");
       vehicle = gardaVehicleFactory.makeVehicle("F");
       Assert.assertEquals(null, vehicle);
       vehicle = roadUserVehicleFactory.makeVehicle("C");Assert.assertEquals(null, vehicle);
    }
}
