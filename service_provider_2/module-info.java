module email.notification.service {
    requires notification.service.api;
    provides com.service.NotificationService with com.service.email.EmailNotificationService;
}