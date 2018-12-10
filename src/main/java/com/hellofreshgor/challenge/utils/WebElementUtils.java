package com.hellofreshgor.challenge.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementUtils {

  public static void selectByValue(WebDriver driver, String id, String value) {
    Select select = new Select(driver.findElement(By.id(id)));
    select.selectByValue(value);
  }

  public static void selectByVisibleText(WebDriver driver, String id, String text) {
    Select select = new Select(driver.findElement(By.id(id)));
    select.selectByVisibleText(text);
  }
}
