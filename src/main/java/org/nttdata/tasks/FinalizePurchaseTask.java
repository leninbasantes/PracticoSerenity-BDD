package org.nttdata.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.nttdata.userinterfaces.CompleteFormInterface;
import org.nttdata.userinterfaces.FinalizePurchaseInterface;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FinalizePurchaseTask implements Task {

    public static FinalizePurchaseTask complete() {
        return instrumented(FinalizePurchaseTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FinalizePurchaseInterface.BTN_SUMIT, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(FinalizePurchaseInterface.BTN_SUMIT)
        );
    }
}