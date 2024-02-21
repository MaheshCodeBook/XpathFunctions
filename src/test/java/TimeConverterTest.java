import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeConverterTest {
    public static void main(String[] args){
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://qatimeconverter.ccbp.tech/");

            WebElement firstINPUT = driver.findElement(By.xpath("//input[position() = 1]"));
            firstINPUT.sendKeys("2");

            WebElement secondINPUT = driver.findElement(By.xpath("//input[position() = 2]"));
            secondINPUT.sendKeys("30");

            WebElement convertButton = driver.findElement(By.xpath("//button[contains(@id,'convert') ]"));
            convertButton.click();

            WebElement resultInSeconds = driver.findElement(By.xpath("//p[starts-with(@class,'converted') ]"));
            String actualresultInSeconds = resultInSeconds.getText();
            String expectedresultInSeconds = "9000s";
            if(actualresultInSeconds.equals(expectedresultInSeconds)){
                System.out.println("Conversion Successful");
            }else{
                System.out.println("Conversion Failed");
            }

            firstINPUT.clear();
            secondINPUT.clear();
            convertButton.click();
            WebElement withOutInput = driver.findElement(By.xpath("//p[starts-with(@class,'error')]"));
            String actualWithOutInput = withOutInput.getText();
            String expectedWithOutInput = "Please enter a valid number of hours.";
            if(actualWithOutInput.equals(expectedWithOutInput)){
                System.out.println("Expected Error Message Shown");
            }else{
                System.out.println("Unexpected Error Message Shown");
            }

            firstINPUT.sendKeys("1");
            convertButton.click();
            WebElement onlyONEinput = driver.findElement(By.xpath("//p[starts-with(@class,'error')]"));
            String actualonlyONEinput = onlyONEinput.getText();
            String expectedonlyONEinput = "Please enter a valid number of minutes.";
            if(actualonlyONEinput.equals(expectedonlyONEinput)){
                System.out.println("Expected Error Message Shown");
            }else{
                System.out.println("Unexpected Error Message Shown");
            }

            secondINPUT.sendKeys("15");
            convertButton.click();
            actualresultInSeconds = resultInSeconds.getText();
            expectedresultInSeconds = "4500s";
            if(actualresultInSeconds.equals(expectedresultInSeconds)){
                System.out.println("Conversion Successful");
            }else{
                System.out.println("Conversion Failed");
            }
            driver.quit();

        }catch(Exception e){
            System.out.println("The Exception is: "+e);

        }

    }
}
