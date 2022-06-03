package com.hcl;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:pickle.feature", plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json"}, monochrome = true)
public class TestRunner {

}