import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

      public class AddLeads {
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

              String title = driver.getTitle();
              System.out.println("Lead Details: " + title);

              Thread.sleep(2000);
              driver.findElement(By.id("client_name")).sendKeys("Samir");
              Thread.sleep(2000);

              driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[2]/div/div/button/div/div/div")).click();
//        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[2]/div/div/div")).click();
//        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[2]/div/div/div/div[2]")).click();
//            driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[2]/div/div/div/div[2]/ul/li[5]/a")).click();
//            driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[2]/div/div/div/div[2]/ul/li[1]")).click();
              Thread.sleep(2000);
              driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[2]/div/div/div/div[2]/ul/li[2]/a/span[2]")).click();


              driver.findElement(By.id("source_url")).sendKeys("www.google.com");
              System.out.println("www.google.com");

              driver.findElement(By.id("client_email")).sendKeys("sam@gmail.com");

              Thread.sleep(2000);
              driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[5]/div/div/div/button/div/div/div")).click();

//            Thread.sleep(2000);
//            driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[6]/div/div/button/div/div/div")).sendKeys("Aakshtest");

              driver.findElement(By.id("bs-select-7-1")).click();

              Thread.sleep(2000);
              driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[6]/div/div/button/div/div/div")).click();

              Thread.sleep(1000);
              driver.findElement(By.id("bs-select-8-1")).click();

              driver.findElement(By.xpath("//*[@id=\"save-lead-data-form\"]/div/div[1]/div[7]/div/div/button/div/div/div")).click();
              Thread.sleep(2000);
              driver.findElement(By.id("bs-select-9-7")).click();

              driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[8]/div/div/button/div/div/div")).click();
              Thread.sleep(2000);
              driver.findElement(By.id("bs-select-5-2")).click();

              Thread.sleep(2000);
              driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[8]/div/div/button/div/div/div")).click();

              Thread.sleep(2000);
              driver.findElement(By.id("value")).sendKeys("9874");

              Thread.sleep(2000);
              driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[11]/div/div/button/div/div/div")).click();

              Thread.sleep(2000);
              driver.findElement(By.id("bs-select-11-1")).click();

              driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[12]/div/div/button/div/div/div")).click();
              Thread.sleep(2000);
              driver.findElement(By.id("bs-select-12-1")).click();

              driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[13]/div/div/button/div/div/div")).click();
              Thread.sleep(2000);
              driver.findElement(By.id("bs-select-13-5")).click();

              driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[13]/div/div/button/div/div/div")).click();

              driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[14]/div/div[2]/div[1]/p")).sendKeys("My First Scripts.");

              driver.findElement(By.id("save-lead-form")).click();

              //Thread.sleep(3000);

              // driver.quit();


              System.out.println("Done");
          }
      }