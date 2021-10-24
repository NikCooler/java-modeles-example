package com.app;

import com.locator.ServiceLocator;
import com.service.NotificationService;
import com.service.dto.Message;
import java.util.stream.IntStream;
import java.util.concurrent.TimeUnit;
import java.util.List;

/**
 * @author Nikolay Smirnov
 */
public class NotificationApp {

    public static void main(String[] args) {
        var sl = new ServiceLocator();
        var msg = new Message(1, "Yo-yo-yo bitch!");

        IntStream.range(0, 30)
            .forEach(i -> {
                try {
                    Thread.sleep(TimeUnit.SECONDS.toMillis(2));
                } catch (Exception e) {
                    // NOPE
                }
                List<NotificationService> ns = sl.loadNotificationServices();
                ns.forEach(s -> s.send(msg));
            });
    }
}