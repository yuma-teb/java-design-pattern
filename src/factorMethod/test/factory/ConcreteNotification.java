package src.factorMethod.test.factory;

import src.factorMethod.test.EmailNotification;
import src.factorMethod.test.Notification;
import src.factorMethod.test.SMSNotification;

public class ConcreteNotification implements NotificationFactory {

  @Override
  public Notification notificationFactory(Notification_TYPE type) {

    if (type == Notification_TYPE.Email) {
      return new EmailNotification();
    } else {
      return new SMSNotification();
    }

  }

}
