package main;

import java.io.Serializable;
import java.util.Vector;

public class Loc implements Serializable {

  private Integer nr;
  private Boolean ocupat;
    private Bilet myBilet;
    private Sala  mySala;


  @Override
  public String toString() {
    return "Loc{" +
            "nr=" + nr +
            ", ocupat=" + ocupat +
            ", myBilet=" + myBilet +
            ", mySala=" + mySala +
            '}';
  }
}