package actions.Base;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Hooks;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EsperaHasta {


    public static void ElementoVisible(By localizador) {
        WebDriverWait ewait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        ewait.until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(localizador)));

    }

    public static Performable Espera(By localizador){
        Target elemento = Target.the("elemento").located(localizador);
        return WaitUntil.the(elemento, isVisible());
    }


}
