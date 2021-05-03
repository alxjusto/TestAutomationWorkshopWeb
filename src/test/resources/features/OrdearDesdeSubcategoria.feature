Feature: Ordamiento desde subcategoria
  5Criterios Aceptacion
  Data table

  @wip
  Scenario Outline: 1 - ordenar los productos con opcion "Precio + Envío: más bajo primero"
    Given ingrese a la web <url>
    And elegi la categoria <opcionDeCategoriaPaginaPrincipal> y subcategoria <opcionDeSubCategoriaMasPopulares>
    And elegi la opcion <opcion> desde el carrusel equipo y suministro de pesca
    And elegi la opcion <opcion1> desde el carrusel equipo de pesca vintage
    When selecciono el tipo de ordenamiento <tipoDeOrdenamiento>
    Then deberia visualizar que el precio del primer elemento es menor a <string> soles
    Examples:
      | url                     | opcionDeCategoriaPaginaPrincipal | opcionDeSubCategoriaMasPopulares | opcion    | opcion1    | tipoDeOrdenamiento                 | string |
      | "https://www.ebay.com/" | "Deportes"                       | "Pesca"                          | "Vintage" | "Carretes" | "Precio + Envío: más bajo primero" | "10"   |
      #| "https://www.ebay.com/" | "Moda"                           | "Calzado"                        | "Vintage" | "Carretes" | "Precio + Envío: más bajo primero" | "10"   |



