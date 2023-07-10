package LoginDemo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Collabera\\cucumbertest\\testing\\src\\test\\java\\LoginDemo\\login.feature",
		glue={"LoginDemo"},
		tags = "@tag1",
		dryRun=false,		
		plugin= {"pretty"},
		monochrome = true
		//tags = {'@Regression'}
		
		)



public class logintestrunner {

}
