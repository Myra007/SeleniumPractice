package testCases;

import BasePkg.Base;
import Page.Actions.CheckBox;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sanity {

    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        System.out.println("HEYY MEERA!!");
        Base base = new Base();
        base.initializeDriver();
        driver = base.getDriver();
    }

    @Test
    public void verifyCheckBoxFunctionality() {
        System.out.println("Test case 1");
        CheckBox cbAction = new CheckBox(driver);
        System.out.println("Printing page header");
        System.out.println(cbAction.getPageHeader());
    }

    @Test
    public void verifySelectCheckBoxFunctionality() {
        System.out.println("Test case 2");
        CheckBox cbAction = new CheckBox(driver);
        System.out.println("Selecting the Checkbox");
        cbAction.selectCheckBox();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

