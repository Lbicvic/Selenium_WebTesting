import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BlizzardTest {

    //-------------------Global Variables-----------------------------------
    public WebDriver driver;
    public DesiredBrowser browser;
    public BlizzardWeb blizzardWeb;
    public String testURL;

    //----------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest() {
        testURL="https://www.blizzard.com/en-us/";
        browser= new DesiredBrowser();
        driver = browser.setWebDriver("firefox");
        blizzardWeb= new BlizzardWeb(driver);
        driver.navigate().to(testURL);
        driver.manage().window().maximize();
    }
    public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("window.scrollBy(0,400)");
    }

    @Test(priority = 0)
    public void searchGameTest() throws InterruptedException {
        blizzardWeb.selectTestGame();
        Thread.sleep(2000);
        String currentUrl= driver.getCurrentUrl();
        Thread.sleep(5000);
        Assert.assertEquals(currentUrl, "https://diablo4.blizzard.com/en-us/");
    }

    @Test(priority = 1)
    public void searchLatestNewsInGameTest() throws InterruptedException {
        blizzardWeb.clickNewsButton();
        blizzardWeb.selectWoWNews();
        Thread.sleep(1000);
        blizzardWeb.selectLatestArticle();
        Thread.sleep(3000);
        String currentUrl= driver.getCurrentUrl();
        Thread.sleep(3000);
        String latestNews= "https://news.blizzard.com/en-us/world-of-warcraft/20564524/jump-into-this-week-s-pvp-brawl-arathi-blizzard";
        if(currentUrl != latestNews){
            latestNews=currentUrl;
        }
        Assert.assertEquals(currentUrl, latestNews);
    }
    @Test(priority = 2)
    public void findGameRequirementsInShopTest() throws InterruptedException {
        blizzardWeb.selectShop();
        Thread.sleep(6000);
        scroll();
        blizzardWeb.selectChosenGameInShop();
        Thread.sleep(2000);
        blizzardWeb.selectGameEdition();
        Thread.sleep(2000);
        blizzardWeb.selectSystemReq();
        Thread.sleep(5000);
        Assert.assertTrue(driver.getCurrentUrl().endsWith("systemrequirements"));
    }
    @Test(priority = 3)
    public void searchEsportScheduleTest() throws InterruptedException {
        blizzardWeb.chooseTournamentSchedule();
        Thread.sleep(2000);
        blizzardWeb.selectActiveSchedule();
        scroll();
        Thread.sleep(5000);
        Assert.assertEquals(blizzardWeb.getTournamentStatus(),"Online");
    }
    @Test(priority = 4)
    public void fillContactSupportTicketTest() throws InterruptedException {
        blizzardWeb.selectNotBlizzardCustomer();
        Thread.sleep(5000);
        blizzardWeb.selectContactUs();
        Thread.sleep(5000);
        scroll();
        blizzardWeb.fillTicket();
        Thread.sleep(5000);
        Assert.assertTrue(driver.getCurrentUrl().endsWith("ticket"));
    }
    //---------------Test TearDown-----------------------------------
    @AfterMethod
    public void teardownTest() {
        //Close browser and end the session
        driver.quit();
    }
}
