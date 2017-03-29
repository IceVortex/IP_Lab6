package main;

import java.util.Vector;

public class Database {

    /**
   * 
   * @element-type Bilet
   */
  private Vector<Bilet>  myBilet;

    public Vector<Bilet> getMyBilet() {
        return myBilet;
    }

    public void setMyBilet(Vector<Bilet> myBilet) {
        this.myBilet = myBilet;
    }
}