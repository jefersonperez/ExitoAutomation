package com.exito.testing.steps;

import com.exito.testing.pageobjects.HomePageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class ComprarProductoStep {

    HomePageObject home;

    Random random = new Random();
    @Step
    public void abrirApp(){
        home.open();
    }

    @Step
    public void clickMenu(){
        home.getDriver().findElement(home.getBtn_menu()).click();
    }

    @Step
    public void seleccionarCategoria(){
        WebDriverWait wait = new WebDriverWait(home.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(home.getLnk_categoriaTecnologia()));
        home.getDriver().findElement(home.getLnk_categoriaTecnologia()).click();
    }

    @Step
    public void seleccionarSubcategoria(){
        home.getDriver().findElement(home.getLnk_subCategoriaComputo()).click();
    }

    @Step
    public void seleccionarProductos() throws InterruptedException {
       Actions action = new Actions(home.getDriver());


        List<WebElement> opcionesJuguetes = home.getDriver().findElements(home.getBtn_agregar());
        List<String> nombresJuguetesSeleccionados = new ArrayList<>();
        Random random = new Random();


        for (int i = 0; i < 5; i++) {
            int indiceAleatorio = random.nextInt(opcionesJuguetes.size());
            WebElement opcionJuguete = opcionesJuguetes.get(indiceAleatorio);
            String nombreJuguete = opcionJuguete.getText();
            nombresJuguetesSeleccionados.add(nombreJuguete);
            action.moveToElement(opcionJuguete).perform();
            home.getDriver().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            action.click().perform();
            System.out.println(nombreJuguete);
            opcionesJuguetes.remove(indiceAleatorio);
        }


        List<WebElement> elementosMas =  home.getDriver().findElements(home.getBtn_agregarMas());

        int clicsAleatorios = random.nextInt(9) + 1;
        for(int j = 0; j <5; j++){
            int indiceAleatorioBtnMas = random.nextInt(elementosMas.size());
            WebElement btnElementoMas = elementosMas.get(indiceAleatorioBtnMas);
            int btnMasAleatorio = random.nextInt(elementosMas.size());
            WebElement masAleatorio = elementosMas.get(btnMasAleatorio);
            action.moveToElement(btnElementoMas).perform();

            for (int i = 0; i < clicsAleatorios; i++) {

                home.getDriver().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
                action.click().perform();
                opcionesJuguetes.remove(masAleatorio);
            }

        }

        WebElement botonWebCarrito = home.getDriver().findElement(home.getBtn_carrito());
        action.moveToElement(botonWebCarrito).perform();
        action.click().perform();



}


}
