package com.hellofreshgor.challenge.steps;


import com.hellofreshgor.challenge.pages.AuthenticationPage;
import net.thucydides.core.annotations.Step;

public class AuthenticationSteps {

    private AuthenticationPage authenticationPage;

    @Step
    public void set_user_email(String email) {
        authenticationPage.setEmail(email);
    }

    @Step
    public void click_on_submit_button() {
        authenticationPage.clickOnSubmitButton();
    }

    @Step
    public void set_login_email(String email) {
        authenticationPage.setLoginEmail(email);
    }

    @Step
    public void set_login_password(String password) {
        authenticationPage.setLoginPassword(password);
    }

    @Step
    public void click_on_login_button() {
        authenticationPage.clickOnLoginButton();
    }
}
