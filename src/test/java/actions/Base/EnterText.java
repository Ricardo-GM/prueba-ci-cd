package actions.Base;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

public class EnterText {
    public static Performable On(By locator, String text) {
        return Enter.theValue(text).into(locator);
    }
}
