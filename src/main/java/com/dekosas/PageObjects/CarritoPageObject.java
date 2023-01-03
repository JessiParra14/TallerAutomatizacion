package com.dekosas.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoPageObject extends PageObject {

    By txtBuscar = By.id("search");
    By btnBuscar = By.xpath("//button[@title='Buscar']");
    By msjCarrito = By.xpath("//span[text()='Carrito de Compras']");

    public By getTxtBuscar() {
        return txtBuscar;
    }

    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getMsjCarrito() {
        return msjCarrito;
    }
}
