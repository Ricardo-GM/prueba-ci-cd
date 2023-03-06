package userinterface;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SecurePage extends PageObject {

    private static By flashMessage = By.id("flash");

    private static By cardNavigator = By.xpath("//div[@class='card__body']");

    private static By userLogged = By.linkText("Hector");

    public static By getFlashMessage() {
        return flashMessage;
    }

    public static By getCardNavigator() {
        return cardNavigator;
    }

    public static By getUserLogged() {
        return userLogged;
    }


}
