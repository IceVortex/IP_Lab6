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

        try {
            repr.addBilet(b);
        } catch (Exception e) {
            e.printStackTrace();
        }

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

        try {
            repr.addBilet(b1);
            repr.addBilet(b2);
            repr.addBilet(b3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Vector<Bilet> bilete = new Vector<Bilet>();
        bilete.add(b1);
        bilete.add(b2);
        bilete.add(b3);

        Assert.assertEquals(repr.getBilete(), bilete);
    }

    @Test
    void adaugaBileteMultiple() {
        Sala s = new Sala();
        Loc l = new Loc();
        Reprezentatie repr = new Reprezentatie("10-01-2017", 14, s, new Vector<Bilet>(), 2);

        Bilet b1 = new Bilet(100, repr, l);
        Bilet b2 = new Bilet(150, repr, l);
        Bilet b3 = new Bilet(130, repr, l);

        try {
            repr.addBilet(b1);
            repr.addBilet(b2);
            repr.addBilet(b3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Vector<Bilet> bilete = new Vector<Bilet>();
        bilete.add(b1);
        bilete.add(b2);

        Assert.assertEquals(repr.getBilete(), bilete);
    }

    @Test
    void cautaBiletInexistent()
    {
        Sala s = new Sala();
        Loc l = new Loc();
        Reprezentatie r = new Reprezentatie("a", 1, s, new Vector<Bilet>(), 10);

        Bilet b1 = new Bilet(10, r, l);
        Bilet b2 = new Bilet(15, r, l);
        Bilet b3 = new Bilet(14, r, l);
        Bilet b4 = new Bilet(12, r, l);

        try {
            r.addBilet(b1);
            r.addBilet(b3);
            r.addBilet(b4);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertEquals(r.searchByBilet(b2), false);
    }


    @Test
    void cautaBiletExistent()
    {
        Sala s = new Sala();
        Loc l = new Loc();
        Reprezentatie r = new Reprezentatie("a", 1, s, new Vector<Bilet>(), 10);

        Bilet b1 = new Bilet(10, r, l);
        Bilet b2 = new Bilet(15, r, l);
        Bilet b3 = new Bilet(14, r, l);
        Bilet b4 = new Bilet(12, r, l);

        try {
            r.addBilet(b1);
            r.addBilet(b3);
            r.addBilet(b4);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertEquals(r.searchByBilet(b1), true);
    }

}