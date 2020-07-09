package com.telecomm.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\PRAKASH\\workspace\\Cucumber1\\src\\test\\resources\\Features",

		glue="com.telecomm.stepdefinition",
dryRun=false,
plugin="html:target//Cucumber-html-reports",
monochrome=true,
tags={"@sanityCustomer"})
public class TestRunner {

}
