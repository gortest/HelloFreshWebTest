package com.hellofreshgor.challenge;

import com.hellofreshgor.challenge.steps.AuthenticationSteps;
import com.hellofreshgor.challenge.steps.HeaderSteps;
import com.hellofreshgor.challenge.steps.HomeSteps;
import com.hellofreshgor.challenge.steps.MyAccountSteps;
import com.hellofreshgor.challenge.steps.UserDetailsSteps;
import com.hellofreshgor.challenge.testdata.CustomerData;
import com.hellofreshgor.challenge.testdata.CustomerDataBuilder;
import com.hellofreshgor.challenge.utils.EmailUtils;
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
public class UserAuthenticationTest {

  private String userName;
  private String userPassword;
  private String fullName;

  private final String expectedHeaderText = "MY ACCOUNT";
  private final String expectedInfoAccount = "Welcome to your account.";

  @Managed
  private WebDriver webdriver;

  @Steps
  private HeaderSteps headerSteps;

  @Steps
  private HomeSteps homeSteps;

  @Steps
  private AuthenticationSteps authenticationSteps;

  @Steps
  private UserDetailsSteps userDetailsSteps;

  @Steps
  private MyAccountSteps myAccountSteps;

  @Before
  public void goToLogin() {
    homeSteps.open_page();
    headerSteps.click_on_login_button();
  }

  @Test
  public void registerNewUser() {
    final String email = EmailUtils.generateEmail();
    CustomerData customerData = CustomerDataBuilder.buildCustomerData();
    final String expectedAccount = customerData.getFirstName() + " " + customerData.getLastName();

    authenticationSteps.set_user_email(email);
    authenticationSteps.click_on_submit_button();

    userDetailsSteps.fill_all_necessary_customer_date_and_submit(customerData);

    assertMyAccountPage(expectedAccount);
  }

  @Test
  public void logInWithExistingUser() {
    authenticationSteps.set_login_email(userName);
    authenticationSteps.set_login_password(userPassword);
    authenticationSteps.click_on_login_button();

    assertMyAccountPage(fullName);
  }

  private void assertMyAccountPage(String expectedFullName) {
    myAccountSteps.is_header_text_correct(expectedHeaderText);
    myAccountSteps.is_account_correct(expectedFullName);
    myAccountSteps.is_info_account_correct(expectedInfoAccount);
    myAccountSteps.is_logout_button_displayed();
  }
}
