package com.example;

import org.openqa.selenium.By;

public class PracticeFormLocators {
    public static final By FIRST_NAME_INPUT = By.xpath("//*[@id=\"firstName\"]");
    public static final By LAST_NAME_INPUT = By.xpath("//*[@id=\"lastName\"]");
    public static final By EMAIL_INPUT = By.xpath("//*[@id=\"userEmail\"]");
    public static final By GENDER_RADIO = By.xpath(("//label[@for=\"gender-radio-2\"]"));
    public static final By MOBILE_INPUT = By.xpath("//*[@id=\"userNumber\"]");
    public static final By SUBMIT_BUTTON = By.xpath("//*[@id=\"submit\"]");
}
