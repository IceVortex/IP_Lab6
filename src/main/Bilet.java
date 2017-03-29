package main;

import java.util.Vector;

public class Bilet {

  private Integer pret=1;
  private Reprezentatie myReprezentatie;
  private Loc myLoc;

    @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Bilet bilet = (Bilet) o;

    if (pret != null ? !pret.equals(bilet.pret) : bilet.pret != null) return false;
    if (myReprezentatie != null ? !myReprezentatie.equals(bilet.myReprezentatie) : bilet.myReprezentatie != null)
      return false;
    return myLoc != null ? myLoc.equals(bilet.myLoc) : bilet.myLoc == null;
  }

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