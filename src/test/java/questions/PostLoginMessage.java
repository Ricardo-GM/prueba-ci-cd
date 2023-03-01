package questions;

import actions.Base.EsperaHasta;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.WebElement;
import userinterface.SecurePage;

public class PostLoginMessage {

    public static Question<String> Text() throws InterruptedException {

        return actor -> actor.asksFor(Text.of(SecurePage.getFlashMessage()));
    }

}
