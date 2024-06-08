package src.factorMethod;

import src.factorMethod.factory.CoffeeFactory;

public class CoffeeShop {
  private CoffeeFactory coffeeFactory;

  public CoffeeShop(CoffeeFactory coffeeFactory) {
    this.coffeeFactory = coffeeFactory;
  }

  public Coffee orderCoffee() {

    Coffee coffee = coffeeFactory.createCoffee();
    coffee.grindCoffee();
    coffee.mixCoffee();
    coffee.pourCoffee();

    return coffee;
  }
}
