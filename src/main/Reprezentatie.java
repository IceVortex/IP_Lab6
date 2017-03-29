package main;

import java.io.Serializable;
import java.util.Vector;

public class Reprezentatie implements Serializable {

  private String data;

  private Integer ora;

  private Sala sala;
  private Vector<Bilet>  bilete;

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Integer getOra() {
    return ora;
  }

  public void setOra(Integer ora) {
    this.ora = ora;
  }

  public Sala getSala() {
    return sala;
  }

  public void setSala(Sala sala) {
    this.sala = sala;
  }

  public Integer getNrLocuri() {
    return nrLocuri;
  }

  public void setNrLocuri(Integer nrLocuri) {
    this.nrLocuri = nrLocuri;
  }

  public Vector<Bilet> getBilete() {
    return bilete;
  }

  public void setBilete(Vector<Bilet> bilete) {
    this.bilete = bilete;
  }

  private Integer nrLocuri;

}