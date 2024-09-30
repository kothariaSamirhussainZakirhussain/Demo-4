import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://ttstage.addwebprojects.com/");
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
        driver.findElement(By.xpath("//span[contains(text(),'Leads')]")).click();

        WebElement List = driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]/div/a[2]"));
        List.click();

       WebElement dropdown =  driver.findElement(By.id("type"));
        Select selectObject = new Select(dropdown);

        /*Thread.sleep(2000);
        selectObject.selectByIndex(0);
        Thread.sleep(2000);
        selectObject.selectByValue("client");
        Thread.sleep(2000);
        selectObject.selectByVisibleText("Lead");*/

        // Get all options from the dropdown

//        List<WebElement> allOptions = selectObject.getOptions();
//        System.out.println(allOptions);

       List<WebElement> allOption = driver.findElements(By.id("type"));


        // Print each option's text to the console
        System.out.println("Options in the dropdown:");
        for (WebElement option : allOption) {
            System.out.println(option.getText());
//            if(option.getText().equalsIgnoreCase("Lead"))
//                option.click();
        }
    }
}
