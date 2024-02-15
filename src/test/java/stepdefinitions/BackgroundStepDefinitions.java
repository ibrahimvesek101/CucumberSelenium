package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleHomePage;
import utils.Driver;

public class BackgroundStepDefinitions {


    @Given("Kullanıcı google.com sayfasındadır.")
    public void kullaniciGoogleComSayfasindadir() {
        Driver.getDriver().get("https://www.google.com/");
    }

    @When("Kullanıcı arama kısmına amazon yazar.")
    public void kullanıcıAramaKısmınaAmazonYazar() {
        GoogleHomePage hp = new GoogleHomePage();
        hp.searchFor("amazon");
    }

    @And("Kullanıcı aramayı gerçekleştirdiğinde")
    public void kullanıcıAramayıGerçekleştirdiğinde() {
        GoogleHomePage hp = new GoogleHomePage();
        hp.clickSearchButton();
    }

    @Then("Kullanıcı title kısmında amazon görmelidir.")
    public void kullanıcıTitleKısmındaAmazonGörmelidir() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("amazon"));

    }

    @When("Kullanıcı arama kısmına linkedin yazar.")
    public void kullanıcıAramaKısmınaLinkedinYazar() {
        GoogleHomePage hp = new GoogleHomePage();
        hp.searchFor("linkedin");

    }

    @Then("Kullanıcı title kısmında linkedin görmelidir.")
    public void kullanıcıTitleKısmındaLinkedinGörmelidir() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("linkedin"));

    }
}










