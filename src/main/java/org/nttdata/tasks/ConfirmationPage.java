package org.nttdata.tasks;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmationPage {
    public static final Target ORDER_CONFIRMATION_MESSAGE = Target.the("Mensaje Confirmacion")
            .located(By.id("checkout_complete_container")); // Cambia "confirmationMessageId" por el ID real del elemento en tu página web
}
