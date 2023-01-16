package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * Unit test for simple App.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/Motor_error_latch.feature", glue = {"StepDefinition"},
monochrome = false,
plugin = { "pretty","json:target/cucumber.json","html:target/cucumber.html"},
       // tags = "@run1 or @run2 or @run3 or @run4 or @run5 or @run6 or @run7 or @run8 or @run9 or @run10 or @run11 or @run12 or @run13"
       //tags = "@run1 or @run3 or @run9 or @run10 or @run13"
          tags = "@run1 or @run2 or @run3 or @run4 or @run5"
     //tags = "@run1 or @run2"
            )                     
            
public class Test_runner{
}
