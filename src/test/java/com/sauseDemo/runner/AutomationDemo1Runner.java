package com.sauseDemo.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = {"src/test/resources/Features"},
		glue = {"com/sauseDemo/steps"},
		plugin= {"pretty", "html:target/cucumberreport"},
		monochrome = true
		)

public class AutomationDemo1Runner {

}
