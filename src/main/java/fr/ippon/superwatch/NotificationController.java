package fr.ippon.superwatch;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {


    private NotificationSender notificationSender;

    public NotificationController(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    @PostMapping
    public ResponseEntity sendNotification(@RequestBody Notification notification){
        String message = notificationSender.send(notification.getMessage(), notification.getTo());
        return ResponseEntity.ok(message);
    }
}
