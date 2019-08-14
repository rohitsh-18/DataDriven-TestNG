package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.config.Driver;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    private static By usertextbox = By.xpath("//input[@id='email']");
    private static By pswtextbox = By.xpath("//input[@id='password']");
    private static By loginbtn = By.xpath("//input[@id='siteLogin']");
    private static By clicktopbar = By.xpath("//*[@id=login_user_name_topbar]");


    public void logininSouq(String username, String password){
        Driver.driver.findElement(usertextbox).sendKeys(username);
        Driver.driver.findElement(loginbtn).click();
        Driver.driver.findElement(pswtextbox).sendKeys(password);
        Driver.driver.findElement(loginbtn).click();


    }
}
