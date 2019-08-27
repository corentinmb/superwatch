package fr.ippon.superwatch;

import lombok.Data;

@Data
public class Notification {
    private String message;
    private String to;
}
