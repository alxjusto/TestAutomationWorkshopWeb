package com.web.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import web.driver.BaseDriver;
import web.pageObjects.OrdenarDesdeSubcategoriaCarretesVintageDePescaPage;

public class OrdenarDesdeSubcategoriaSteps extends BaseDriver {

    OrdenarDesdeSubcategoriaCarretesVintageDePescaPage ordenarDesdeSubcategoriaCarretesVintageDePescaPage = new OrdenarDesdeSubcategoriaCarretesVintageDePescaPage(driver);

    @Given("ingrese a la web {string}")
    public void ingrese_a_la_web(String url) {
        ordenarDesdeSubcategoriaCarretesVintageDePescaPage.openURL(url);
    }

    @Given("elegi la categoria {string} y subcategoria {string}")
    public void elegi_la_categoria_y_subcategoria(String opcionDeCategoriaPaginaPrincipal, String opcionDeSubCategoriaMasPopulares) {
        ordenarDesdeSubcategoriaCarretesVintageDePescaPage.elegirCategoriaYSubcategoria(opcionDeCategoriaPaginaPrincipal, opcionDeSubCategoriaMasPopulares);
    }

    @Given("elegi la opcion {string} desde el carrusel equipo y suministro de pesca")
    public void elegi_la_opcion_desde_el_carrusel_equipo_y_suministro_de_pesca(String opcion) {
        ordenarDesdeSubcategoriaCarretesVintageDePescaPage.elegirOpcionDesdeCarruselEquipoYSuministroDePesca(opcion);
    }

    @Given("elegi la opcion {string} desde el carrusel equipo de pesca vintage")
    public void elegi_la_opcion_desde_el_carrusel_equipo_de_pesca_vintage(String opcion) {
        ordenarDesdeSubcategoriaCarretesVintageDePescaPage.elegirOpcionDesdeCarruselEquipoDePescaVintage(opcion);
    }

    @When("selecciono el tipo de ordenamiento {string}")
    public void selecciono_el_tipo_de_ordenamiento(String tipoDeOrdenamiento) {
        ordenarDesdeSubcategoriaCarretesVintageDePescaPage.selleccionarTipoDeOrdenamiento(tipoDeOrdenamiento);
    }

    @Then("deberia visualizar que el precio del primer elemento es menor a {string} soles")
    public void deberia_visualizar_que_el_precio_del_primer_elemento_es_menor_a_soles(String string) {

    }
}
