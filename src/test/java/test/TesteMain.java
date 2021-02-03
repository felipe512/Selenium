package test;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PrincipalPage;
import suporte.Generator;
import suporte.Screenshots;
import suporte.Web;

import java.time.Duration;


@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "DadosCadastro.csv")

public class TesteMain {
    private WebDriver navegador;

    @Rule
    public TestName test = new TestName();


    @Before
    public void setUp() { navegador = Web.createBrowser(); }

    @Test
    public void cadastroClientelePoc(
            @Param(name = "email") String email,
            @Param(name = "gender") String gender,
            @Param(name = "firstname") String firstName,
            @Param(name = "lastname") String lastName,
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
            @Param(name = "alias") String alias
    ) {

        new PrincipalPage(navegador)
                .clickSignIn()
                .inserirEmail(email)
                .clickCreateAccount()
                .GenderType(gender)
                .inserirFirstname(firstName)
                .inserirLastName(lastName)
                .inserirPassword(password)
                .aniversario(dia, mes, ano)
                .inserirAddress(address)
                .inserirCity(city)
                .inserirState(state)
                .inserirZipCode(zipcode)
                .inserirCountry(country)
                .inserirMobilePhone(mobilephone)
                .inserirAlias(alias)
                .registrar()
                .print();

    }

    @After
    public void tearDown() {
        navegador.close();
    }
}