
Feature: Ordamiento desde subcategoria


  @wip
  Scenario: 1 - ordenar los productos con opcion "Precio + Envío: más bajo primero"
    Given ingrese a la web "https://www.ebay.com/"
    And elegi la categoria "Deportes" y subcategoria "Pesca"
    And elegi la opcion "Vintage" desde el carrusel equipo y suministro de pesca
    And elegi la opcion "Carretes" desde el carrusel equipo de pesca vintage
    When selecciono el tipo de ordenamiento "Precio + Envío: más bajo primero"
    Then deberia visualizar que el precio del primer elemento es menor a "10" soles



