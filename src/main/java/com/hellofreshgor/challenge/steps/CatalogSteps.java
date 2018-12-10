package com.hellofreshgor.challenge.steps;

import com.hellofreshgor.challenge.pages.CatalogPage;
import net.thucydides.core.annotations.Step;

public class CatalogSteps {

  private CatalogPage catalogPage;

  @Step
  public void click_on_faded_short_shirt_element() {
    catalogPage.clickOnFadedShortShirtElement();
  }
}
