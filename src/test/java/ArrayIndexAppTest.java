import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayIndexAppTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qanumberindex.ccbp.tech/");

        WebElement defaultArray = driver.findElement(By.xpath("//p[contains(@class, 'default-array')]"));
        String actualContent = defaultArray.getText();
        String expectedContent = "[ 17, 31, 77, 20, 63 ]";

        if (actualContent.equals(expectedContent)){
            System.out.println("Default Array Matched");
        }else{
            System.out.println("Mismatch in Default Array");
        }

        WebElement input1 = driver.findElement(By.xpath("//input[contains(@class,'user-input')]"));
        input1.sendKeys("48");

        WebElement findButton = driver.findElement(By.xpath("//button[contains(@class,'btn')]"));
        findButton.click();

        WebElement input1Result = driver.findElement(By.xpath("//span[contains(@class,'number')]"));
        String acutualInput1Result = input1Result.getText();
        String expectedInput1Result = "-1";
        if(acutualInput1Result.equals(expectedInput1Result)){
            System.out.println("Index matched for the number 48");
        }else{
            System.out.println("Index mismatched for the number 48");
        }
        input1.clear();

        input1.sendKeys("17");
        findButton.click();
        acutualInput1Result = input1Result.getText();
        expectedInput1Result = "0";
        if(acutualInput1Result.equals(expectedInput1Result)){
            System.out.println("Index matched for the number 17");
        }else{
            System.out.println("Index mismatched for the number 17");
        }
        input1.clear();

        input1.sendKeys("77");
        findButton.click();
        acutualInput1Result = input1Result.getText();
        expectedInput1Result = "2";
        if(acutualInput1Result.equals(expectedInput1Result)){
            System.out.println("Index matched for the number 77");
        }else{
            System.out.println("Index mismatched for the number 77");
        }
        input1.clear();

        input1.sendKeys("63");
        findButton.click();
        acutualInput1Result = input1Result.getText();
        expectedInput1Result = "4";
        if(acutualInput1Result.equals(expectedInput1Result)){
            System.out.println("Index matched for the number 63");
        }else{
            System.out.println("Index mismatched for the number 63");
        }
        driver.quit();



    }
}
