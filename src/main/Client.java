package main;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihaila on 3/29/2017.
 */
public class Client {

    private List<Bilet> bileteCumparate;

    private int bani;

    public Client(int bani) throws Exception {

        if(bani<0) {
            throw new Exception("Nu poti adauga bani cu minus");
        }
        this.bani=bani;
        bileteCumparate = new ArrayList<>();
    }

    public void addBani(int value){
        this.bani+=value;
    }

    public void displayBileteLibere(Reprezentatie reprezentatie){
        System.out.println(reprezentatie.getBileteDisponibile());
    }

    public void buyBilet(Bilet bilet) throws Exception {

        if (this.bani - bilet.getPret() < 0)
            throw new Exception("NU AI DESTUI BANI!");
        else {
            bilet.getMyLoc().setOcupat(true);
            bileteCumparate.add(bilet);
            this.bani-=bilet.getPret();

        }
    }

}
