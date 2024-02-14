package org.nttdata.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShopProductsInterface {

    public static final Target BTN_ADD_TO_CART_1 = Target.the("Button add to cart Product 1").located(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));

    public static final Target BTN_ADD_TO_CART_2 = Target.the("Button add to cart Product 2").located(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));;

    public static final Target BTN_CART = Target.the("Boton Cart").located(By.id("//*[@id='cart']/button"));;

}
