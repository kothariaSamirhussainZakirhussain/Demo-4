import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddLeadValidation {
    public static void main(String[] args) throws InterruptedException {

        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Addweb\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ttstage.addwebprojects.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("saurabhdhariwal.com@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("addweb123");
        WebElement checkbox = driver.findElement(By.id("checkbox-signup"));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        driver.findElement(By.id("submit-login")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Leads')]")).click();


        WebElement List = driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]/div/a[2]"));
        List.click();
        WebElement Add = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[1]/div[1]/a"));
        Add.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 300)");
        driver.findElement(By.id("save-lead-form")).click();
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#save-lead-data-form > div > div:nth-child(2) > div:nth-child(1) > div > div")));

        WebElement clientErrorElement = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/div"));
        if (clientErrorElement.isDisplayed())
        {
            String clientErrorMessage = clientErrorElement.getText();
            System.out.println("Client Name field validation error message: " + clientErrorMessage);
        }

        WebElement leadErrorElement = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[8]/div/div[2]"));
        if (leadErrorElement.isDisplayed())
        {
            String leadErrorMessage = leadErrorElement.getText();
            System.out.println("Lead Tags Name field validation error message: " + leadErrorMessage);
        }

        WebElement agentErrorElement = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[6]/div/div[2]"));
        if (agentErrorElement.isDisplayed())
        {
            String agentErrorMessage = agentErrorElement.getText();
            System.out.println("Agent Name field validation error message: " + agentErrorMessage);
        }

        WebElement leadTErrorElement = driver.findElement(By.cssSelector("#save-lead-data-form > div > div:nth-child(2) > div:nth-child(4) > div > div"));
        if (leadTErrorElement.isDisplayed())
        {
            String leadTErrorMessage = leadTErrorElement.getText();
            System.out.println("Lead Email Name field validation error message: " + leadTErrorMessage);
        }


    }
}
