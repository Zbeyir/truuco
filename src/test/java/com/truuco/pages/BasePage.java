package com.truuco.pages;

import com.truuco.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[contains (@href, 'leistungen')]")
    public WebElement leistungen;


    @FindBy(xpath = "//span[@class='navbar-toggler-icon']")
    public WebElement menuButton;

    @FindBy(xpath = "//a[@aria-label='deny cookies']")
    public WebElement denyCookies;

    @FindBy(xpath = "//a[contains (@href, 'ueber-uns')]")
    public WebElement ueber_uns;

    @FindBy(xpath = "//a[contains (@href, 'jobs')]")
    public WebElement job;

}

