package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SecurePage;

@Subject("the text of flash message")
public class FlashMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return String.valueOf(Text.of(SecurePage.getFlashMessage()));
    }

    public static Question<String>Text() {
        return new FlashMessage();
    }

}
