import src.factorMethod.CoffeeShop;
import src.factorMethod.factory.CoffeeFactory;
import src.factorMethod.factory.typeFactoryCoffee.AmericanoFactory;
import src.factorMethod.factory.typeFactoryCoffee.CapuccinoFactory;
import src.factorMethod.test.EmailNotification;
import src.factorMethod.test.Notification;
import src.factorMethod.test.NotificationService;
import src.factorMethod.test.SMSNotification;
import src.factorMethod.test.NotificationService.NotificationType;
import src.factorMethod.test.factory.ConcreteNotification;
import src.factorMethod.test.factory.NotificationFactory;
import src.factorMethod.typeCoffee.Americano;
import src.factorMethod.typeCoffee.Capuccino;
import src.singleton.ChocolateFactory;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Create object of americano and capuccino
    NotificationFactory notificationFactory = new ConcreteNotification();
    NotificationService notificationService = new NotificationService(notificationFactory);

    // create scanner object
    Scanner scanner = new Scanner(System.in);

    int choice;
    System.out.println("======= Send Message By ======= ");
    System.out.println("1/ Email ");
    System.out.println("2/ SMS");
    System.out.println("0/ Exit the program");

    while (true) {
      System.out.print("Please choose from 1-4: ");
      choice = scanner.nextInt();
      scanner.nextLine();

      System.out.print("Enter your message: ");
      String message = scanner.nextLine();

      switch (choice) {
        case 1:
          notificationService.sendMessage(NotificationType.Email, message);
          break;
        case 2:
          notificationService.sendMessage(NotificationType.SMS, message);
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