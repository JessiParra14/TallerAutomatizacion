#language: es

Característica: Seleccionar productos

  Antecedentes:
    Dado que el usuario se encuentra en la pagina web
    Cuando el ingrese sus credenciales para inicar sesion

  Escenario: Comprar productos de la categoria
    Cuando el usuario seleccione la categoria y subcategoria
    Y el seleccione el producto a comprar y agregarlo al carro de compras
    Y el busque otro producto a agregar al carro de compras
    Entonces el visualizara el mensaje de carrito de compras