import src.factorMethod.CoffeeShop;
import src.factorMethod.factory.CoffeeFactory;
import src.factorMethod.factory.typeFactoryCoffee.AmericanoFactory;
import src.factorMethod.factory.typeFactoryCoffee.CapuccinoFactory;
import src.factorMethod.typeCoffee.Americano;
import src.factorMethod.typeCoffee.Capuccino;
import src.singleton.ChocolateFactory;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Create object of americano and capuccino
    CoffeeFactory americanoFactory = new AmericanoFactory();
    CoffeeFactory capuccinoFactory = new CapuccinoFactory();

    // create scanner object
    Scanner scanner = new Scanner(System.in);

    int choice;
    System.out.println("======= What would you like to order======= ");
    System.out.println("1/ Americano");
    System.out.println("2/ Capuccino");
    System.out.println("0/ Exit the program");

    while (true) {
      System.out.print("Please choose from 1-4: ");
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          CoffeeShop americanoShop = new CoffeeShop(americanoFactory);
          americanoShop.orderCoffee();
          break;
        case 2:
          CoffeeShop capuccinoShop = new CoffeeShop(capuccinoFactory);
          capuccinoShop.orderCoffee();
          break;
        case 0:
          System.exit(1);
        default:
          System.out.println("Incorrect options!!! Please choose from 1 - 4");
          break;
      }
    }
  }
}