package Page.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Checkboxes']")
    private WebElement checkBoxLink;


    @FindBy(xpath = "//a[text()='Dropdown']")
    private WebElement dropdownLink;

    //**********************************************************************

    public WebElement getCheckBoxLink(){
        return checkBoxLink;
    }

    public WebElement getDropdownLink() {
        return dropdownLink;
    }
}
