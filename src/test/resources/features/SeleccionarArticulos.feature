Feature: Selección de artículos

  Como usuario de falabella
  Quero agregar ciertos productos
  para realizar una compra

  @AgregaProduto
  Scenario Outline: Agregar al carrito
    Given que me encuentro en la página de falabella
    When selecciono los 3 productos aleatorios
      | categoria   | subcategoria   | equipo   |
      | <categoria> | <subcategoria> | <equipo> |
    Then Válido los productos en el carrito de compras

    Examples:
      | categoria         | subcategoria | equipo |
      | Tecnología | Computadores | Ver todo |