package com.dekosas.Steps;

import com.dekosas.PageObjects.CarritoPageObject;
import com.dekosas.Utils.DatosExcel;
import com.dekosas.Utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;

public class CarritoStep {

    CarritoPageObject carritoPageObject = new CarritoPageObject();
    DatosExcel datosExcel = new DatosExcel();
    EsperaImplicita esperaImplicita = new EsperaImplicita();

    @Step
    public void buscarProducto() throws IOException {
        carritoPageObject.getDriver().findElement(carritoPageObject.getTxtBuscar())
                .sendKeys(datosExcel.leerDatosExcel("DatosReto.xlsx", "Producto", 1, 0));
        esperaImplicita.esperaImplicita(3000);
    }

    @Step
    public void clickBuscar(){
        carritoPageObject.getDriver().findElement(carritoPageObject.getBtnBuscar()).click();
    }

    @Step
    public void validarMensaje(){
        Assert.assertThat(carritoPageObject.getDriver().findElement(carritoPageObject.getMsjCarrito())
                .isDisplayed(), Matchers.is(true));
    }
}
