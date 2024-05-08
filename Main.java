import src.singleton.ChocolateFactory;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    //create scanner object
    Scanner scanner = new Scanner(System.in);

    int choice;
    System.out.println("======= Welcome to our chocolate Factory ======= ");
    System.out.println("1/ Fill the boiler");
    System.out.println("2/ Boil Chocolate");
    System.out.println("3/ Drain the boiler");
    System.out.println("4/ Restart the system");
    System.out.println("0/ Exit the program");

    while (true) {
      System.out.print("Please choose from 1-4: ");
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          ChocolateFactory.getChocolateInstance().fillBoiler();
          break;
        case 2:
          ChocolateFactory.getChocolateInstance().boilChocolate();
          break;
        case 3:
          ChocolateFactory.getChocolateInstance().drainBoiler();
          break;
        case 4:
          ChocolateFactory.getChocolateInstance().resetBoiler();
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