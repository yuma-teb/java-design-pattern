package src.factorMethod.typeCoffee;

import src.factorMethod.Coffee;

public class Capuccino implements Coffee {

  @Override
  public void grindCoffee() {
    System.out.println("Capuccino is griding!");
  }

  @Override
  public void mixCoffee() {
    System.out.println("Capuccino is mixing!");
  }

  @Override
  public void pourCoffee() {
    System.out.println("Capuccino is pouring!!!");
  }
}
