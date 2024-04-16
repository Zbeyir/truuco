package de.compeople.step_definitions;

import de.compeople.pages.BasePage;
import de.compeople.utilities.BrowserUtils;
import de.compeople.utilities.ConfigurationReader;
import de.compeople.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class compeople_checkStepDefinitions {

    BasePage basePage = new BasePage();

    @When("user is on the compeople  Page")
    public void user_is_on_the_compeople_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.sleep(4);
    }



    @When("user click Cookie Box Save Button")
    public void user_click_cookie_box_save_button() {
       basePage.cookieBoxSaveButton.click();
    }

    @Then("check user on the compeople Page")
    public void check_user_on_the_compeople_page() {
        Assert.assertTrue(BrowserUtils.linkcheck().contains("compeople"));

    }


    @When("user click Karriere Button")
    public void user_click_karriere_button() {
        basePage.karriere.click();
    }




    @Then("check user on the compeople Karriere")
    public void check_user_on_the_compeople_karriere() {
        Assert.assertTrue(BrowserUtils.linkcheck().contains("karriere"));
    }
    @Then("user click Offene Stellen Button")
    public void user_click_offene_stellen_button() {
        basePage.offeneStellenButton.click();
    }





}