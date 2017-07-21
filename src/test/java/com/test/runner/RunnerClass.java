package com.test.runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", 
glue = "com.test.stepdef", 
tags = { "@First" })
public class RunnerClass {

}
