package CucumberHcMedSpa.com;
import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by DIPAK on 4/24/2017.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(features=".",format="html:target/CucumberReports",tags="@TestPrince")
public class RunTest {
}
