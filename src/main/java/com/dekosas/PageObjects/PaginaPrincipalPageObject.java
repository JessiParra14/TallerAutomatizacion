package com.dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://dekosas.com/co/")
public class PaginaPrincipalPageObject extends PageObject {

    By btnMiCuenta = By.xpath("//p[text()='Mi Cuenta']");

    public By getBtnMiCuenta() {
        return btnMiCuenta;
    }
}
