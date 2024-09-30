import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Addweb\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://ttstage.addwebprojects.com/");

        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("saurabhdhariwal.com@gmail.com");

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("addweb123");
        Thread.sleep(2000);
        WebElement checkbox = driver.findElement(By.id("checkbox-signup"));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        driver.findElement(By.id("submit-login")).click();
        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.equals("https://ttstage.addwebprojects.com/login")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");

        }
    }
}
