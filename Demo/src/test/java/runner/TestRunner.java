package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features/flujo.feature",
        glue = ("seleniumGlueCode")
)
public class TestRunner  {

}
