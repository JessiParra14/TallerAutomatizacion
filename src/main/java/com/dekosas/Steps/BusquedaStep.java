package com.dekosas.Steps;

import com.dekosas.PageObjects.BusquedaPageObject;
import com.dekosas.Utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;

public class BusquedaStep {

    BusquedaPageObject busquedaPageObject = new BusquedaPageObject();
    EsperaImplicita esperaImplicita = new EsperaImplicita();

    @Step
    public void seleccionarProducto(){
        busquedaPageObject.getDriver().findElement(busquedaPageObject.getBtnProductoLampara()).click();
    }

    @Step
    public void clickAgregarAlCarrito(){
        esperaImplicita.esperaImplicita(6000);
        busquedaPageObject.getDriver().findElement(busquedaPageObject.getBtnAgregarAlCarrito()).click();
    }
}
