package com.uk.letskodeit.testsuite;

import com.uk.letskodeit.homepage.HomePage;
import com.uk.letskodeit.homepage.LoginPage;
import com.uk.letskodeit.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class  LoginPageTest extends TestBase{
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserCanNavigateToLoginPage() {
        homePage.clickOnLogin();
        String expectedResult = "Log In to Let's Kode It";
        String actualResult = loginPage.getLoginWelcomeMessage();
        Assert.assertEquals(expectedResult, actualResult);
    }


}
