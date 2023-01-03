package com.dekosas.Steps;

import com.dekosas.PageObjects.SubcategoriaPageObject;
import com.dekosas.Utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;

public class SubcategoriaStep {

    SubcategoriaPageObject subcategoriaPageObject = new SubcategoriaPageObject();
    EsperaImplicita esperaImplicita = new EsperaImplicita();

    @Step
    public void clickProducto(){
        esperaImplicita.esperaImplicita(3000);
        subcategoriaPageObject.getDriver().findElement(subcategoriaPageObject.getBtnProducto()).click();
    }

    @Step
    public void clickAgregarAlCarrito(){
        esperaImplicita.esperaImplicita(6000);
        subcategoriaPageObject.getDriver().findElement(subcategoriaPageObject.getBtnAgregarAlCarrito()).click();
    }

}
