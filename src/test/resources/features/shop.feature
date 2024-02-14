Feature: Proceso de compra en Swag Labs
  Scenario: Ingresar a comprar con usuario y contraseña
    Given User estoy en la pagina
    When ingreso datos "standard_user" "secret_sauce"
    Then veo la pagina principal de productos
    When agrego dos productos al carrito
    And hago click en el icono del carrito
    And completo el formulario de compra con "Lenin", "Basantes" y "170101"
    And finalizo la compra
    Then deberia ver la confirmacion de la orden "Thank you for your order!"