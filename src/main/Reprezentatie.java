package main;

import java.util.List;
import java.util.Vector;

public class Reprezentatie {

  private final Integer nrLocuri;

  private String data;

  private Integer ora;

  private Sala sala;

  private List<Bilet> bilete;


  public List<Bilet> getBilete() {
    return bilete;
  }

  public Reprezentatie(String data, Integer ora, Sala sala, Vector<Bilet> bilete, Integer nrLocuri) {
    this.data = data;
    this.ora = ora;
    this.sala = sala;
    this.bilete = bilete;
    this.nrLocuri = nrLocuri;
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

}