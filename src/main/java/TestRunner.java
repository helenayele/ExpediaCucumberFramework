import core.TestConfig;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(publish = true,
        features={"src/test/java/features"},
        glue={"steps"},
        plugin={"pretty","html:target/cucumber-reports"}
)
public class TestRunner {

    @BeforeClass
    public static void test() throws Exception {
        String env = System.getenv("env").toLowerCase();
        TestConfig.load(env);
        TestConfig.addProperty("browser",System.getenv("browser"));
        TestConfig.addProperty("env",env);
    }

}
