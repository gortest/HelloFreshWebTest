package com.hellofreshgor.challenge.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.hellofreshgor.challenge.pages.CheckoutPage;
import net.thucydides.core.annotations.Step;

public class CheckoutSteps {

  private CheckoutPage checkoutPage;

  @Step
  public void click_on_proceed_checkout_summary_button() {
    checkoutPage.clickOnProceedCheckoutSummaryButton();
  }

  @Step
  public void click_on_proceed_checkout_addr_button() {
    checkoutPage.clickOnProceedCheckoutAddrButton();
  }

  @Step
  public void click_on_terms_of_service_checkbox() {
    checkoutPage.clickOnTermsOfServiceCheckbox();
  }

  @Step
  public void click_on_proceed_checkout_shipping_button() {
    checkoutPage.clickOnProceedCheckoutShippingButton();
  }

  @Step
  public void click_on_pay_by_bank() {
    checkoutPage.clickOnPayByBank();
  }

  @Step
  public void click_on_confirm_button() {
    checkoutPage.clickOnConfirmButton();
  }

  @Step
  public void isHeaderTextCorrect(String expected) {
    assertEquals("Header text is wrong", expected, checkoutPage.getHeaderText());
  }

  @Step
  public void isShippingTabDisplayed() {
    assertTrue("Shipping tab is not displayed", checkoutPage.isShippingTabDisplayed());
  }

  @Step
  public void isLastTabDisplayed() {
    assertTrue("Last tab is not displayed", checkoutPage.isLastTabDisplayed());
  }

  @Step
  public void isConfirmationTextCorrect(String expected) {
    assertTrue("Confirmation text is wrong", checkoutPage.getConfirmationText().contains(expected));
  }
}
