package main;

import java.util.Vector;

public class DatabaseController {

  private DatabaseController instance;
  static int countObjects = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DatabaseController that = (DatabaseController) o;

        return instance.equals(that.instance);
    }

    @Override
    public int hashCode() {
        return instance.hashCode();
    }

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