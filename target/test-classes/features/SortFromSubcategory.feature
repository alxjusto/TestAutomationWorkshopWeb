Feature: Name of the feature or story you want to describe
  Describe required information

  @wip
  Scenario Outline: 1 - sort products with option "Precio + Envío: más bajo primero"
    Given th user is a regular customer client
    And the user chose <categoryOptionHomepage> category and <subcategoryOptionHomepage> subcategory
    And the user chose <carrouselOption> option from carrousel equipo y suministro de pesca
    And the user chose <carrouselOptionCategory> option from carrousel equipo de pesca vintage
    When the user chooses sort type <sortType>
    Then should see that price of first element is lower than <price> soles
    Examples:
      | categoryOptionHomepage | subcategoryOptionHomepage | carrouselOption | carrouselOptionCategory | sortType                           | price |
      | "Deportes"             | "Pesca"                   | "Vintage"       | "Carretes"              | "Precio + Envío: más bajo primero" | "10"  |
      #| "https://www.ebay.com/" | "Moda"                           | "Calzado"                        | "Vintage" | "Carretes" | "Precio + Envío: más bajo primero" | "10"   |



