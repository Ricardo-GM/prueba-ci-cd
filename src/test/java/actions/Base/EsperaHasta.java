package actions.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Hooks;

import java.time.Duration;

public class EsperaHasta {

    public static void ElementoVisible(By localizador) throws InterruptedException {
        Thread.sleep(5000);
        WebDriverWait ewait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        ewait.until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(localizador)));

    }
}
