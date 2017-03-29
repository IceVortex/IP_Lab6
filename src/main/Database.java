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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Database database = (Database) o;

        return myBilet.equals(database.myBilet);
    }

    @Override
    public int hashCode() {
        return myBilet.hashCode();
    }

    public void setMyBilet(Vector<Bilet> myBilet) {
        this.myBilet = myBilet;
    }
}