package src.factorMethod.test;

import src.factorMethod.test.factory.NotificationFactory;
import src.factorMethod.test.factory.NotificationFactory.Notification_TYPE;

public class NotificationService {
  private NotificationFactory factory;

  public enum NotificationType {
    Email,
    SMS
  }

  public NotificationService(NotificationFactory factory) {
    this.factory = factory;
  }

  public void sendMessage(NotificationType type, String message) {
    // Convert NotificationType to Notification_TYPE
    Notification_TYPE factoryType = Notification_TYPE.valueOf(type.name());
    // Create notification
    Notification notification = factory.notificationFactory(factoryType);
    // Send notification
    notification.sendNotification(message);
  }

}
