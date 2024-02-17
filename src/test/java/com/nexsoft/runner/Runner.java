package com.nexsoft.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 	
features = "resources/resources/Contact.feature",
glue = "com.nexsoft.cucumber.definitions")
public class Runner extends AbstractTestNGCucumberTests {

}
