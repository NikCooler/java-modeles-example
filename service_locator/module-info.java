module locator {
    requires notification.service.api;
    exports com.locator;
    uses com.service.NotificationService;
}