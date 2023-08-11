package com.exito.testing.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com.exito.testing.features/compraproductos.feature",
        glue = "com.exito.testing.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class CompraProductoRunner {
}
