package com.dekosas.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BusquedaPageObject extends PageObject {

    By btnProductoLampara = By.xpath("(//div[@class='product photo product-item-photo'])[1]");
    By btnAgregarAlCarrito = By.id("product-addtocart-button");
    public By getBtnProductoLampara() {
        return btnProductoLampara;
    }

    public By getBtnAgregarAlCarrito() {
        return btnAgregarAlCarrito;
    }
}
