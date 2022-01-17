# Selenium Testing Blizzard Website
Project was based on frontend testing of Blizzard Entertainment website.
Base URL of their official website is: <https://www.blizzard.com/en-us/>

**Test cases that are included in this project are:**
1. searchGame
   - Main goal of this test is to find chosen game by clicking button in
   navigation bar and select chosen game (in this case, Diablo 4). After that,
   result is shown and current URL is compared to expected URL. 
2. searchLatestNewsInGame
   - Main goal of this test is based on finding latest news in specific
   game called World of Warcraft. In the time of making this test, expected 
   latest news were the ones that are now in the variable latestNews. That
   happened becasue of constant adding of other latest news. So this test was
   refactored to be able to have newest latest news every time Blizzard adds other
   news of specific game.
   - So, procedure in this test goes as follows:
     - Click button News in navigation bar
     - Select All News and within that element select World of Warcraft
     - After that, under the recent news it will select first element as latest News
     - Results are shown and compared to expected
3. findGameRequirementsInShop
   - Goal of this test is to display chosen game system requirements through shop. First,
   the button Shop in navigation bar is clicked. Second, the button of chosen game
   in shop is selected and also after that chosen edition of the game. Last thing
   is to click on a button System Requirements and the results will be shown. After that,
   the URL is checked if it is true.
4. searchEsportSchedule
   - Main goal of this test is to check the upcoming tournament status in the schedule.
   It works by clicking the button Esports in the navigation bar and then selecting chosen
   tournament which is in this case Hearthstone Masters. Next is clicking the button Schedule
   and after that select Master Tour. Results are shown and status of the upcoming tournament
   is compared to expected. To be true, it has to be status Online.
5. fillContactSupportTicket
   - Goal of this test is to go to support ticket and fill it out without using blizzard account.
   This test works by clicking the button Support, after that clicking on a Not a Blizzard customer?
   than pressing button Contact us and after few moments the inputs are filled with given data. The
   results are shown and URL of the filled support ticket is checked if it is true.

To use this project, You need to clone this repository and open the project in **IntelliJ IDEA**.
Also, You will need to download chosen Web driver (it is recommended to download both web drivers
to be able to run in both browsers) and save it to chosen path.

Links to drivers:
- **CHROME**: <https://chromedriver.chromium.org/downloads>
- **FIREFOX**: <https://github.com/mozilla/geckodriver/releases>

If You want to stick with the given code save the drivers to **C://drivers**, 
otherwise You need to change the path of the drivers in **DesiredBrowser** class to chosen path.

After all that, to use chosen browser You need to write **name** of the browser in a method **setWebDriver** within **setupTest** method of the **BlizzardTest** class.

To run test, just right click on class **BlizzardTest** in **src/test/java** and select option **Run 'BlizzardTest'**.
Another way to run test is through terminal which can be found in the footer of IntelliJ IDEA and write **mvn test**.
After that, use **ctrl+Enter** to initiate test. This way of running the test will create report file
which contains details about the test cases. Report can be found in **target/surefire-reports/index.html**.

To view a report, just right click on index.html and open in browser.


