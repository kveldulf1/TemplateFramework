package pl.restassured.demo.framework.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@dependencyInjection",
        glue = "pl.restassured.demo.framework.steps"
)
public class TestRunner {

}