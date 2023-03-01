package actions.Navegacion;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import util.Constantes;

public class Navegar {

    public static Performable aLoginPage(){
        return Open.url(Constantes.PAGINA_LOGIN);
    }
}
