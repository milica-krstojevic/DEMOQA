package com.example;

import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest {

    @Test
    public void testSubmitForm() {
        PracticeFormPage formPage = new PracticeFormPage(driver);
        formPage.open();
        formPage.fillForm("Milica", "Krstojevic", "milica@example.com", "1234567890");
        formPage.submitForm();
    }
}