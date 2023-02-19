package stepdefinitions;

import actions.Navigate.Navigate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import questions.PostLoginMessage;
import tasks.authentication.Login;
import util.Constantes;
import util.LoginUser;

public class LoginSteps {

    @Given("{actor} se encuentra en la pagina de login")
    public void se_encuentra_en_la_pagina_de_login(Actor actor){
        actor.attemptsTo(
                Navigate.toLoginPage()
        );
    }

    @When("{actor} inicia sesion con credenciales validas")
    public void inicia_sesion_con_credenciales_validas(Actor actor){
        actor.attemptsTo(
                Login.as(LoginUser.VALID_USER)
        );
    }

    @Then("{actor} visualiza un mensaje de inicio de sesion valida")
    public void visualiza_un_mensaje_de_inicio_de_sesion_valida(Actor actor){
        actor.attemptsTo(
                Ensure.that(PostLoginMessage.Text()).contains(Constantes.MENSAJE_LOGIN_CORRECTO)
        );
    }

    @When("{actor} intenta iniciar sension con credenciales invalidas")
    public void intenta_iniciar_sension_con_credenciales_invalidas(Actor actor){
        actor.attemptsTo(
                Login.as(LoginUser.INVALID_USER)
        );
    }

    @Then("{actor} visualiza un mensaje de inicio de sesion fallido")
    public void visualiza_un_mensaje_de_inicio_de_sesion_fallido(Actor actor){
        actor.attemptsTo(
                Ensure.that(PostLoginMessage.Text()).contains(Constantes.MENSAJE_LOGIN_INCORRECTO)
        );
    }




}
