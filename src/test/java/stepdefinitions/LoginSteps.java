package stepdefinitions;

import actions.Base.Click;
import actions.Base.EsperaHasta;
import exceptions.ExceptionHandler;
import tasks.autenticacion.CambiarVentana;
import tasks.autenticacion.VerificarMensajeFlash;
import actions.Navegacion.Navegar;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import questions.PostLoginMessage;
import tasks.autenticacion.RealizarLogin;
import userinterface.NavigatorHome;
import userinterface.SecurePage;
import util.Constantes;
import util.LoginUser;


public class LoginSteps {

    @Given("{actor} se encuentra en la pagina de login")
    public void se_encuentra_en_la_pagina_de_login(Actor actor) throws Exception {
        try {
            actor.attemptsTo(
                    Navegar.aLoginPage()
            );
        }catch (Throwable e) {
            ExceptionHandler.Error(e);
        }

    }

    @When("{actor} inicia sesion con credenciales validas")
    public void inicia_sesion_con_credenciales_validas(Actor actor) throws Exception{
        try {
            actor.attemptsTo(
                    RealizarLogin.Como(LoginUser.VALID_USER)
            );
        } catch (Throwable e) {
            ExceptionHandler.Error(e);
        }


    }
    @Then("{actor} visualiza un mensaje de inicio de sesion valida")
    public void visualiza_un_mensaje_de_inicio_de_sesion_valida(Actor actor) throws Exception {

        try {
            actor.attemptsTo(
                    EsperaHasta.Espera(SecurePage.getCardNavigator()),
                    Click.On(SecurePage.getCardNavigator()),
                    CambiarVentana.a(Constantes.TITULO_PAGINA_NAVIGATOR),
                    EsperaHasta.Espera(NavigatorHome.getNombreProducto()),
                    Click.On(NavigatorHome.getNombreProducto())




            );
        } catch (Throwable e) {
            ExceptionHandler.Error(e);
        }

    }
    @When("{actor} intenta iniciar sension con credenciales invalidas")
    public void intenta_iniciar_sension_con_credenciales_invalidas(Actor actor) throws Exception {
        try {
            actor.attemptsTo(
                    RealizarLogin.Como(LoginUser.INVALID_USER)
            );
        }catch (Throwable e) {
            ExceptionHandler.Error(e);
        }

    }
    @Then("{actor} visualiza un mensaje de inicio de sesion fallido")
    public void visualiza_un_mensaje_de_inicio_de_sesion_fallido(Actor actor) throws Exception {

        try {
            actor.attemptsTo(
                    //Ensure.that(PostLoginMessage.Text()).contains(Constantes.MENSAJE_LOGIN_INCORRECTO),
                    VerificarMensajeFlash.Contiene(PostLoginMessage.Text().answeredBy(actor), Constantes.MENSAJE_LOGIN_INCORRECTO)

            );
        }catch (Throwable e) {
            ExceptionHandler.Error(e);
        }



    }




}
