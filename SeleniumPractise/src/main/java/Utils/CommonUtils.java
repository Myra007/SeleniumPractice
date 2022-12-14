package Utils;

import org.openqa.selenium.WebElement;

public class CommonUtils {

    public static void click(WebElement element){
        System.out.println("Clicking on WebElement");
        element.click();
    }


    public static String getText(WebElement element){
        System.out.println("getting the text of WebElement");
        return element.getText();
    }

    public static void selectByValue(WebElement dropdown, String value){

    }
}
