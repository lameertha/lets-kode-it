package com.uk.letskodeit.homepage;

import com.uk.letskodeit.utility.Utility;
import org.openqa.selenium.By;

public class SignUpPage extends Utility {
    By getSignUpMessage = By.xpath("//h1[contains(text(),\"Sign Up to Let's Kode It\")]");

    public String getSignUpText() {
        return getTextFromElement(getSignUpMessage);
    }
}

