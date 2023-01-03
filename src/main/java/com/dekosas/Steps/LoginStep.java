package com.dekosas.Steps;

import com.dekosas.PageObjects.LoginPageObject;
import com.dekosas.Utils.DatosExcel;
import com.dekosas.Utils.EsperaImplicita;
import com.dekosas.Utils.PasarMouse;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;

public class LoginStep {

    LoginPageObject loginPageObject = new LoginPageObject();
    DatosExcel datosExcel = new DatosExcel();
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    PasarMouse pasarMouse = new PasarMouse();

    @Step
    public void ingresarCorreo() throws IOException {
        loginPageObject.getDriver().findElement(loginPageObject.getTxtCorreo())
                .sendKeys(datosExcel.leerDatosExcel("DatosReto.xlsx", "Login", 1, 0));
    }

    @Step
    public void ingresarClave() throws IOException {
        loginPageObject.getDriver().findElement(loginPageObject.getTxtClave())
                .sendKeys(datosExcel.leerDatosExcel("DatosReto.xlsx", "Login", 1, 1));
    }

    @Step
    public void clickEntrar(){
        loginPageObject.getDriver().findElement(loginPageObject.getBtnEntrar()).click();
    }

    @Step
    public void validarMensaje(){
        Assert.assertThat(loginPageObject.getDriver().findElement(loginPageObject.getMsjBienvenido())
                .isDisplayed(), Matchers.is(true));
    }

    @Step
    public void clickCategorias(){
        esperaImplicita.esperaImplicita(3000);
        loginPageObject.getDriver().findElement(loginPageObject.getBtnCategorias()).click();
    }

    @Step
    public void marcarMuebles(){
        pasarMouse.pasarMouse(loginPageObject.getDriver(), loginPageObject.getBtnMuebles());
    }

    @Step
    public void clickRepisas(){
        loginPageObject.getDriver().findElement(loginPageObject.getBtnRepisas()).click();
    }
}
