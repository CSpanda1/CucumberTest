package com.hcl;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="Insurance.feature",glue={"com.hcl","RatesTest.java"},plugin={"json:target/cucumber.json"})
public class TestRunner {

}