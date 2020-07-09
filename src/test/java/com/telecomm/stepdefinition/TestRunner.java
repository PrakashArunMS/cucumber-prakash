package com.telecomm.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\PRAKASH\\workspace\\Cucumber1\\src\\test\\resources\\Features\\AddTariffPlan1.feature",

		glue="com.telecomm.stepdefinition",
dryRun=false,
plugin="html:target//Cucumber-html-reports",
monochrome=true)
public class TestRunner {

}
