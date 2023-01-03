package com.dekosas.StepDefinitions;

import com.dekosas.Steps.LoginStep;
import com.dekosas.Steps.PaginaPrincipalStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStepDefinition {

    @Steps
    PaginaPrincipalStep paginaPrincipalStep;
    @Steps
    LoginStep loginStep;

    @Dado("^que el usuario se encuentra en la pagina web$")
    public void queElUsuarioSeEncuentraEnLaPaginaWeb() {
        paginaPrincipalStep.abrirNavegador();
    }

    @Cuando("^el ingrese sus credenciales para inicar sesion$")
    public void elIngreseSusCredencialesParaInicarSesion() throws IOException {
        paginaPrincipalStep.clickBtnMiCuenta();
        loginStep.ingresarCorreo();
        loginStep.ingresarClave();
        loginStep.clickEntrar();
    }

    @Entonces("^el visualizara un mensaje de bienvenido$")
    public void elVisualizaraUnMensajeDeBienvenido() {
        loginStep.validarMensaje();
    }

}
