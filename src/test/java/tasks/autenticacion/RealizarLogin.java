package tasks.autenticacion;

import actions.Base.Click;
import actions.Base.EnterText;
import actions.Base.EsperaHasta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.LoginPage;
import util.LoginUser;

public class RealizarLogin implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {

    }


    public static Performable Como(LoginUser loginUser) throws Exception {
        return Task.where("{0} inicia sesion como " + loginUser,
                EnterText.On(LoginPage.getNavigatorEmailInput(), loginUser.username),
                Click.On(LoginPage.getNavigatorLoginButton()),
                EsperaHasta.Espera(LoginPage.getAdEmailInput()),
                EnterText.On(LoginPage.getAdEmailInput(), loginUser.username),
                Click.On(LoginPage.getAdNextButton()),
                EsperaHasta.Espera(LoginPage.getAdPasswordInput()),
                EnterText.On(LoginPage.getAdPasswordInput(), loginUser.password),
                Click.On(LoginPage.getAdSubmitButton()),
                EsperaHasta.Espera(LoginPage.getAdDontRememberButton()),
                Click.On(LoginPage.getAdDontRememberButton())


        );
    }
}
