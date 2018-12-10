package com.hellofreshgor.challenge;

import com.hellofreshgor.challenge.steps.AuthenticationSteps;
import com.hellofreshgor.challenge.steps.CatalogSteps;
import com.hellofreshgor.challenge.steps.CheckoutSteps;
import com.hellofreshgor.challenge.steps.HeaderSteps;
import com.hellofreshgor.challenge.steps.HomeSteps;
import com.hellofreshgor.challenge.steps.OrderConfirmationSteps;
import com.hellofreshgor.challenge.steps.ProductDetailsSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "./src/main/resources/testdata.csv")
public class CheckoutTest {

  private String userName;
  private String userPassword;
  private String fullName;

  @Managed
  private WebDriver webdriver;

  @Steps
  private HomeSteps homeSteps;

  @Steps
  private AuthenticationSteps authenticationSteps;

  @Steps
  private HeaderSteps headerSteps;

  @Steps
  private CatalogSteps catalogSteps;

  @Steps
  private ProductDetailsSteps productDetailsSteps;

  @Steps
  private OrderConfirmationSteps orderConfirmationSteps;

  @Steps
  private CheckoutSteps checkoutSteps;

  @Before
  public void loginWithTheExistingUser() {
    homeSteps.open_page();
    headerSteps.click_on_login_button();
    authenticationSteps.set_login_email(userName);
    authenticationSteps.set_login_password(userPassword);
    authenticationSteps.click_on_login_button();
  }

  @Test
  public void checkoutTest() {
    final String expectedHeader = "ORDER CONFIRMATION";
    final String expectedConfirmation = "Your order on My Store is complete.";

    headerSteps.click_on_women_link();
    catalogSteps.click_on_faded_short_shirt_element();
    catalogSteps.click_on_faded_short_shirt_element();
    productDetailsSteps.click_on_add_to_tart_button();
    orderConfirmationSteps.click_on_proceed_checkout_button();
    checkoutSteps.click_on_proceed_checkout_summary_button();
    checkoutSteps.click_on_proceed_checkout_addr_button();
    checkoutSteps.click_on_terms_of_service_checkbox();
    checkoutSteps.click_on_proceed_checkout_shipping_button();
    checkoutSteps.click_on_pay_by_bank();
    checkoutSteps.click_on_confirm_button();

    checkoutSteps.isHeaderTextCorrect(expectedHeader);
    checkoutSteps.isShippingTabDisplayed();
    checkoutSteps.isLastTabDisplayed();
    checkoutSteps.isConfirmationTextCorrect(expectedConfirmation);
  }
}
