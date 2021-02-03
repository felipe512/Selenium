package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountPage extends BasePage {
    public CreateAccountPage(WebDriver navegador) {
        super(navegador);
    }

    public CreateAccountPage inserirEmail(String email) {
        navegador.findElement(By.id("email_create")).sendKeys(email);
        return this;
    }

    public CadastroPage clickCreateAccount() {
        navegador.findElement(By.id("SubmitCreate")).click();

        return new CadastroPage(navegador);
    }
}
