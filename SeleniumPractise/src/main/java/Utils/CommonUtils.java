package Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtils {

    public static void click(WebElement element) {
        System.out.println("Clicking on WebElement");
        element.click();
    }


    public static String getText(WebElement element) {
        System.out.println("getting the text of WebElement");
        return element.getText();
    }

    /**
     * This method will select a value in dropdown based on value
     *
     * @param dropdown dropdown
     * @param value    value
     */
    public static void selectByValue(WebElement dropdown, String value) {
        Select select = new Select(dropdown);
        System.out.println("Selecting Dropdown by value");
        select.selectByValue(value);
    }

    public static void selectByVisibleText(WebElement dropdown, String text) {
        Select select = new Select(dropdown);
        System.out.println("Selecting Dropdown by text");
        select.selectByVisibleText(text);
    }

    public static void selectByIndex(WebElement dropdown, int index) {
        Select select = new Select(dropdown);
        System.out.println("Selecting Dropdown by index");
        select.selectByIndex(index);
    }


    public static void clearAndSetText(WebElement element, String text) {
        System.out.println("Entering the text : " + text);
        element.clear();
        element.sendKeys(text);
    }

}
