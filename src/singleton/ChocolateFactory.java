package src.singleton;

public class ChocolateFactory {

  private boolean empty;
  private boolean boiled;
  private static ChocolateFactory chocolateInstance;

  private ChocolateFactory() {
    empty = true;
    boiled = false;
  }

  public boolean isBoilerEmpty () {
    return empty;
  }

  public boolean isAlearyBoiled() {
    return boiled;
  }

  public static ChocolateFactory getChocolateInstance () {

    if(chocolateInstance == null) {
      chocolateInstance = new ChocolateFactory();
    }

    return chocolateInstance;
  }

  public void fillBoiler() {
    System.out.println(isBoilerEmpty());
    if(isBoilerEmpty()) {
      empty = false;
      System.out.println("Filling the boiler with chocolate");
    } else {
      System.out.println("We cannot fill the boiler, because it already full!");
    }

  }

  public void drainBoiler() {
    if(isAlearyBoiled() && !isBoilerEmpty()) {
      empty = true;
      System.out.println("Now we are draining the boiler!!!");
    } else {
      System.out.println("We cannot drain the boiler");
    }
  }

  public void boilChocolate() {
    if(!isBoilerEmpty() && !isAlearyBoiled()) {
      boiled = true;
      System.out.println("Chocolate is boiled");
    } else {
      System.out.println("We cannot boiled boiled the chocolate");
    }
  }

  public void resetBoiler () {
    empty = true;
    boiled = false;
    System.out.println("System has been restarted");
  }
}
