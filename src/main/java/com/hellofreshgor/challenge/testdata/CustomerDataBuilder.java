package com.hellofreshgor.challenge.testdata;

import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDate;

public class CustomerDataBuilder {

  private static final int DEFAULT_GENERATED_DATA_LENGTH = 10;
  private static final int DEFAULT_CUSTOMER_AGE = 30;

  public static CustomerData buildCustomerData() {

    LocalDate date = LocalDate.now().minusYears(DEFAULT_CUSTOMER_AGE);

    CustomerData customerData = CustomerData.builder().isMale(false)
        .firstName(RandomStringUtils.randomAlphabetic(DEFAULT_GENERATED_DATA_LENGTH))
        .lastName(RandomStringUtils.randomAlphabetic(DEFAULT_GENERATED_DATA_LENGTH))
        .company(RandomStringUtils.randomAlphabetic(DEFAULT_GENERATED_DATA_LENGTH))
        .address1("Danziger str. 111")
        .address2("apt 33")
        .city("Berlin")
        .state("Alabama")
        .postalcode("10432")
        .password("FakePass*1")
        .other(RandomStringUtils.randomAlphabetic(DEFAULT_GENERATED_DATA_LENGTH))
        .phone("089118765")
        .phoneMobile("089118766")
        .alias(RandomStringUtils.randomAlphabetic(DEFAULT_GENERATED_DATA_LENGTH))
        .birthDay(date.getDayOfMonth() + "")
        .birthMonth(date.getMonthValue() + "")
        .birthYear(date.getYear() + "").build();

    return customerData;
  }
}
