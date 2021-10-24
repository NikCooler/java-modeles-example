package com.service;

import com.service.dto.Message;

/**
 * @author Nikolay Smirnov
 */
public interface NotificationService {

    public void send(Message msg);

}