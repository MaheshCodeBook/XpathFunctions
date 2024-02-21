import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsTest {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qatabs.ccbp.tech/");

        WebElement about = driver.findElement(By.xpath("//button[starts-with(@id,'about')]"));
        about.click();

        WebElement aboutContent = driver.findElement(By.xpath("//div[starts-with(@id,'about')]//p"));
        String actualContent = aboutContent.getText();
        String expectedContent = "Varanasi is one of the oldest living cities in the world. Its Prominence in Hindu mythology is virtually unrevealed. Mark Twain, the English author and literature, who was enthralled by the legend and sanctity of Benaras, once wrote, \"Benaras is older than history, older than tradition, older even than legend and looks twice as old as all of them put together\".";

        if(expectedContent.equals(actualContent)){
            System.out.println("About Content Matched");
        }else{
            System.out.println("Mismatch in the 'About");
        }

        WebElement timeToVisit = driver.findElement(By.xpath("//button[starts-with(@id,'timeToVisit')]"));
        timeToVisit.click();

        WebElement timeToVisitContent = driver.findElement(By.xpath("//div[starts-with(@id,'timeToVisit')]//p"));
        String actualTimeVisitContent = timeToVisitContent.getText();
        String expectedTimeVisitContent = "October to March is the best time to visit Varanasi because most of the fairs here are held during this time of the year. Festivities begin with Diwali and continue to Dev Diwali celebrated on the 15th day from Diwali. In between, there is also Annakut. During this time, the ghats are lit with lights and diyas. Earthen lamps adorn the staircase of the ghats and are also afloat in the river. Firecrackers burn through the night, and it's a sight no one should miss.";

        if(actualTimeVisitContent.equals(expectedTimeVisitContent)){
            System.out.println("Time to Visit Content Matched");
        }else{
            System.out.println("Mismatch in the 'Time to Visit' Content");

        }

        WebElement atractionsButton = driver.findElement(By.xpath("//button[starts-with(@id,'attractions')]"));
        atractionsButton.click();

        WebElement attractionContent = driver.findElement(By.xpath("//div[starts-with(@id,'attractions')]//p"));
        String actualAttractionContent = attractionContent.getText();
        String expectedAttractionContent = "When visiting Varanasi, one comes across plenty of ghats, but among them, Dashashwamedh Ghat is said to be one of the oldest and most important. This ghat, leading to the Ganges, is located close to the famous old Vishwanath temple in Kashi (today’s Banaras). Another famous attraction is River Ganges which is the holiest river by the Hindus and many more.";
        if(expectedAttractionContent.equals(actualAttractionContent)){
            System.out.println("Attractions Content Matched");
        }else{
            System.out.println("Mismatch in the 'Attractions' Content");
        }

        driver.quit();

    }
}
