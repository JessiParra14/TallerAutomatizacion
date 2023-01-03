package com.dekosas.Steps;

import com.dekosas.PageObjects.PaginaPrincipalPageObject;
import net.thucydides.core.annotations.Step;

public class PaginaPrincipalStep {

    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();

    @Step
    public void abrirNavegador(){
        paginaPrincipalPageObject.open();
    }

    @Step
    public void clickBtnMiCuenta(){
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnMiCuenta()).click();
    }
}
