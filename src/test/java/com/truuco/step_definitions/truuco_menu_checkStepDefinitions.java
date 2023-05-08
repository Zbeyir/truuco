package com.truuco.step_definitions;

import com.truuco.pages.BasePage;
import com.truuco.utilities.BrowserUtils;
import com.truuco.utilities.ConfigurationReader;
import com.truuco.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class truuco_menu_checkStepDefinitions {

    BasePage basePage = new BasePage();

    @When("user is on the truuco Page")
    public void user_is_on_the_truuco_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.sleep(2);
    }

    @When("user accept Cookies")
    public void user_accept_cookies() {
        basePage.denyCookies.click();
        BrowserUtils.sleep(2);
    }

    @When("user click Menu Button")
    public void user_click_menu_button() {
        basePage.menuButton.click();
        BrowserUtils.sleep(2);
    }

    @When("user click Leistungen Button")
    public void user_click_leistungen_button() {
        basePage.leistungen.click();
        BrowserUtils.sleep(2);
    }

    @Then("check user on the Leistungen page")
    public void check_user_on_the_leistungen_page() {
        Assert.assertTrue(BrowserUtils.linkcheck().contains("leistungen"));
    }

    @When("user click ueber_uns Button")
    public void user_click_ueber_uns_button() {
        basePage.ueber_uns.click();
        BrowserUtils.sleep(2);
    }

    @Then("check user on the ueber-uns page")
    public void check_user_on_the_ueber_uns_page() {
        Assert.assertTrue(BrowserUtils.linkcheck().contains("ueber-uns"));
    }


    @When("user click jobs Button")
    public void user_click_jobs_button() {
        basePage.job.click();
        BrowserUtils.sleep(2);
    }

    @Then("check user on the jobs page")
    public void check_user_on_the_jobs_page() {
        Assert.assertTrue(BrowserUtils.linkcheck().contains("jobs"));
    }


}