package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.Driver;

public class ibrahimStepDefinitions {

    @Given("kullanıcı google ye girer")
    public void kullanıcıGoogleYeGirer() {
        Driver.getDriver().get("https://www.google.com/");
    }

    @And("kullanıcı search kısmına {string} yazar ve Enter tuşuna basar")
    public void kullanıcıSearchKısmınaYazarVeEnterTuşunaBasar(String arg0) {
        Driver.getDriver().findElement(By.id("APjFqb")).sendKeys("vesek ibrahim"+ Keys.ENTER);
        Driver.getDriver().findElement(By.xpath("(//*[@class='hdtb-mitem']/a)[1]")).click();
    }

    @Then("kullanıcı arama sonuçlarının kaç olduğunu konsola yazar.")
    public void kullanıcıAramaSonuçlarınınKaçOlduğunuKonsolaYazar() {

    }
}
