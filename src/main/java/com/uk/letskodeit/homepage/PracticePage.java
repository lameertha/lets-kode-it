package com.uk.letskodeit.homepage;

import com.uk.letskodeit.utility.Utility;
import org.openqa.selenium.By;

public class PracticePage extends Utility {
    By getPracticePageText = By.xpath("//h1[contains(text(),'Practice Page')]");

    public String getPracticePageMessage() {
        return getTextFromElement(getPracticePageText);
    }
}


