package main;

import java.util.Vector;

public class Reprezentatie {

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
  public void addBilet(Bilet bilet){
    this.bilete.equals(bilet);
  }
  public int searchByBilet(Bilet bilet){
    for(Bilet b:getBilete()){
      if(b.equals(bilet))
        return 1;
    }
    return 0;
  }
  public Reprezentatie(String data, Integer ora, Sala sala, Vector<Bilet> bilete, Integer nrLocuri) {
    this.data = data;
    this.ora = ora;
    this.sala = sala;
    this.bilete = bilete;
    this.nrLocuri = nrLocuri;
  }
  private Integer nrLocuri;

}