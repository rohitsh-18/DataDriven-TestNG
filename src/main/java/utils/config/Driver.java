package utils.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.Utility;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver driver;

    public static void setWebdriver() throws Exception {
    GlobalProperties properties = new GlobalProperties();
    Utility.loadPropertiesObjectInHashMap(Utility.readProperitesFile(), GlobalProperties.propMap);

        if (GlobalProperties.propMap.get("browserName").equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", GlobalProperties.chromeDriverPathWindows);
            driver = new ChromeDriver();
        }
        driver.get(GlobalProperties.propMap.get("applicationURL"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
    }

    public static void doubleClick(By element){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(String.valueOf(element)))).doubleClick().build().perform();


    }


}
