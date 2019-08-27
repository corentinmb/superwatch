package fr.ippon.superwatch;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SuperwatchBadApplication {

    public static void main(String[] args) {
        new NotificationSender().send("Need help at National Bank !", "Hulk");
    }

}
