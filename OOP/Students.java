package CSC1351_Fall2023.OOP;

import java.util.Scanner;

public class Students {
  private String name;
  private int ID;

  public void setName(String rat){
      name = rat;
  }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public Students(String name) {
        this.name = name;
    }
}

