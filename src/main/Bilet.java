package main;

import java.util.Vector;

public class Bilet {

  private Integer pret;
  private Reprezentatie myReprezentatie;
  private Loc myLoc;

  public Integer getPret() {
    return pret;
  }

  public void setPret(Integer pret) {
    this.pret = pret;
  }

  public Reprezentatie getMyReprezentatie() {
    return myReprezentatie;
  }

  public void setMyReprezentatie(Reprezentatie myReprezentatie) {
    this.myReprezentatie = myReprezentatie;
  }
  public Loc getMyLoc() {
    return myLoc;
  }

  public void setMyLoc(Loc myLoc) {
    this.myLoc = myLoc;
  }
}