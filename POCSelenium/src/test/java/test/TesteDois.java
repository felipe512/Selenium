package test;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import suporte.Web;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "TesteDadosCadastro.csv")
public class TesteDois {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createBrowser();

        navegador.findElement(By.linkText("Sign in")).click();

    }

    @Test
    public void testeDois(@Param(name="email") String email) {

        navegador.findElement(By.id("email_create")).sendKeys(email);

        navegador.findElement(By.id("SubmitCreate")).click();

        navegador.findElement(By.id("id_gender1")).click();

        navegador.findElement(By.id("customer_firstname")).sendKeys("Wndow");

        navegador.findElement(By.id("customer_lastname")).sendKeys("Sdoeub");

        navegador.findElement(By.id("passwd")).sendKeys("213131");

        navegador.findElement(By.id("days")).click();
        WebElement dataDia = navegador.findElement(By.name("days"));
        new Select(dataDia).selectByIndex(14);

        navegador.findElement(By.id("months")).click();
        WebElement dataMes = navegador.findElement(By.name("months"));
        new Select(dataMes).selectByIndex(4);

        navegador.findElement(By.id("years")).click();
        WebElement dataAno = navegador.findElement(By.name("years"));
        new Select(dataAno).selectByIndex(23);

        navegador.findElement(By.id("address1")).sendKeys("dubwud");

        navegador.findElement(By.id("city")).sendKeys("d3ubdi");

        navegador.findElement(By.id("id_state")).click();
        WebElement states = navegador.findElement(By.name("id_state"));
        new Select(states).selectByVisibleText("Florida");

        navegador.findElement(By.id("postcode")).sendKeys("00000");

        navegador.findElement(By.id("id_country")).click();
        WebElement countries = navegador.findElement(By.name("id_country"));
        new Select(countries).selectByVisibleText("United States");

        navegador.findElement(By.id("phone_mobile")).sendKeys("+5100000000");

        navegador.findElement(By.id("alias")).sendKeys("debfiue");

        navegador.findElement(By.id("submitAccount")).click();

    }

    @After
    public void after() {
        //navegador.close();
    }
}


