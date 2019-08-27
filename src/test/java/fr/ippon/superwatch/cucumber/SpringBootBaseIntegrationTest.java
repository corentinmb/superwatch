package fr.ippon.superwatch.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import fr.ippon.superwatch.SuperwatchApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


/**
 * Class to use spring application context while running cucumber
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = SuperwatchApplication.class, loader = SpringBootContextLoader.class)
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", plugin = {"pretty", "json:target/cucumber-report.json"})
public abstract class SpringBootBaseIntegrationTest {
}
