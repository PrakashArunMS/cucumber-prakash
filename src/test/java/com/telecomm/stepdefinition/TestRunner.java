package com.telecomm.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\PRAKASH\\workspace\\Cucumber1\\src\\test\\resources\\Features\\AddTariffPlan1.feature",

		glue="com.telecomm.stepdefinition",
dryRun=false,
plugin={"html:target//Cucumber-html-reports","json:target/reports.json"},
monochrome=true)
public class TestRunner {

}
