package com.dekosas.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SubcategoriaPageObject extends PageObject {

    By btnProducto = By.xpath("(//img[@class='product-image-photo default_image porto-lazyload porto-lazyload-loaded'])[1]");
    By btnAgregarAlCarrito = By.xpath("//span[contains(text(),'Agregar al Carrito')]");
    public By getBtnProducto() {
        return btnProducto;
    }

    public By getBtnAgregarAlCarrito() {
        return btnAgregarAlCarrito;
    }
}
