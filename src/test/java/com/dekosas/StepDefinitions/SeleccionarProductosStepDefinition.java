package com.dekosas.StepDefinitions;

import com.dekosas.Steps.BusquedaStep;
import com.dekosas.Steps.CarritoStep;
import com.dekosas.Steps.LoginStep;
import com.dekosas.Steps.SubcategoriaStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class SeleccionarProductosStepDefinition {

    @Steps
    LoginStep loginStep;
    @Steps
    SubcategoriaStep subcategoriaStep;
    @Steps
    CarritoStep carritoStep;
    @Steps
    BusquedaStep busquedaStep;

    @Cuando("^el usuario seleccione la categoria y subcategoria$")
    public void elUsuarioSeleccioneLaCategoriaYSubcategoria() {
        loginStep.clickCategorias();
        loginStep.marcarMuebles();
        loginStep.clickRepisas();
    }

    @Cuando("^el seleccione el producto a comprar y agregarlo al carro de compras$")
    public void elSeleccioneElProductoAComprarYAgregarloAlCarroDeCompras() {
        subcategoriaStep.clickProducto();
        subcategoriaStep.clickAgregarAlCarrito();
    }

    @Cuando("^el busque otro producto a agregar al carro de compras$")
    public void elBusqueOtroProductoAAgregarAlCarroDeCompras() throws IOException {
        carritoStep.buscarProducto();
        carritoStep.clickBuscar();
        busquedaStep.seleccionarProducto();
        busquedaStep.clickAgregarAlCarrito();
    }

    @Entonces("^el visualizara el mensaje de carrito de compras$")
    public void elVisualizaraElMensajeDeCarritoDeCompras() {
        carritoStep.validarMensaje();
    }

}
