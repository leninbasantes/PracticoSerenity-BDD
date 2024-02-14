package org.nttdata.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddCarInterface {
    public static final Target BTN_SUBMIT= Target.the("View Car").located(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));

    public static final Target BTN_Checkout= Target.the("Checkout Steps").located(By.xpath("//*[@id=\"checkout\"]"));

}
