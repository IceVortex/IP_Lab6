package main;

import java.io.Serializable;
import java.util.Vector;

public class Loc implements Serializable {

  private Integer nr;
  private Boolean ocupat;
    private Bilet myBilet;
    private Sala  mySala;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Loc loc = (Loc) o;

    if (!nr.equals(loc.nr)) return false;
    if (!ocupat.equals(loc.ocupat)) return false;
    if (!myBilet.equals(loc.myBilet)) return false;
    return mySala.equals(loc.mySala);
  }

  @Override
  public int hashCode() {
    int result = nr.hashCode();
    result = 31 * result + ocupat.hashCode();
    result = 31 * result + myBilet.hashCode();
    result = 31 * result + mySala.hashCode();
    return result;
  }
}