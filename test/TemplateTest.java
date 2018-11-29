import Template.BreatiliseCarDriver;
import Template.PullOver;
import org.junit.Assert;
import Strategy.CarDriver;
import Strategy.TractorDriver;
import org.junit.Test;

/**
 * Created by Declan on 29/11/2018.
 */
public class TemplateTest {
    @Test
    public void TestTemplateMethod(){
        PullOver pullOverCarDriver = new BreatiliseCarDriver(new CarDriver("Car Driver "));
        Assert.assertNotEquals(null, pullOverCarDriver);
        PullOver pullOverTracDriver = new BreatiliseCarDriver (new TractorDriver("Tractor Driver"));
        Assert.assertNotEquals(null, pullOverTracDriver);
    }
}
