package main;

import java.util.Vector;

public class DatabaseController {

  private DatabaseController instance;
  static int countObjects = 0;

  public static DatabaseController getInstance() {
      if (countObjects >= 1) {
          return null;
      } else {
          countObjects++;
          return new DatabaseController();
      }
  }
    //public instance object;


  public void DatabaseController() {
  }

  public void insertIntoDB() {
      // code for managing database ORM
  }

}