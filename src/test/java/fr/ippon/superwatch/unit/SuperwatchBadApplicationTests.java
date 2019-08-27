package fr.ippon.superwatch.unit;

import fr.ippon.superwatch.NotificationSender;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class SuperwatchBadApplicationTests {

    public static final String MESSAGE = "Need Help";
    public static final String HULK = "Hulk";
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void shouldSendNotificationToHulk(){
        NotificationSender notificationSender = new NotificationSender();
        notificationSender.send(MESSAGE, HULK);

        assertThat(outContent.toString()).contains("Sending message: " + MESSAGE + " to " + HULK);
    }
}
