package com.TestRunner.Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.TestUtil.Demo.testBase;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Features"} , 
plugin = {"json:target/cucumber.json"},
glue = "SepDep",tags= {"@Senity"})



public class TestRunner extends AbstractTestNGCucumberTests {

@BeforeTest
public void setUP() {
	
	testBase test= new testBase();
	test.initil();

	
	
}

@AfterTest
public void tearDown() {
	testBase test= new testBase();
	test.driver.quit();
	
}
	
	
	
	
}
