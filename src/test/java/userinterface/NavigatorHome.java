package userinterface;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class NavigatorHome extends PageObject {

    private static By nombreProducto = By.className("productName");

    public static By getNombreProducto() {
        return nombreProducto;
    }



}
