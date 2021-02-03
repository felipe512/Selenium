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
@DataLoader(filePaths = "DadosCadastro.csv")

public class TestReserve {
    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createBrowser();

        navegador.findElement(By.linkText("Sign in")).click();

    }

    @Test
    public void testeReserve(@Param(name = "email") String email,
                            @Param(name = "gender") String gender,
                            @Param(name = "firstName") String firstName,
                            @Param(name = "lastName") String lastName,
                            @Param(name = "password") String password,
                            @Param(name = "dia") Integer dia,
                            @Param(name = "mes") Integer mes,
                            @Param(name = "ano") Integer ano,
                            @Param(name = "address") String address,
                            @Param(name = "city") String city,
                            @Param(name = "state") String state,
                            @Param(name = "zipcode") String zipcode,
                            @Param(name = "country") String country,
                            @Param(name = "mobilephone") String mobilephone,
                            @Param(name = "alias") String alias){


        navegador.findElement(By.id("email_create")).sendKeys(email);

        navegador.findElement(By.id("SubmitCreate")).click();

        navegador.findElement(By.id("id_gender1")).click();

        navegador.findElement(By.id("customer_firstname")).sendKeys(firstName);

        navegador.findElement(By.id("customer_lastname")).sendKeys(lastName);

        navegador.findElement(By.id("passwd")).sendKeys(password);

        navegador.findElement(By.id("days")).click();
        WebElement dataDia = navegador.findElement(By.name("days"));
        new Select(dataDia).selectByIndex(dia);

        navegador.findElement(By.id("months")).click();
        WebElement dataMes = navegador.findElement(By.name("months"));
        new Select(dataMes).selectByIndex(mes);

        navegador.findElement(By.id("years")).click();
        WebElement dataAno = navegador.findElement(By.name("years"));
        new Select(dataAno).selectByIndex(ano);

        navegador.findElement(By.id("address1")).sendKeys(address);

        navegador.findElement(By.id("city")).sendKeys(city);

        navegador.findElement(By.id("id_state")).click();
        WebElement states = navegador.findElement(By.name("id_state"));
        new Select(states).selectByVisibleText(state);

        navegador.findElement(By.id("postcode")).sendKeys(zipcode);

        navegador.findElement(By.id("id_country")).click();
        WebElement countries = navegador.findElement(By.name("id_country"));
        new Select(countries).selectByVisibleText(country);

        navegador.findElement(By.id("phone_mobile")).sendKeys(mobilephone);

        navegador.findElement(By.id("alias")).sendKeys(alias);

        navegador.findElement(By.id("submitAccount")).click();

    }

    @After
    public void after(){
        //navegador.close();
    }



}
