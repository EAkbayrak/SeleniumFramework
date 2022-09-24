package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.Locale;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features we use to provide the path of all the features file
        features = "src/test/resources/features/",

        glue = "steps",

        // set dryRun to true to quickly execute the code, and it will tell you if there's
        // any steps that need to be implemented
        dryRun = false,

        // keeping monochrome to tru will clean you console output for cucumber
        // test if it has irrelevant or unreadable character in it
        monochrome = true,

        tags = "@smoke",


        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json","rerun:target/failed.txt"}

)
public class RunnerClass {

}
