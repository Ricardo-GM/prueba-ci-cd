package tasks.autenticacion;

import actions.Base.Click;
import assertions.AssertionsHandler;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import userinterface.SecurePage;


public class VerificarMensajeFlash implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {

    }

    public static Performable Contiene(String actualText, String expectedText) {

        return Task.where("{0} verifica que el mensaje flash contenga el texto: " + expectedText,

                actor -> AssertionsHandler.assertTextContains(expectedText, actualText)

        );

    }

}
