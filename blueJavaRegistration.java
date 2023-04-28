import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class blueJavaRegistration {
    WebDriver driver;

    @Test(priority = 1)
    void openBrowser() {
        System.out.println("open browser...");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }

        @Test(priority = 2)
    void registration(){
        System.out.println("Registration TAsk..");
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Abc");
        driver.findElement(By.id("LastName")).sendKeys("def");
        driver.findElement(By.id("Email")).sendKeys("Abc123@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Abc123*a");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Abc123*a");
        driver.findElement(By.id("register-button")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a")).click();
    }


    void close(){
        System.out.println("close browser...");

    }
}
