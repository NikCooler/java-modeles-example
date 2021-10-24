package com.service.push;

import com.service.dto.Message;
import com.service.NotificationService;

/**
 * @author Nikolay Smirnov
 */
public class PushNotificationService implements NotificationService {

    private static final String MSG_PATTERNT = "Push message [ %s ] has been sent to user by ID [ %d ]";

    public void send(Message msg) {
        System.out.println(String.format(MSG_PATTERNT, msg.getMsg(), msg.getUserId()));
    }

}