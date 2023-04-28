import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class blueJava {
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
    void logIn(){
        System.out.println("Login");
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.id("Email")).sendKeys("Abc@gmail.com");
        driver.findElement(By.className("password")).sendKeys("Abc123");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
      //  WebDriverWait wait = new WebDriverWait(driver,20);

       // Thread.sleep(2000);
    }
//    @Test(priority = 3)
  /*  void logOutValidation(){
        String password;
        String password1 = "WeekPassword";
        boolean expectedResult1 = false;

        String password2 = "InvalidPassword123";
        boolean expectedResult2 = false;

        String password3 = "strongPassword123*";
        boolean expectedResult3 = true;

        boolean actualResult1 = logIn(password1);
        boolean actualResult2 = logIn(password2);
        boolean actualResult3 = logIn(password3);

        if(actualResult1 == expectedResult1 &&
        actualResult2 == expectedResult2 &&
        actualResult3 == expectedResult3){
            System.out.println("Login successfully Done.");
        }else {
            System.out.println("Login Unsuccessful.");
        }
        private boolean validatePassword(String password) {
            boolean isValid = false;

            if(password.length() >= 8 && password.matches(".*[a-z].*") && password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[^a-zA-Z0-9].*")) {
                isValid = true;
            }

            return isValid;
        }
    }*/
    @Test(priority = 3)
    void logOut(){
        String ExpectedHomePageTitle = "nopCommerce demo store";
        if(ExpectedHomePageTitle.equals((driver.getTitle()))){
            System.out.println("This Homepage title is correct");
        }else{
            System.out.println("This is wrong Homepage title");
        }
    }

    @Test(priority = 4)
    void close() {
        System.out.println("close browser");
        driver.close();
    }
}
