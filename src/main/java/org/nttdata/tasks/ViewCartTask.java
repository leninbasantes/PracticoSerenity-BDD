package org.nttdata.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.nttdata.userinterfaces.AddCarInterface;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ViewCartTask implements Task {

    public static ViewCartTask view() {
        return instrumented(ViewCartTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(AddCarInterface.BTN_SUBMIT, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(AddCarInterface.BTN_SUBMIT),

                WaitUntil.the(AddCarInterface.BTN_Checkout, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(AddCarInterface.BTN_Checkout)
        );
    }
}