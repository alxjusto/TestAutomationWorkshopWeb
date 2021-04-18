package com.web.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import web.driver.BaseDriver;
import web.pageObjects.BusquedaEbayPage;

public class BusquedaEbaySteps extends BaseDriver {

    BusquedaEbayPage busquedaEbayPage = new BusquedaEbayPage(driver);

    @Given("ingrese a la web {string}")
    public void ingrese_a_la_web(String string) {
        busquedaEbayPage.openURL();
    }

    @Given("otra precondicion")
    public void otra_precondicion() {

    }

    @When("ocurra algo")
    public void ocurra_algo() {

    }

    @Then("deberia esperar algo")
    public void deberia_esperar_algo() {

    }
}
