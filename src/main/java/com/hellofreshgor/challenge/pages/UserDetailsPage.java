package com.hellofreshgor.challenge.pages;

import com.hellofreshgor.challenge.utils.WebElementUtils;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class UserDetailsPage extends PageObject {

  @FindBy(id = "id_gender1")
  private WebElementFacade genderMale;

  @FindBy(id = "id_gender2")
  private WebElementFacade genderFemale;

  @FindBy(id = "customer_firstname")
  private WebElementFacade firstNameField;

  @FindBy(id = "customer_lastname")
  private WebElementFacade lastNameField;

  @FindBy(id = "passwd")
  private WebElementFacade passwordField;

  @FindBy(id = "company")
  private WebElementFacade companyField;

  @FindBy(id = "address1")
  private WebElementFacade address1;

  @FindBy(id = "address2")
  private WebElementFacade address2;

  @FindBy(id = "city")
  private WebElementFacade cityField;

  @FindBy(id = "postcode")
  private WebElementFacade postCodeField;

  @FindBy(id = "other")
  private WebElementFacade otherField;

  @FindBy(id = "phone")
  private WebElementFacade phoneField;

  @FindBy(id = "phone_mobile")
  private WebElementFacade phoneMobileField;

  @FindBy(id = "alias")
  private WebElementFacade aliasField;

  @FindBy(id = "submitAccount")
  private WebElementFacade submitAccountButton;

  private String daysID = "days";
  private String monthsID = "months";
  private String yearsID = "years";
  private String stateID = "id_state";

  public void selectMale() {
    genderMale.waitUntilClickable();
    genderMale.click();
  }

  public void selectFemale() {
    genderFemale.click();
  }

  public void typeFirstName(String name) {
    firstNameField.type(name);
  }

  public void typeLastName(String name) {
    lastNameField.type(name);
  }

  public void typePassword(String password) {
    passwordField.type(password);
  }

  public void selectDays(String days) {
    WebElementUtils.selectByValue(getDriver(), daysID, days);
  }

  public void selectMonths(String months) {
    WebElementUtils.selectByValue(getDriver(), monthsID, months);

  }

  public void selectYears(String years) {
    WebElementUtils.selectByValue(getDriver(), yearsID, years);
  }

  public void typeCompany(String company) {
    companyField.type(company);
  }

  public void typeAddress1(String address) {
    address1.type(address);
  }

  public void typeAddress2(String address) {
    address2.type(address);
  }

  public void typeCity(String city) {
    cityField.type(city);
  }

  public void selectState(String state) {
    WebElementUtils.selectByVisibleText(getDriver(), stateID, state);
  }

  public void typePostalCode(String postCode) {
    postCodeField.type(postCode);
  }

  public void typeOther(String other) {
    otherField.type(other);
  }

  public void typePhone(String phone) {
    phoneField.type(phone);
  }

  public void typeMobilePhone(String phone) {
    phoneMobileField.type(phone);
  }

  public void typeAlias(String alias) {
    aliasField.type(alias);
  }

  public void clickOnSubmitButton() {
    submitAccountButton.waitUntilClickable();
    submitAccountButton.click();
  }

}
