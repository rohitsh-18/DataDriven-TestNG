import org.testng.annotations.BeforeSuite;
import utils.config.Driver;

public class TestBase {

    @BeforeSuite
    public void setUp() throws Exception {
        Driver.setWebdriver();
    }
}
