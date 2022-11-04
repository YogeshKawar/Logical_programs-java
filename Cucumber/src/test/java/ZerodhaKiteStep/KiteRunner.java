package ZerodhaKiteStep;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\ZerodhaKite.feature",
glue = {"ZerodhaKiteStep"},
plugin = {"pretty","html:target\\CucumberReports\\KiteReport.html"})
public class KiteRunner {

}
