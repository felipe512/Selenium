package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CadastroPage extends BasePage{
    public CadastroPage(WebDriver navegador) {
        super(navegador);
    }

    public CadastroPage GenderType(String gender){
        navegador.findElement(By.id(gender)).click();
        return this;
    }

    public CadastroPage inserirFirstname(String firstname){
        navegador.findElement(By.id("customer_firstname")).sendKeys(firstname);
        return this;
    }

    public CadastroPage inserirLastName(String lastname){
        navegador.findElement(By.id("customer_lastname")).sendKeys(lastname);
        return this;
    }

    public CadastroPage inserirPassword(String password){
        navegador.findElement(By.id("passwd")).sendKeys(password);
        return this;
    }

    public CadastroPage inserirDiaAniver(Integer dia){
        navegador.findElement(By.id("days")).click();
        WebElement dataDia = navegador.findElement(By.name("days"));
        new Select(dataDia).selectByIndex(dia);

        return this;
    }

    public CadastroPage inserirMesAniver(Integer mes){
        navegador.findElement(By.id("months")).click();
        WebElement dataMes = navegador.findElement(By.name("months"));
        new Select(dataMes).selectByIndex(mes);

        return this;
    }

    public CadastroPage inserirAnoAniver(Integer ano){
        navegador.findElement(By.id("years")).click();
        WebElement dataAno = navegador.findElement(By.name("years"));
        new Select(dataAno).selectByIndex(ano);

        return this;
    }

    public CadastroPage inserirAddress(String address){
        navegador.findElement(By.id("address1")).sendKeys(address);
        return this;

    }

    public CadastroPage inserirCity(String city) {
        navegador.findElement(By.id("city")).sendKeys(city);
        return this;
    }

    public CadastroPage inserirState(String state){
        navegador.findElement(By.id("id_state")).click();
        WebElement states = navegador.findElement(By.name("id_state"));
        new Select(states).selectByVisibleText(state);

        return this;
    }

    public CadastroPage inserirZipCode(String zipcode){
        navegador.findElement(By.id("postcode")).sendKeys(zipcode);

        return this;
    }

    public CadastroPage inserirCountry(String country){
        navegador.findElement(By.id("id_country")).click();
        WebElement countries = navegador.findElement(By.name("id_country"));
        new Select(countries).selectByVisibleText(country);

        return this;
    }
    public CadastroPage inserirMobilePhone(String mobilephone){
        navegador.findElement(By.id("phone_mobile")).sendKeys(mobilephone);

        return this;
    }

    public CadastroPage inserirAlias(String alias){
        navegador.findElement(By.id("alias")).sendKeys(alias);

        return this;
    }

    public CadastroPage aniversario(Integer dia, Integer mes, Integer ano) {
        this.inserirDiaAniver(dia);
        this.inserirMesAniver(mes);
        this.inserirAnoAniver(ano);

        return this;
    }

    public MePrincipalPage registrar(){
        navegador.findElement(By.id("submitAccount")).click();
        return new MePrincipalPage(navegador);
    }



}
