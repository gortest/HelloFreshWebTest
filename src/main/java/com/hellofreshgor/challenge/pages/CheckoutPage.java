package com.hellofreshgor.challenge.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CheckoutPage extends PageObject {

  @FindBy(xpath = "//*[contains(@class,'cart_navigation')]/a[@title='Proceed to checkout']")
  private WebElementFacade proceedCheckoutSummaryButton;

  @FindBy(name = "processAddress")
  private WebElementFacade proceedCheckoutAddrButton;

  @FindBy(id = "uniform-cgv")
  private WebElementFacade termOfServicesCheckbox;

  @FindBy(name = "processCarrier")
  private WebElementFacade proceedCheckoutShippingButton;

  @FindBy(className = "bankwire")
  private WebElementFacade payByBank;

  @FindBy(xpath = "//*[@id='cart_navigation']/button")
  private WebElementFacade confirmButton;

  @FindBy(css = "h1")
  private WebElementFacade headerElement;

  @FindBy(xpath = "//li[@class='step_done step_done_last four']")
  private WebElementFacade shippingTab;

  @FindBy(xpath = "//li[@id='step_end' and @class='step_current last']")
  private WebElementFacade lastTab;

  @FindBy(xpath = "//*[@class='cheque-indent']/strong")
  private WebElementFacade confirmationLabel;

  public void clickOnProceedCheckoutSummaryButton() {
    proceedCheckoutSummaryButton.click();
  }

  public void clickOnProceedCheckoutAddrButton() {
    proceedCheckoutAddrButton.click();
  }

  public void clickOnTermsOfServiceCheckbox() {
    termOfServicesCheckbox.click();
  }

  public void clickOnProceedCheckoutShippingButton() {
    proceedCheckoutShippingButton.waitUntilClickable();
    proceedCheckoutShippingButton.click();
  }

  public void clickOnPayByBank() {
    payByBank.click();
  }

  public void clickOnConfirmButton() {
    confirmButton.click();
  }

  public String getHeaderText() {
    return headerElement.getText();
  }

  public boolean isShippingTabDisplayed() {
    return shippingTab.isDisplayed();
  }

  public boolean isLastTabDisplayed() {
    return lastTab.isDisplayed();
  }

  public String getConfirmationText() {
    return confirmationLabel.getText();
  }
}
