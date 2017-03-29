package main;

import java.io.*;
import java.util.Vector;

public class Bilet implements Serializable {

  private Integer pret;
  private Reprezentatie myReprezentatie;
  private Loc myLoc;

  Bilet(){}
  Bilet(Integer pret, Reprezentatie reprezentatie, Loc loc){
    this.myLoc = loc;
    this.myReprezentatie = reprezentatie;
    this.pret = pret;
  }

  public Integer getPret() {
    return pret;
  }

  void save(String path) {

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

  void load(String path){

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

}