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
    Then Válido la cantidad de productos en el carrito de compras
    Then Válido el subtotal de los productos

    Examples:
      | categoria  | subcategoria | equipo   |
      | Celulares  | Telefonía    | Vivo     |
