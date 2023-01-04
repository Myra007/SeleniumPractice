package testCases;

import BasePkg.Base;
import Page.Actions.CheckBox;
import Page.Actions.Dropdown;
import Page.Actions.HomePage;
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
        HomePage homePage = new HomePage(driver);
        CheckBox cbAction = homePage.goToCheckBoxPage();
        System.out.println("Printing page header");
        System.out.println(cbAction.getPageHeader());
    }

    @Test
    public void verifySelectCheckBoxFunctionality() {
        System.out.println("Test case 2");
        HomePage homePage = new HomePage(driver);
        CheckBox cbAction = homePage.goToCheckBoxPage();
        System.out.println("Selecting the Checkbox");
        cbAction.selectCheckBox();
    }



    @Test
    public void verifySelectDropdownFunctionality() throws InterruptedException {
        System.out.println("Test case 3");
        HomePage homePage = new HomePage(driver);
        Dropdown dropdown = homePage.goToDropdownPage();
        dropdown.selectDropdown("Option 2");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

