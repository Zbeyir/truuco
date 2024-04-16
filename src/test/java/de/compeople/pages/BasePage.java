package de.compeople.pages;

import de.compeople.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id=\"menu-1-cf6c06f\"]/li[4]/a")
    public WebElement karriere;

    @FindBy(xpath = "//*[@id=\"CookieBoxSaveButton\"]")
    public WebElement cookieBoxSaveButton;


    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[1]/div/div[3]/div/a[3]/div[1]/div/div")
    public WebElement offeneStellenButton;

    @FindBy(xpath = "//*[@id=\"offenestellen\"]/div/div[2]/div/h2")
    public WebElement offeneStellenTitle;






}

