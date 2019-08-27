package fr.ippon.superwatch;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.ippon.superwatch.cucumber.SpringBootBaseIntegrationTest;
import model.Manager;
import model.SuperHero;
import org.junit.After;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class NotificationStepDefs extends SpringBootBaseIntegrationTest {

    @Autowired
    private NotificationSender notificationSender;

    private String alert;
    private SuperHero hulk = new SuperHero().setName("Hulk");
    private String notificationMessage;

    @Given("an alert in front of the Statue Of Liberty")
    public void anAlertInFrontOfTheStatueOfLiberty() {
        alert = "There is a thief just in front of the Statue Of Liberty";
    }

    @When("Nick Fury wants to notify Hulk")
    public void nickFuryWantsToNotifyHulk() {
        notificationMessage = notificationSender.send(alert, hulk.getName());
    }

    @Then("Nick Fury sends a notification")
    public void nickFuryHasCreatedANotification() {
        assertThat(notificationMessage).contains("Sending message: " + alert + " to " + hulk.getName());
    }

}
