package src.factorMethod.test.factory;

import src.factorMethod.test.Notification;

public interface NotificationFactory {
  enum Notification_TYPE {
    Email,
    SMS
  }

  Notification notificationFactory(Notification_TYPE type);
}
