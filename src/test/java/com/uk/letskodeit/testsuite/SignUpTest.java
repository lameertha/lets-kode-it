package com.uk.letskodeit.testsuite;

import com.uk.letskodeit.homepage.HomePage;
import com.uk.letskodeit.homepage.SignUpPage;
import com.uk.letskodeit.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends TestBase {
    HomePage homePage = new HomePage();
    SignUpPage signUpPage = new SignUpPage();

    @Test
    public void verifyUserShouldNavigateToSignUpPage(){
        homePage.clickOnSignUpLink();
        String expectedResult = "Sign Up to Let's Kode It";
        String actualResult = signUpPage.getSignUpText();
        Assert.assertEquals(expectedResult,actualResult);


    }
}

