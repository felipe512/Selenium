package pages;

import org.openqa.selenium.WebDriver;
import suporte.Generator;
import suporte.Screenshots;

public class MePrincipalPage extends BasePage{
    public MePrincipalPage(WebDriver navegador) {
        super(navegador);
    }

    String Screenshotting = "C:\\Users\\SouthSystem\\Desktop\\Foot'sTestSelenium\\" + Generator.dataHoraParaArquivo() + "cadastroClientelePoc.png";
    public void print(){
        Screenshots.tirar(navegador, Screenshotting);
    }

}
