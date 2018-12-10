package com.hellofreshgor.challenge.steps;

import com.hellofreshgor.challenge.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeSteps {

    private HomePage homePage;

    @Step
    public void open_page() {
        homePage.open();
    }

}
