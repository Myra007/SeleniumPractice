package Page.Actions;

import Utils.CommonUtils;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private Page.Locators.HomePage homePage;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        homePage = new Page.Locators.HomePage(driver);
    }

    public CheckBox goToCheckBoxPage() {
        System.out.println("Navigating to CB page");
        CommonUtils.click(homePage.getCheckBoxLink());
        return new CheckBox(driver);
    }

    public Dropdown goToDropdownPage() {
        System.out.println("Navigating to Dropdown page");
        CommonUtils.click(homePage.getDropdownLink());
        return new Dropdown(driver);
    }
}
