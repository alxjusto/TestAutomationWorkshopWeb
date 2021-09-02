package com.web.stepDefinitions;

import com.web.driver.BaseDriver;
import com.web.pageObject.EquipoPescaVintagePage;
import com.web.pageObject.EquipoSuministroPescaPage;
import com.web.pageObject.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SortFromSubcategorySteps extends BaseDriver {

    HomePage homePage = new HomePage(driver);
    EquipoSuministroPescaPage equipoSuministroPescaPage = new EquipoSuministroPescaPage(driver);
    EquipoPescaVintagePage equipoPescaVintagePage = new EquipoPescaVintagePage(driver);

    @Given("th user is a regular customer client")
    public void thUserIsARegularCustomerClient() {
        //Put all necessary pre conditions for this customer and scenario
    }

    @Given("the user chose {string} category and {string} subcategory")
    public void theUserChoseCategoryAndSubcategory(String categoryOption, String subCategoryOption) {
        homePage.choseCategoryAndSubcategory(categoryOption, subCategoryOption);
    }

    @Given("the user chose {string} option from carrousel equipo y suministro de pesca")
    public void theUserChoseOptionFromEquipoSuministroPesca(String option) {
        equipoSuministroPescaPage.choseCarrouselOptionFromEquipoSuministro(option);
    }

    @Given("the user chose {string} option from carrousel equipo de pesca vintage")
    public void theUserChoseOptionFromEquipoPescaVintage(String option) {
        equipoPescaVintagePage.choseOptionFromEquipoPescaVintage(option);
    }

    @When("the user chooses sort type {string}")
    public void theUserChoosesSortType(String sortType) {

    }

    @Then("should see that price of first element is lower than {string} soles")
    public void shouldSeeThatPriceOfFirstElementIsLowerThan(String price) {

    }

}
