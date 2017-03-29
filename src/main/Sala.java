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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Sala sala = (Sala) o;

    if (!nume.equals(sala.nume)) return false;
    return locuri.equals(sala.locuri);
  }

  @Override
  public int hashCode() {
    int result = nume.hashCode();
    result = 31 * result + locuri.hashCode();
    return result;
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