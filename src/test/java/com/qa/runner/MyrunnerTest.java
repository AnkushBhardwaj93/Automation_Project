package com.qa.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"
                ,"html:target/cucumber/report.html "
                ,"summary"
                ,"de.monochromata.cucumber.report.PrettyReports:target/cucumber-html-reports"
        }
        ,features = {"src/test/resources"}
        ,glue = {"com.qa.stepdef"}
        ,snippets = CAMELCASE
        ,dryRun = false
        ,monochrome = true
        ,strict = true
)

public class MyrunnerTest {



}
