package com.hellofreshgor.challenge.steps;


import com.hellofreshgor.challenge.pages.HeaderPage;
import net.thucydides.core.annotations.Step;

public class HeaderSteps {

    private HeaderPage headerPage;

    @Step
    public void click_on_login_button() {
        headerPage.clickOnLoginButton();
    }

    public void click_on_women_link() {
        headerPage.clickOnWomenLink();
    }

}
