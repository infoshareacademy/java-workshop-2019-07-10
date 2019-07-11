package com.infoshareacademy.marbles.game;

public class CakeEggs {

  int eggsCount = 3;
  int eggsInBowl = 0;

  public static void main(String[] args) {

    CakeEggs cakeEggs = new CakeEggs();
    System.out.println("Eggs in bowl before add: "
        + cakeEggs.eggsInBowl);

    while (cakeEggs.eggsInBowl < cakeEggs.eggsCount) {
      cakeEggs.eggsInBowl++;
//      cakeEggs.eggsInBowl = cakeEggs.eggsInBowl + 1;
    }

    System.out.println("Eggs in bowl after add: "
        + cakeEggs.eggsInBowl);
  }
}
