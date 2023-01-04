import Utils.Sum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumUnitTest {


    Sum sum = new Sum();

    @Test
    public void firstGreaterThanSecond(){

        int result = sum.findMax(10,2);

        Assert.assertEquals(result,10);
    }

    @Test
    public void firstlessThanSecond(){

        int result = sum.findMax(2,10);
        Assert.assertEquals(result,10);
    }
}
