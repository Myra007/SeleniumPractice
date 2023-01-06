package Page.Actions;

import Utils.CommonUtils;
import org.openqa.selenium.WebDriver;

public class Dropdown {

    private WebDriver driver;
    private Page.Locators.Dropdown dropdownLocator;

    public Dropdown(WebDriver driver) {
        this.driver = driver;
        dropdownLocator = new Page.Locators.Dropdown(driver);
    }


    public void selectDropdown(String value) throws InterruptedException {
        CommonUtils.selectByVisibleText(dropdownLocator.getDropdown(), value);

        Thread.sleep(2000);

        CommonUtils.selectByIndex(dropdownLocator.getDropdown(), 1);

        Thread.sleep(2000);

        CommonUtils.selectByValue(dropdownLocator.getDropdown(), "2");

    }

}
