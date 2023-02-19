package tasks.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import screen.LoginPage;
import util.LoginUser;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {

    }

    public static Performable as(LoginUser loginUser){
        return Task.where("{0} inicia sesion como " + loginUser,
                Enter.theValue(loginUser.username).into(LoginPage.username_input),
                Enter.theValue(loginUser.password).into(LoginPage.password_input),
                Click.on(LoginPage.login_button)
                );

    }

}
