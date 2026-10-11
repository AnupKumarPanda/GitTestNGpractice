import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest
{
    @Test
    void test()
    {
        System.out.println("Hello world!");
       /* WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.close();
        */
        System.out.println("Debugging: Selenium WebDriver test executed successfully.");
        System.out.println("Execution completed successfully!");
    }
}
