package com.hellofreshgor.challenge.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CatalogPage extends PageObject {

  @FindBy(xpath = "//a[@title='Faded Short Sleeve T-shirts']/ancestor::li")
  private WebElementFacade fadedShortShirt;

  public void clickOnFadedShortShirtElement() {
    fadedShortShirt.click();
  }
}
