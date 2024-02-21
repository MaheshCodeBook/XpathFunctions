import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickCounterTest {
    public static void main(String[] args){
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://qaclickcounter.ccbp.tech/");

            WebElement clickButton = driver.findElement(By.xpath("//button[contains(text(), 'Click Me!')]"));

            WebElement counter = driver.findElement(By.xpath("//span[contains(@class, 'counter')]"));

            for (int i = 1; i <= 100; i++) {
                clickButton.click();
                String countStr = counter.getText();

                int count = Integer.parseInt(countStr);

                if(count != i){
                    System.out.println("Count Mismatch");
                    break;
                }
                if(i == 100) {
                    System.out.println("Click Counter App: Working as expected");
                }
            }

            driver.quit();

        }catch (Exception e){
            System.out.println("The exception is: "+e);
        }
    }
}
