package com.hellofreshgor.challenge.testdata;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CustomerData {

  private boolean isMale;
  private String firstName;
  private String lastName;
  private String birthDay;
  private String birthMonth;
  private String birthYear;
  private String company;
  private String address1;
  private String address2;
  private String city;
  private String state;
  private String postalcode;
  private String password;
  private String other;
  private String phone;
  private String phoneMobile;
  private String alias;

}
