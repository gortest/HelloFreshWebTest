package com.hellofreshgor.challenge.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;

@At("#HOST" + AuthenticationPage.DEFAULT_URL)
@DefaultUrl(AuthenticationPage.DEFAULT_URL)
public class AuthenticationPage extends PageObject {

    public static final String DEFAULT_URL = "/index.php?controller=authentication";

    @FindBy(id = "email_create")
    private WebElementFacade singInEmailField;

    @FindBy(id = "SubmitCreate")
    private WebElementFacade createAccountButton;

    @FindBy(id = "email")
    private WebElementFacade loginEmailField;

    @FindBy(id = "passwd")
    private WebElementFacade loginPasswordField;

    @FindBy(id = "SubmitLogin")
    private WebElementFacade loginButton;

    public void setEmail(String email) {
        singInEmailField.type(email);
    }

    public void clickOnSubmitButton() {
        createAccountButton.waitUntilClickable();
        createAccountButton.click();
    }

    public void setLoginEmail(String email) {
      loginEmailField.type(email);
    }

    public void setLoginPassword(String password) {
      loginPasswordField.type(password);
    }

    public void clickOnLoginButton() {
      loginButton.waitUntilClickable();
      loginButton.click();
    }

}
