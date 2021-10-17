package Com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/Search.feature",
		glue="StepDefinitions",stepNotifications=true,
		tags="@SeleniumTest",
		plugin= {"pretty","html:target/cucumber.html","junit:target/cukes.xml"}
		)
/*
 * @CucumberOptions( features="src/test/java/features",
 * glue="StepDefinitions",stepNotifications=true, tags="@SmokeTest or @RegTest" )// for multiple tags
 */
/*
 * @CucumberOptions( features="src/test/java/features",
 * glue="StepDefinitions",stepNotifications=true, tags="Not @SanityTest" )// by using negation
 */
/*
 * @CucumberOptions( features="src/test/java/features",
 * glue="StepDefinitions",stepNotifications=true, tags="@SmokeTest and @RegTest" // by using " And" for running both reg and smoke test
 * )
 */
public class TestRunner {

}
