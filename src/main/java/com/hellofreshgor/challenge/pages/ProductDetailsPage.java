package com.hellofreshgor.challenge.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ProductDetailsPage extends PageObject {

  @FindBy(name = "Submit")
  private WebElementFacade addToCartButton;

  public void clickOnAddToCartButton() {
    addToCartButton.click();
  }
}
