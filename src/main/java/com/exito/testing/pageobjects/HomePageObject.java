package com.exito.testing.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

@DefaultUrl("https://www.exito.com/")
public class HomePageObject extends PageObject {

    By btn_menu = By.id("category-menu");
    By lnk_categoriaTecnologia = By.xpath("//p[text()='Libros y papelería']");
    By lnk_subCategoriaComputo = By.xpath("//strong[text()='Libros']");
    By btn_agregar = By.xpath("//span[text()='Agregar']");

    By btn_agregarMas = By.xpath("//button[contains(@class, 'product-summary-add-to-car-plus')]");
    By btn_carrito = By.xpath("//*[contains(@class, 'exito-header-3-x-minicartContainer ')]");


    public By getBtn_menu() {
        return btn_menu;
    }

    public By getLnk_categoriaTecnologia() {
        return lnk_categoriaTecnologia;
    }

    public By getLnk_subCategoriaComputo() {
        return lnk_subCategoriaComputo;
    }

    public By getBtn_agregar() {
        return btn_agregar;
    }

    public By getBtn_agregarMas() {
        return btn_agregarMas;
    }
    public By getBtn_carrito() {
        return btn_carrito;
    }
}
