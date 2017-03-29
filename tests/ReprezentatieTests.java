import main.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Vector;

/**
 * Created by roungureanu on 29-Mar-17.
 */
class ReprezentatieTests {
    @Test
    void testBiletNull() {
        Sala s = new Sala();
        Reprezentatie repr = new Reprezentatie("10-01-2017", 14, s, new Vector<Bilet>(), 100);

        Bilet b = null;

        repr.addBilet(b);

        Vector<Bilet> bilete = new Vector<Bilet>();

        Assert.assertEquals(repr.getBilete(), bilete);
    }

    @Test
    void testBiletStandard()
    {
        Sala s = new Sala();
        Loc l = new Loc();

        Reprezentatie repr = new Reprezentatie("10-01-2017", 14, s, new Vector<Bilet>(), 100);
        Bilet b1 = new Bilet(100, repr, l);
        Bilet b2 = new Bilet(150, repr, l);
        Bilet b3 = new Bilet(130, repr, l);

        repr.addBilet(b1);
        repr.addBilet(b2);
        repr.addBilet(b3);

        Vector<Bilet> bilete = new Vector<Bilet>();
        bilete.add(b1);
        bilete.add(b2);
        bilete.add(b3);

        Assert.assertEquals(repr.getBilete(), bilete);
    }

}