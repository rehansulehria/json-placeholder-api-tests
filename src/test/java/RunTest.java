import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags = {"@posts"},
        plugin = {
                "json:target/cucumber-reports/cucumber.json"
        }

)
public class RunTest {
}
