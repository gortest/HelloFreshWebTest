package com.hellofreshgor.challenge.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;

@At("#HOST" + HomePage.DEFAULT_URL)
@DefaultUrl(HomePage.DEFAULT_URL)
public class HomePage extends PageObject {

    public static final String DEFAULT_URL = "/index.php";

}
