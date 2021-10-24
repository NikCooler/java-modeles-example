module push.notification.service {
    requires notification.service.api;
    provides com.service.NotificationService with com.service.push.PushNotificationService;
}