package Page.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dropdown {

    private WebDriver driver;

    public Dropdown(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[text()='Dropdown List']")
    private WebElement ddsHeader;


    @FindBy(xpath = "//select[@id='dropdown']")
    private WebElement dropdown;

    //**********************************************************************


    public WebElement getDdsHeader() {
        return ddsHeader;
    }

    public WebElement getDropdown() {
        return dropdown;
    }
}
