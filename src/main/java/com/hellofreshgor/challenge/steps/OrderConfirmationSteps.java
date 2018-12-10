package com.hellofreshgor.challenge.steps;

import com.hellofreshgor.challenge.pages.OrderConfirmationPage;
import net.thucydides.core.annotations.Step;

public class OrderConfirmationSteps {

  private OrderConfirmationPage orderConfirmationPage;

  @Step
  public void click_on_proceed_checkout_button() {
    orderConfirmationPage.clickOnProceedCheckoutButton();
  }
}
