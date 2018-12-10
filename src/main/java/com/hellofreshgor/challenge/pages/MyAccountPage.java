package com.hellofreshgor.challenge.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@At("#HOST" + MyAccountPage.DEFAULT_URL)
@DefaultUrl(MyAccountPage.DEFAULT_URL)
public class MyAccountPage extends PageObject {

  public static final String DEFAULT_URL = "/index.php?controller=my-account";

  @FindBy(css = "h1")
  private WebElementFacade headerElement;

  @FindBy(className = "account")
  private WebElementFacade accountName;

  @FindBy(className = "info-account")
  private WebElementFacade infoAccount;

  @FindBy(className = "logout")
  private WebElementFacade logoutButton;

  public String getHeaderText() {
    return headerElement.getText();
  }

  public String getAccountText() {
    return accountName.getText();
  }

  public String getInfoAccountText() {
    return infoAccount.getText();
  }

  public boolean isLogoutDisplayed() {
    return logoutButton.isDisplayed();
  }

}
