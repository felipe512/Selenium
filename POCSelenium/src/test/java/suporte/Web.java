package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SouthSystem\\drivers\\chromedriver88\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        navegador.get("http://automationpractice.com/index.php");
        return navegador;
    }

}
