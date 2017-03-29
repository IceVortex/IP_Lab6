import main.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Vector;

/**
 * Created by roungureanu on 29-Mar-17.
 */
class BileteTests {
    @Test
    void serializeazaBiletNull() {
        Bilet b = new Bilet();
        b.save("D:\\java_work\\temp\\bilet.ser");

        Bilet newB = new Bilet();
        newB.load("D:\\java_work\\temp\\bilet.ser");

        Assert.assertEquals(b, newB);
    }

    @Test
    void serializeBilet()
    {
        Sala s = new Sala();
        Reprezentatie repr = new Reprezentatie("1", 1, s, new Vector<Bilet>(), 10);
        Loc l = new Loc();

        Bilet b = new Bilet(10, repr, l);
        b.save("D:\\java_work\\temp\\bilet.ser");

        Bilet newB = new Bilet();
        newB.load("D:\\java_work\\temp\\bilet.ser");

        Assert.assertEquals(b, newB);
    }

    @Test
    void serializeBiletInvalidPath()
    {
        Sala s = new Sala();
        Loc l = new Loc();
        Reprezentatie repr = new Reprezentatie("1", 1, s, new Vector<Bilet>(), 10);

        Bilet b = new Bilet(10, repr, l);
        b.save("X:\\asd.ser");

        Bilet newB = new Bilet();
        newB.load("X:\\asd.ser");

        Assert.assertEquals(b, newB);
    }

    @Test
    void stergeBiletReprezentatieVida()
    {
        Sala s = new Sala();
        Loc l = new Loc();
        Reprezentatie repr = new Reprezentatie("1", 1, s, new Vector<Bilet>(), 10);

        try {
            repr.removeBilet(10);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertEquals(repr.getBilete(), new Vector<Bilet>());
    }

    @Test
    void stergeBiletReprezentatieStandard1()
    {
        Sala s = new Sala();
        Loc l = new Loc();
        Reprezentatie r = new Reprezentatie("1", 1, s, new Vector<Bilet>(), 10);

        Bilet b1 = new Bilet(10, r, l);
        Bilet b2 = new Bilet(10, r, l);
        Bilet b3 = new Bilet(10, r, l);

        try {
            r.addBilet(b1);
            r.addBilet(b2);
            r.addBilet(b3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            r.removeBilet(1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Vector<Bilet> result = new Vector<Bilet>();
        result.add(b1);
        result.add(b3);

        Assert.assertEquals(r.getBilete(), result);
    }


    @Test
    void stergeBiletReprezentatieStandard()
    {
        Sala s = new Sala();
        Loc l = new Loc();
        Reprezentatie r = new Reprezentatie("1", 1, s, new Vector<Bilet>(), 10);

        Bilet b1 = new Bilet(10, r, l);
        Bilet b2 = new Bilet(10, r, l);
        Bilet b3 = new Bilet(10, r, l);

        try {
            r.addBilet(b1);
            r.addBilet(b2);
            r.addBilet(b3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            r.removeBilet(10);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Vector<Bilet> result = new Vector<Bilet>();
        result.add(b1);
        result.add(b2);
        result.add(b3);

        Assert.assertEquals(r.getBilete(), result);
    }
}