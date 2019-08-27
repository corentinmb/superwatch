package fr.ippon.superwatch;

import org.springframework.stereotype.Component;

@Component
public class NotificationSender {
    public String send(String message, String to){
        String notificationMessage = "Sending message: " + message + " to " + to;
        System.out.println(notificationMessage);
        return notificationMessage;
    }
}
