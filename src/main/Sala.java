package main;

import java.util.Vector;

public class Sala {

  private String nume;

    /**
   * 
   * @element-type Loc
   */
    private Vector<Loc>  locuri;

  public String getNume() {
    return nume;
  }

  public void setNume(String nume) {
    this.nume = nume;
  }

  public Vector<Loc> getLocuri() {
    return locuri;
  }

  public void setLocuri(Vector<Loc> locuri) {
    this.locuri = locuri;
  }

  @Override
  public String toString() {
    return "Sala{" +
            "nume='" + nume + '\'' +
            ", locuri=" + locuri +
            '}';
  }
}