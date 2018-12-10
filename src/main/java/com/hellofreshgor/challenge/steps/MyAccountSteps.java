package com.hellofreshgor.challenge.steps;

import com.hellofreshgor.challenge.pages.MyAccountPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import net.thucydides.core.annotations.Step;

public class MyAccountSteps {

  private MyAccountPage myAccountPage;

  @Step
  public void is_header_text_correct(String expected) {
      assertEquals("Header text is wrong", expected, myAccountPage.getHeaderText());
  }

  @Step
  public void is_account_correct(String expected) {
    assertEquals("Account should contain first name and last name",
        expected, myAccountPage.getAccountText());
  }

  @Step
  public void is_info_account_correct(String expected) {
    assertTrue("Info account text is wrong",
         myAccountPage.getInfoAccountText().contains(expected));
  }

  @Step
  public void is_logout_button_displayed() {
    assertEquals("Logout button is not displayed",
        true, myAccountPage.isLogoutDisplayed());
  }
}
