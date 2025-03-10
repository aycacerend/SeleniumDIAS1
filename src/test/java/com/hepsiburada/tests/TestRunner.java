package com.hepsiburada.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Feature dosyasının bulunduğu klasör
        glue = {"com.hepsiburada.steps"} // StepDefinitions sınıfının bulunduğu paket
)
public class TestRunner {
}
