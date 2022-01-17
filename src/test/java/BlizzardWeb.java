import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class BlizzardWeb {
    private WebDriver webDriver;
    public BlizzardWeb(WebDriver driver){
        webDriver=driver;
    }
    public void selectTestGame(){
        WebElement dropDownGames = webDriver.findElement(By.xpath("/html/body/div[3]/div/nav/div[2]/div[3]/div[3]/a[1]"));
        dropDownGames.click();
        webDriver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        WebElement game= webDriver.findElement(By.xpath("/html/body/div[3]/div/nav/div[3]/div[1]/div[2]/div/div/div[1]/div[4]/a[1]"));
        game.click();
    }
    public void clickNewsButton(){
        WebElement news = webDriver.findElement(By.xpath("/html/body/div[3]/div/nav/div[2]/div[3]/div[3]/a[3]"));
        news.click();
    }
    public void selectWoWNews(){
        WebElement dropdownNews= webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/div/nav/button"));
        dropdownNews.click();
        webDriver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        WebElement chosenGame= webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/div/nav/div/div/div[2]/div/ul/li[11]/a"));
        chosenGame.click();
    }
    public void selectLatestArticle(){
        WebElement newestArticle= webDriver.findElement(By.xpath("/html/body/div[3]/div[4]/div[2]/div[2]/div/div/section/ol/li[1]/article/a"));
        newestArticle.click();
    }
    public void selectShop(){
        WebElement shop = webDriver.findElement(By.xpath("/html/body/div[3]/div/nav/div[2]/div[3]/div[3]/a[2]"));
        shop.click();
    }
    public void selectChosenGameInShop(){
        WebElement chosenGame= webDriver.findElement(By.xpath("/html/body/storefront-root/storefront-home-page/div/main/section/storefront-family-bar/nav/div/div/div/storefront-link[12]/a"));
        chosenGame.click();
    }
    public void selectGameEdition(){
        WebElement chosenGameEdition= webDriver.findElement(By.xpath("/html/body/storefront-root/storefront-browsing-page/div/main/div/storefront-browsing-card-group[1]/div/section/storefront-browsing-card-group-animated/ul/li[1]/storefront-browsing-card/div/storefront-link/a"));
        chosenGameEdition.click();
    }
    public void selectSystemReq(){
        WebElement systemRequirements= webDriver.findElement(By.xpath("//*[@id=\"skipToSystemRequirements\"]"));
        systemRequirements.click();
    }
    public void chooseTournamentSchedule(){
        WebElement esports = webDriver.findElement(By.xpath("/html/body/div[3]/div/nav/div[2]/div[3]/div[3]/a[4]"));
        esports.click();
        WebElement chosenEsportTournament= webDriver.findElement(By.xpath("/html/body/div[3]/div/nav/div[3]/div[2]/div[2]/div/div/a[3]"));
        chosenEsportTournament.click();
    }
    public void selectActiveSchedule(){
        WebElement schedule= webDriver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/ul/li[5]/a"));
        schedule.click();
        webDriver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        WebElement activeSchedule= webDriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[1]/div[2]/div/div/div[1]/ul/li[4]/div/a[2]"));
        activeSchedule.click();
    }
    public String getTournamentStatus(){
        WebElement tournamentStatus= webDriver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[1]/div[2]/div/div/div[4]/div[2]/div/div/a/div[1]/span[2]/div/div[2]"));
        return tournamentStatus.getText();
    }
    public void selectNotBlizzardCustomer(){
        WebElement support = webDriver.findElement(By.xpath("/html/body/div[3]/div/nav/div[2]/div[3]/div[4]/a[1]"));
        support.click();
        webDriver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        WebElement buttonNoAccount= webDriver.findElement(By.xpath("/html/body/div[3]/div[4]/div[1]/div/div[2]/div/div/div/p[4]/a"));
        buttonNoAccount.click();
    }
    public void selectContactUs(){
        WebElement contactUs= webDriver.findElement(By.xpath("/html/body/div[3]/div[4]/app-root/ng-component/sp-timeline/section/sp-bft-completion/div/a"));
        contactUs.click();
    }
    public void fillTicket(){
        WebElement name=webDriver.findElement(By.xpath("//*[@id=\"name\"]"));
        name.sendKeys("User1234");
        WebElement email = webDriver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("herewego@gmail.com");
        WebElement phone = webDriver.findElement(By.xpath("//*[@id=\"phone-details\"]"));
        phone.sendKeys("1212345678");
        WebElement description = webDriver.findElement(By.xpath("//*[@id=\"description\"]"));
        description.sendKeys("Winter is coming");
    }

}
