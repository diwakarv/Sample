package runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
features = "src/test/java/feature/test.feature"
,glue= {"seleniumgluecode"},

//plugin = {"pretty", "html:target/htmlreports"},
plugin = { "pretty",
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report6.html",
		"html:target/htmlreport/4.html","json:target/cucumber-reportst/2.json"}
//plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },

        )



public class TestRunner {

}