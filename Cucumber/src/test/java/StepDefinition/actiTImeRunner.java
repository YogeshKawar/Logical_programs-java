package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Feature//actiTIme1.feature",glue= {"StepDefinition"},
plugin = {"pretty","html:target//CucumberReports//report.html"})
public class actiTImeRunner {
}
