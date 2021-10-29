import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(publish = true,
        features={"src/test/java/features/ExpediaBooking.feature"},
        glue={"steps"},
        plugin={"pretty","html:target/cucumber-reports"}
)
public class TestRunner {
}
