package runner;





import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"/Users/mitkalp/IntellijWorkshop/src/test/resources/InvalidLogin.feature"},
        glue= {"stepsDefination"},
        dryRun = true,
        plugin= {"pretty"}
)

public class RunnerTest {
}
