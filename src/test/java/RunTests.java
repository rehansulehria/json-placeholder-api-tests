import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

public class RunTests {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources",
            tags = {"~@users", "~@ignored"},
            plugin = {
                    "json:target/cucumber-reports/cucumber.json"
            }

    )
    public class RunCukeTest {
    }
}
