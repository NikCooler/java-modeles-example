package com.locator;

import com.service.NotificationService;
import java.util.ServiceLoader;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Nikolay Smirnov
 */
public class ServiceLocator {

    public List<NotificationService> loadNotificationServices() {
        var sl = ServiceLoader.load(NotificationService.class);
        return sl.stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
    }

}