package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrincipalPage extends BasePage{

    public PrincipalPage(WebDriver navigator) {
        super(navigator);
    }

    public CreateAccountPage clickSignIn(){

        navegador.findElement(By.linkText("Sign in")).click();

        return new CreateAccountPage(navegador);

    }

}
