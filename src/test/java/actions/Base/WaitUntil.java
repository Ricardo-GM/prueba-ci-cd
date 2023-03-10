package actions.Base;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Hooks;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class WaitUntil {

    public static void ElementoVisible(By localizador) throws InterruptedException {
        Thread.sleep(5000);
        WebDriverWait ewait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        ewait.until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(localizador)));
    }

    public static Performable ElementVisible(By localizador) {
        Target elemento = Target.the("elemento").located(localizador);
        return net.serenitybdd.screenplay.waits.WaitUntil.the(elemento, isVisible());
    }

}
