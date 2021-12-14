import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KongaWebLoginTest {
    //import the Konga Web Driver
    private WebDriver driver;


    @Test
    public void setup() throws InterruptedException {
        //locate where the chrome driver is
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver_win32/chromedriver.exe");
        //1. open a new driver
        driver = new ChromeDriver();
        //2.input your new Konga page URL (https://www.konga.com)
        driver.get("https://www.konga.com");
        Thread.sleep(5000);
        //3. Maximize the window
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //4. Get the page Tittle

        //5.Click on the sign-in/log in button
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/div/div[4]/a")).click();
        Thread.sleep(5000);

        //6.Input your email address
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("peacecornell1@gmail.com");
        //7. Input your password
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Onyeoma2$");
        //8.Click on the Sign in/login/Continue button
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(5000);

        //9.Logout from the account
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/div/div[4]/div/a/span")).click();

        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/div/div[4]/div/ul/li[7]/a")).click();
        Thread.sleep(5000);

    }

        @AfterTest
        public void closebrowser() {
            //10. Quit the browser.
            driver.quit();

        }



    }

