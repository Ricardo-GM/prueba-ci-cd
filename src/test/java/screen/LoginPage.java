package screen;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public static By username_input = By.id("username");
    public static By password_input = By.id("password");
    public static By login_button = By.xpath("//button[@type='submit']");


}
