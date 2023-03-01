package actions.Base;

import net.serenitybdd.screenplay.Performable;
import org.openqa.selenium.By;

public class Click {
    public static Performable On(By locator) {

        return net.serenitybdd.screenplay.actions.Click.on(locator);
    }

}
