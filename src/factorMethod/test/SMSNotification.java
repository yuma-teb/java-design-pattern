package src.factorMethod.test;

public class SMSNotification implements Notification {

  @Override
  public void sendNotification(String message) {
    System.out.println("SMS" + message);
  }

}
