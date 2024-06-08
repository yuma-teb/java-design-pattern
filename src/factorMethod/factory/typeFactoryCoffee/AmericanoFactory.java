package src.factorMethod.factory.typeFactoryCoffee;

import src.factorMethod.Coffee;
import src.factorMethod.factory.CoffeeFactory;
import src.factorMethod.typeCoffee.Americano;

public class AmericanoFactory implements CoffeeFactory {

  @Override
  public Coffee createCoffee() {
    return new Americano();
  }
}
