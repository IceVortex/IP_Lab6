package main;

import java.util.List;
import java.io.Serializable;
import java.util.Vector;

import java.io.Serializable;

import java.util.Vector;
public class Reprezentatie implements Serializable {

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

  public void addBilet(Bilet bilet) throws Exception {

  	if(bilet==null){
      throw new Exception("Bilet is null");
    }

    if(this.bilete.size()<nrLocuri)
    {
      this.bilete.add(bilet);
    }
    else{
      throw new Exception("NU SE MAI POT INSERA BILETE !");
    }
  }

   public void removeBilet(int index) throws Exception {

    if (index < 0) {
      throw new Exception("INDEX NEGATIVE");
    } else {
      bilete.remove(bilete.get(index));
    }
  }


  public boolean searchByBilet(Bilet bilet){
    for(Bilet b:getBilete()){
      if(b.equals(bilet))
        return true;
    }
    return false;
  }

  public List<Bilet> getBileteDisponibile(){

    List<Bilet> bileteLibere = new ArrayList<>();

    for(Bilet aBilet : bilete){
      if(aBilet.getMyLoc().getOcupat()==false)
        bileteLibere.add(aBilet);
    }

    return bileteLibere;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Reprezentatie that = (Reprezentatie) o;

    if (!nrLocuri.equals(that.nrLocuri)) return false;
    if (!data.equals(that.data)) return false;
    if (!ora.equals(that.ora)) return false;
    if (!sala.equals(that.sala)) return false;
    return bilete.equals(that.bilete);
  }

  @Override
  public int hashCode() {
    int result = nrLocuri.hashCode();
    result = 31 * result + data.hashCode();
    result = 31 * result + ora.hashCode();
    result = 31 * result + sala.hashCode();
    result = 31 * result + bilete.hashCode();
    return result;
  }
  public String toString() {
    return "Reprezentatie{" +
            "nrLocuri=" + nrLocuri +
            ", data='" + data + '\'' +
            ", ora=" + ora +
            ", sala=" + sala +
            ", bilete=" + bilete +
            '}';
  }
}