package actions.Base;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.Dropdown;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectValue {

    /*
    public static Performable ByIndex(int index, By locator) {

        return instrumented(SelectValueByIndex.class, index, locator);
    }

    private static class SelectValueByIndex implements Performable {

        private final int index;
        private final By locator;

        Dropdown

        public SelectValueByIndex(int index, By locator) {
            this.index = index;
            this.locator = locator;
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.On(locator),
                    SelectFromOptions.byIndex(index).from(locator)
            );
        }


    }

    */

    public static Performable ByIndex(int index, By locator) {
        return SelectFromOptions.byIndex(index).from(locator);
    }

    public static Performable ByValue(String value, By locator) {
        return SelectFromOptions.byValue(value).from(locator);
    }

}
