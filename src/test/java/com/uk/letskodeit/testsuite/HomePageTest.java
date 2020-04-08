package com.uk.letskodeit.testsuite;

import com.uk.letskodeit.homepage.HomePage;
import com.uk.letskodeit.testbase.TestBase;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserCanNavigateTomyCoursePage() {
        homePage.clickOnLogin();
    }@Test
    public void verifyUserCanNavigateToallCoursePage(){
        homePage.clickOnPracticeLink();
    }@Test
    public void verifyUserShouldNavigateTopracticePage(){
        homePage.clickOnSignUpLink();
    }



}
