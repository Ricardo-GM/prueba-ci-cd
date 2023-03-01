package userinterface;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {


    private static By usernameInput = By.id("username");
    private static By passwordInput = By.id("password");
    private static By loginButton = By.xpath("//button[@type='submit']");

    public static By getUsernameInput() {
        return usernameInput;
    }
    public static By getPasswordInput() {
        return passwordInput;
    }
    public static By getLoginButton() { return loginButton; }







}
