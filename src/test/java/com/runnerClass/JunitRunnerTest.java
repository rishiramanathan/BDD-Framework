package com.runnerClass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
   (
		features = "src/test/resources/Features"
        ,glue={"com.stepDefinitions"}
	    ,plugin = {"pretty", "html:target/cucumber.html"}
		
	)
public class JunitRunnerTest {

 @BeforeClass
 public static void beforeClass() {
	 System.out.println("\n IN BEFORE CLASS \n");
 }
 
 @AfterClass
 public static void afterClass() {
	 System.out.println("\n IN AFTER CLASS \n");
 }
 
	
}
