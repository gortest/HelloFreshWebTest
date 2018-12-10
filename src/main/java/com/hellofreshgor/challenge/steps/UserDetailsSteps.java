package com.hellofreshgor.challenge.steps;


import com.hellofreshgor.challenge.pages.UserDetailsPage;
import com.hellofreshgor.challenge.testdata.CustomerData;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;

public class UserDetailsSteps {

  private UserDetailsPage userDetailsPage;

  @StepGroup
  public void fill_all_necessary_customer_date_and_submit(CustomerData data) {
    if(data.isMale()) {
      select_male();
    } else {
      select_female();
    }

    type_first_name(data.getFirstName());
    type_last_name(data.getLastName());
    type_password(data.getPassword());
    select_days(data.getBirthDay());
    select_months(data.getBirthMonth());
    select_years(data.getBirthYear());
    type_company(data.getCompany());
    type_address1(data.getAddress1());
    type_address2(data.getAddress2());
    type_city(data.getCity());
    select_state(data.getState());
    type_postal_code(data.getPostalcode());
    type_other(data.getOther());
    type_phone(data.getPhone());
    type_mobile_phone(data.getPhoneMobile());
    type_alias(data.getAlias());

    click_on_submit_button();
  }

  @Step
  public void select_male() {
    userDetailsPage.selectMale();
  }

  @Step
  public void select_female() {
    userDetailsPage.selectFemale();
  }

  @Step
  public void type_first_name(String name) {
    userDetailsPage.typeFirstName(name);
  }

  @Step
  public void type_last_name(String name) {
    userDetailsPage.typeLastName(name);
  }

  @Step
  public void type_password(String password) {
    userDetailsPage.typePassword(password);
  }

  @Step
  public void select_days(String days) {
    userDetailsPage.selectDays(days);
  }

  @Step
  public void select_months(String months) {
    userDetailsPage.selectMonths(months);
  }

  @Step
  public void select_years(String years) {
    userDetailsPage.selectYears(years);
  }

  @Step
  public void type_company(String company) {
    userDetailsPage.typeCompany(company);
  }

  @Step
  public void type_address1(String address) {
    userDetailsPage.typeAddress1(address);
  }

  @Step
  public void type_address2(String address) {
    userDetailsPage.typeAddress2(address);
  }

  @Step
  public void type_city(String city) {
    userDetailsPage.typeCity(city);
  }

  @Step
  public void select_state(String state) {
    userDetailsPage.selectState(state);
  }

  @Step
  public void type_postal_code(String postCode) {
    userDetailsPage.typePostalCode(postCode);
  }

  @Step
  public void type_other(String other) {
    userDetailsPage.typeOther(other);
  }

  @Step
  public void type_phone(String phone) {
    userDetailsPage.typePhone(phone);
  }

  @Step
  public void type_mobile_phone(String phone) {
    userDetailsPage.typeMobilePhone(phone);
  }

  @Step
  public void type_alias(String alias) {
    userDetailsPage.typeAlias(alias);
  }

  @Step
  public void click_on_submit_button() {
    userDetailsPage.clickOnSubmitButton();
  }
}
