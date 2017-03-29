package main;

import java.util.Vector;

public class Loc {

  public Integer nr;

  public Integer getNr() {
    return nr;
  }

  public void setNr(Integer nr) {
    this.nr = nr;
  }

  public Boolean getOcupat() {
    return ocupat;
  }

  public void setOcupat(Boolean ocupat) {
    this.ocupat = ocupat;
  }

  public Bilet getMyBilet() {
    return myBilet;
  }

  public void setMyBilet(Bilet myBilet) {
    this.myBilet = myBilet;
  }

  public Sala getMySala() {
    return mySala;
  }

  public void setMySala(Sala mySala) {
    this.mySala = mySala;
  }

  public Boolean ocupat;

    public Bilet myBilet;
    public Sala  mySala;

}