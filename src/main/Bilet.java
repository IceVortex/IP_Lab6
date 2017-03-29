package main;

import java.io.*;
import java.util.Vector;

public class Bilet implements Serializable {

  private Integer pret;
  private Reprezentatie myReprezentatie;
  private Loc myLoc;

  public Bilet(){}
  public Bilet(Integer pret, Reprezentatie reprezentatie, Loc loc) {
    this.myLoc = loc;
    this.myReprezentatie = reprezentatie;
    this.pret = pret;
  }

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

  @Override
  public int hashCode() {
    int result = pret.hashCode();
    result = 31 * result + myReprezentatie.hashCode();
    result = 31 * result + myLoc.hashCode();
    return result;
  }

  public void save(String path) {

    try {
      FileOutputStream fileOut = new FileOutputStream(path);
      ObjectOutputStream outObject = new ObjectOutputStream(fileOut);

      outObject.writeObject(this);
      outObject.close();
      fileOut.close();

      System.out.printf("Serialized data is saved in "+ path+'\n');
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void load(String path){

    Bilet bilet = null;
    try{
      FileInputStream inputFileStream = new FileInputStream(path);
      ObjectInputStream objectInputStream = new ObjectInputStream(inputFileStream);
      bilet = (Bilet) objectInputStream.readObject();
      this.myLoc = bilet.myLoc;
      this.myReprezentatie = bilet.myReprezentatie;
      this.pret = bilet.pret;

      objectInputStream.close();
      inputFileStream.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public Loc getMyLoc() {
    return myLoc;
  }

  @Override
  public String toString() {
    return "Bilet{" +
            "pret=" + pret +
            ", myReprezentatie=" + myReprezentatie +
            ", myLoc=" + myLoc +
            '}';
  }
}