package com.dekosas.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PasarMouse {

    public void pasarMouse(WebDriver driver, By elemento){
        WebElement element = driver.findElement(elemento);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

    }

}
