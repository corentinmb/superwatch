package fr.ippon.superwatch.cucumber;

import fr.ippon.superwatch.SuperwatchApplication;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


/**
 * Class to use spring application context while running cucumber
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = SuperwatchApplication.class, loader = SpringBootContextLoader.class)
public abstract class SpringBootBaseIntegrationTest {
}
