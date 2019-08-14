import org.testng.annotations.Test;
import pageobjects.LoginPage;
import utils.TestDataProvider;

public class SouqLoginPageTest extends TestBase {

    LoginPage souqLoginPage = new LoginPage();

    @Test(dataProviderClass = TestDataProvider.class,dataProvider ="login")
    public void testloginsouq(String userName, String password){
        souqLoginPage.logininSouq(userName, password);
    }

}
