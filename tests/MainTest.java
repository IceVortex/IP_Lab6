import main.Main;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * Created by roungureanu on 29-Mar-17.
 */
class MainTest {
    @Test
    void sum() {
        Main main = new Main();
        Assert.assertEquals(main.sum(3, 5), 9);
    }

    @Test
    void sum2()
    {
        Main main = new Main();
        Assert.assertEquals(main.sum(3, 5), 8);
    }

}