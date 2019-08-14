package pageobjects;
import org.openqa.selenium.By;
import utils.config.Driver;

public class GoogleHomePage{

    public GoogleHomePage() throws Exception {
    }

    private static By searchBar = By.xpath("//input[@name='q']");
    private static By searchButton = By.xpath("//input[@name='btnK']");

    public void googleSearch(String searchKeyword){
        Driver.driver.findElement(searchBar).sendKeys(searchKeyword);
        Driver.driver.findElement(searchButton).click();
    }


}
