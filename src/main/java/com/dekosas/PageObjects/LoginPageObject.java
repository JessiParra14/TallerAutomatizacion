package com.dekosas.PageObjects;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPageObject extends PageObject {

    By txtCorreo = By.id("social_login_email");
    By txtClave = By.id("social_login_pass");
    By btnEntrar = By.id("bnt-social-login-authentication");
    By msjBienvenido = By.xpath("//h3[text()='Bienvenido']");
    By btnCategorias = By.xpath("//div[@class='menu-title closed']");
    By btnMuebles = By.xpath("//a[@title='Muebles']");
    By btnRepisas = By.xpath("//span[contains(text(),'Repisas')]");

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnEntrar() {
        return btnEntrar;
    }

    public By getMsjBienvenido() {
        return msjBienvenido;
    }

    public By getBtnCategorias() {
        return btnCategorias;
    }

    public By getBtnMuebles() {
        return btnMuebles;
    }

    public By getBtnRepisas() {
        return btnRepisas;
    }
}
