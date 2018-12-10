package com.hellofreshgor.challenge.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HeaderPage extends PageObject {

    @FindBy(className = "login")
    private WebElementFacade loginButton;

    @FindBy(linkText = "Women")
    private  WebElementFacade womenLink;

    public void clickOnLoginButton() {
        loginButton.waitUntilClickable();
        loginButton.click();
    }

    public void clickOnWomenLink() {
        womenLink.waitUntilClickable();
        womenLink.click();
    }
}
