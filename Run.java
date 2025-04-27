package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class) 
@CucumberOptions
(
		features= "src/test/resources/Feature1/LoginFeature1.feature",//path of login.feature file
		glue= "StepDefinition", //stepdefinition file name
		dryRun= false,
		monochrome= true,
		plugin= {"pretty"}
		)
		
public class Run
{
/* this should be empty
 */
}
