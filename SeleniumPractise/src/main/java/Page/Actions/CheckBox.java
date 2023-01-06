package Page.Actions;

import Utils.CommonUtils;
import org.openqa.selenium.WebDriver;

public class CheckBox {

    private WebDriver driver;
    private Page.Locators.CheckBox checkBoxLocatorObj;

    public CheckBox(WebDriver driver) {
        this.driver = driver;
        checkBoxLocatorObj = new Page.Locators.CheckBox(driver);
    }

    public String getPageHeader() {
        return CommonUtils.getText(checkBoxLocatorObj.getPageHeader());
    }


    public void selectCheckBox() {
        CommonUtils.click(checkBoxLocatorObj.getFirstCheckbox());
    }

}
