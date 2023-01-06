package Page.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBox {

    private WebDriver driver;

    public CheckBox(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//form[@id='checkboxes']/input)[1]")
    private WebElement firstCheckbox;

    @FindBy(xpath = "//h3[text()='Checkboxes']")
    private WebElement pageHeader;


    //**********************************************************************

    public WebElement getFirstCheckbox() {
        return firstCheckbox;
    }

    public WebElement getPageHeader() {
        return pageHeader;
    }
}

