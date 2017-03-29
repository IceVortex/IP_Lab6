import main.Bilet;
import main.Main;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * Created by roungureanu on 29-Mar-17.
 */
class BileteTests {
    @Test
    void serializeazaBiletNull() {
        Bilet b = new Bilet();
        b.save("D:\\java_work\\temp\\bilet.ser");
    }

    @Test
    void sum2()
    {
        Main main = new Main();
        Assert.assertEquals(main.sum(3, 5), 8);
    }

}