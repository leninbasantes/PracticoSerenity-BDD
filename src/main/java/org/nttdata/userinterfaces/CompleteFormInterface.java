package org.nttdata.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompleteFormInterface {

    public static final Target firstName= Target.the("Input User").located(By.id("first-name"));
    public static final Target lastName = Target.the("Input Password").located(By.id("last-name"));
    public static final Target postalCode = Target.the("Button Sumit").located(By.id("postal-code"));

    public static final Target BTN_SUMIT= Target.the("Button Sumit").located(By.id("continue"));


}
