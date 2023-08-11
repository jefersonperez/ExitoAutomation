package com.exito.testing.stepdefinitions;

import com.exito.testing.steps.ComprarProductoStep;
import cucumber.api.java.es.*;
import net.thucydides.core.annotations.Steps;

public class CompraProductosStepDefinition {

    @Steps
    ComprarProductoStep compra;

    @Dado("^que estoy en la página exito$")
    public void queEstoyEnLaPáginaExito() {
        compra.abrirApp();
    }

    @Cuando("^selecciono categoria$")
    public void seleccionoCategoria() {
        compra.clickMenu();
        compra.seleccionarCategoria();
    }

    @Cuando("^selecciono subcategoria$")
    public void seleccionoSubcategoria() {
        compra.seleccionarSubcategoria();
    }

    @Cuando("^selecciono cinco productos$")
    public void seleccionoCincoProductos() throws InterruptedException {
        compra.seleccionarProductos();
    }

    @Entonces("^debo validar las cantidades exactas de los productos$")
    public void deboValidarLasCantidadesExactasDeLosProductos() {

    }
}
