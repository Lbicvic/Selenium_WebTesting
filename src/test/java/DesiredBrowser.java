import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DesiredBrowser {
    private WebDriver webDriver;
    private String name;
    public WebDriver setWebDriver( String browser){
        if(browser== "chrome"){
            System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
            webDriver= new ChromeDriver();
            name="Chrome";
            return webDriver;
        }
        else if(browser == "firefox"){
            System.setProperty("webdriver.gecko.driver", "C://drivers//geckodriver.exe");
            webDriver= new FirefoxDriver();
            name="FireFox";
            return webDriver;
        }
        return null;
    }
}
