import src.singleton.ChocolateFactory;
import src.singleton.SingletonPractice.Server;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // create scanner object
    Scanner scanner = new Scanner(System.in);

    int choice;
    System.out.println("======= Welcome to our chocolate Factory ======= ");
    System.out.println("1/ Insert the server into server list");
    System.out.println("2/ Get http server list");
    System.out.println("3/ Get https server list");
    System.out.println("0/ Exit the program");

    while (true) {
      System.out.print("Please choose from 1-3: ");
      choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          System.out.print("Enter server: ");
          String serverName = scanner.nextLine();

          if (!serverName.isEmpty()) {
            Server.getServerInstance().addServers(serverName);
          }
          // Insert the server to server list
          break;
        case 2:
          Server.getServerInstance().getHttpServer();
          break;
        case 3:
          Server.getServerInstance().getHttpsSever();
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