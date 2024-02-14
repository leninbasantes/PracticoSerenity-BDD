package org.nttdata.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.nttdata.userinterfaces.CompleteFormInterface;
import org.nttdata.userinterfaces.FinalizePurchaseInterface;
import org.nttdata.userinterfaces.LoginInterface;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompletePurchaseFormTask implements Task {

    private final String firstName;
    private final String lastName;
    private final String postalCode;

    protected CompletePurchaseFormTask(String firstName, String lastName, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    public static CompletePurchaseFormTask withInformation(String firstName, String lastName, String postalCode) {
        return instrumented(CompletePurchaseFormTask.class, firstName, lastName, postalCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CompleteFormInterface.firstName, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(firstName).into(CompleteFormInterface.firstName),

                WaitUntil.the(CompleteFormInterface.lastName, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(lastName).into(CompleteFormInterface.lastName),

                WaitUntil.the(CompleteFormInterface.postalCode, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(postalCode).into(CompleteFormInterface.postalCode),

                WaitUntil.the(CompleteFormInterface.BTN_SUMIT, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CompleteFormInterface.BTN_SUMIT)

        );
    }
}