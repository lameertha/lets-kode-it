package com.uk.letskodeit.homepage;

import com.uk.letskodeit.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By emailField = By.id("user_email");
    By passwordField = By.id("user_password");
    By clickOnCommitButton = By.name("commit");
    By getLoginText = By.xpath("//h1[@class='text-center']");
    By allCourseText = By.xpath("//a[contains(text(),'All Courses')]");



    public void setEmailField() {
        sendTextToElement(emailField, "lameethev2@gmail.com");
    }

    public void setPasswordField() {
        sendTextToElement(passwordField, "123456");
    }

    public void setClickOnLoginButton() {

        clickOnElement(clickOnCommitButton);
    }

    public String getLoginWelcomeMessage() {
        return getTextFromElement(getLoginText);
    }
    public String getAllCourseMessage(){
        return getTextFromElement(allCourseText);
    }

}