import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchLeads {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Addweb\\Drivers\\chromedriver.exe");
        // Initializing ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Opening the URL in the browser
        driver.get("https://ttstage.addwebprojects.com/");
        // Maximizing the browser window
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("saurabhdhariwal.com@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("addweb123");
        WebElement checkbox = driver.findElement(By.id("checkbox-signup"));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        driver.findElement(By.id("submit-login")).click();

        Thread.sleep(2000);
//        driver.findElement(By.xpath("//span[@class='ps-3' and text()='Leads']")).click();
        driver.findElement(By.cssSelector("#sideMenuScroll > ul > li:nth-child(2) > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"sideMenuScroll\"]/ul/li[2]/div/a[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#search-text-field")).sendKeys("Riddhi Testing");


        System.out.println("Hello Samir");

    }
}
