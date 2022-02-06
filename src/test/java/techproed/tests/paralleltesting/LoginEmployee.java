package techproed.tests.paralleltesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import techproed.utilities.ConfigurationReader;
import java.time.Duration;
public class LoginEmployee {
    @Test
    public void login(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get(ConfigurationReader.getProperty("gmi_login_url"));
        driver.findElement(By.id("account-menu")).click();
        driver.findElement(By.xpath("(//*[text()='Sign in'])[1]")).click();
        driver.findElement(By.id("username")).sendKeys(ConfigurationReader.getProperty("employee_username"));
        driver.findElement(By.id("password")).sendKeys(ConfigurationReader.getProperty("employee_password"));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.quit();
    }

    /*
    Parallel Testing:
> 1. Do you know parallel testing?
-Yes, i know.
----------
> 2. How do you do parallel testing?
-In my TestNG framework:
    - I create xml files to run tests in parallel using parallel and thread-count
    - Alternatively, we can use data provider to run tests in parallel using parallel
    and data-provider-thread-count
-----------
Note: In cucumber we are going to use special plugin. Cucumber parallel testing is harder than testng.
-----------
> 3. What is thread-count ?
-Thead means the code. It will be same as the number of browser.
-----------
> 4. What is thread-safe ?
-It means synchronized codes. In thead-safe code, we can run multiple code in parallel.
-TestNG is thread-safe. It let us do parallel testing with no issue.
-----------
>5. Why do you do parallel testing?
-To save time
-We normally do not do parallel testing for one test. But when there are multiple test cases,
then parallel testing
saves a lot of time.
-For example, I have a parallel test suite for my smoke test.
-We also have a suite for regression tests to run in parallel.
-I also have some end to end test suite that I can run in parallel.
-I have a few small class that i run in parallel using data provider.
For example, for my login tests, I have multiple credentials
that i use for parallel testing
     */
}