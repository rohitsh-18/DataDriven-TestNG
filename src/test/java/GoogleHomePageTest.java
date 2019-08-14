import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.GoogleHomePage;

public class GoogleHomePageTest extends TestBase{
    GoogleHomePage googleHomePage = new GoogleHomePage();

    public GoogleHomePageTest() throws Exception {
    }

    @Test
    public void testGoogleSearchFeature(){
        googleHomePage.googleSearch("selenium");
    }








}
