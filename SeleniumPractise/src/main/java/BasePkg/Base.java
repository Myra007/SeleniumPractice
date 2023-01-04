package BasePkg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
 1. add_remove_elements Page       : Action locator test case
 2. drag_and_dropAdd Page          : Action locator test case, common utils method dragDrop

    https://www.guru99.com/drag-drop-selenium.html
 */

public class Base {

    WebDriver driver;

    public void initializeDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

    public WebDriver getDriver(){
        return driver;
    }


    public static void main(String[] args) {

        Base base = new Base();

        base.initializeDriver();
        WebDriver driver1 = base.getDriver();


    }


}
