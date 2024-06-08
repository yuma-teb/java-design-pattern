package src.factorMethod.factory.typeFactoryCoffee;

import src.factorMethod.Coffee;
import src.factorMethod.factory.CoffeeFactory;
import src.factorMethod.typeCoffee.Capuccino;

public class CapuccinoFactory implements CoffeeFactory {

  @Override
  public Coffee createCoffee() {
    return new Capuccino();
  }

}
