package com.runnerClass;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features",
                  glue={"com.stepDefinitions"},
                  plugin = {"pretty", "html:target/cucumber"})

public class TestNGRunnerTest extends AbstractTestNGCucumberTests {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("\nIN BEFORE CLASS\n");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("\nIN AFTER CLASS \n");
	}
	
}
