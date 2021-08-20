package com.web.runner;


import com.web.driver.BaseDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/OrdearDesdeSubcategoria.feature"},
        glue = {"com.web.stepDefinitions"},
        tags = {"not @tag", "@wip"})
public class Runner {

    static BaseDriver baseDriver = new BaseDriver();

    @BeforeClass
    public static void driverInstanceCreation() {
        baseDriver.initDriver();
    }

    @AfterClass
    public static void deleteDriverInstance(){
        baseDriver.exitDriver();
    }
}
