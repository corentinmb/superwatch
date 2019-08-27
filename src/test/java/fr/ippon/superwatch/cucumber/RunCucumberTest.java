package fr.ippon.superwatch.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import fr.ippon.superwatch.SuperwatchApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", plugin = {"pretty", "json:target/cucumber-report.json"})
public class RunCucumberTest {
}
