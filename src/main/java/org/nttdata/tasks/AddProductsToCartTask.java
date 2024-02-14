package org.nttdata.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.actions.Click;
import org.nttdata.userinterfaces.ShopProductsInterface;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class AddProductsToCartTask implements Task {
    public static Task addProductsToCart(){return instrumented(AddProductsToCartTask.class);}
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(ShopProductsInterface.BTN_ADD_TO_CART_1, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopProductsInterface.BTN_ADD_TO_CART_1),

                WaitUntil.the(ShopProductsInterface.BTN_ADD_TO_CART_2, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopProductsInterface.BTN_ADD_TO_CART_2)
        );
    }
}
