package com.hellofreshgor.challenge.steps;

import com.hellofreshgor.challenge.pages.ProductDetailsPage;
import net.thucydides.core.annotations.Step;

public class ProductDetailsSteps {

  private ProductDetailsPage productDetailsPage;

  @Step
  public void click_on_add_to_tart_button() {
    productDetailsPage.clickOnAddToCartButton();
  }
}
