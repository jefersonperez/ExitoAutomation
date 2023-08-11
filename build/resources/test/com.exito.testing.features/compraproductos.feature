# language: es

  Característica: Consulta carrito

    Escenario: Consulta carrito de compras exitoso

      Dado que estoy en la página exito
      Cuando selecciono categoria
      Y selecciono subcategoria
      Y selecciono cinco productos
      Entonces debo validar las cantidades exactas de los productos
