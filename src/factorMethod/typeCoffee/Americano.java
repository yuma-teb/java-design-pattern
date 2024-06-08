package src.factorMethod.typeCoffee;

import src.factorMethod.Coffee;

public class Americano implements Coffee {
  @Override
  public void grindCoffee() {
    System.out.println("Americano is grinding!");
  }

  @Override
  public void mixCoffee() {
    System.out.println("Americano is mixing!");
  }

  @Override
  public void pourCoffee() {
    System.out.println("Americano is pouring");
  }

}
