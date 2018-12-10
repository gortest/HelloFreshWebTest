package com.hellofreshgor.challenge.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class OrderConfirmationPage extends PageObject {

  @FindBy(xpath = "//*[@id='layer_cart']//a[@class and @title='Proceed to checkout']")
  private WebElementFacade proceedCheckoutButton;

  public void clickOnProceedCheckoutButton() {
    proceedCheckoutButton.click();
  }
}
