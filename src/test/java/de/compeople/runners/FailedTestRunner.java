package de.compeople.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "de/compeople/step_definitions",
        features = "@target/rerun.txt"

)


public class FailedTestRunner {


}
