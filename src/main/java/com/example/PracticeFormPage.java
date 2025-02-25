package com.example;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeFormPage {
    private WebDriver driver;

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://demoqa.com/automation-practice-form");
    }

    public void fillForm(String firstName, String lastName, String email, String mobile) {
        driver.findElement(PracticeFormLocators.FIRST_NAME_INPUT).sendKeys(firstName);
        driver.findElement(PracticeFormLocators.LAST_NAME_INPUT).sendKeys(lastName);
        driver.findElement(PracticeFormLocators.EMAIL_INPUT).sendKeys(email);

        // Čekaj dok dugme za "Gender" postane klikabilno
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Povećaj timeout ako je potrebno
        WebElement genderRadioButton = wait.until(ExpectedConditions.elementToBeClickable(PracticeFormLocators.GENDER_RADIO));
        
        try {
            genderRadioButton.click();
        } catch (Exception e) {
            // Ako standardni click ne radi, koristi JavaScriptExecutor 
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", genderRadioButton);
        }

        driver.findElement(PracticeFormLocators.MOBILE_INPUT).sendKeys(mobile);
    }

    public void submitForm() {
        // Čekaj dok dugme za "Submit" postane klikabilno
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Povećaj timeout ako je potrebno
        WebElement genderSubmitButton = wait.until(ExpectedConditions.elementToBeClickable(PracticeFormLocators.SUBMIT_BUTTON));
        
        try {
            genderSubmitButton.click();
        } catch (Exception e) {
            // Ako standardni click ne radi, koristi JavaScriptExecutor 
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", genderSubmitButton);
        }

        
    }
}
