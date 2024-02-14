package org.nttdata.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

//1ra ID
//2da ClassName
//3ra Tag
//4ta Xpath

public class LoginInterface {

    public static final Target INP_USER= Target.the("Input User").located(By.id("user-name"));
    public static final Target INP_PASSWORD = Target.the("Input Password").located(By.id("password"));
    public static final Target BTN_SUMIT = Target.the("Button Sumit").located(By.id("login-button"));

}
