package web.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseDriver {

    protected static WebDriver driver;

    public void initDriver(){
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
//        try {
//            driver = new ChromeDriver();

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        } catch (WebDriverException wde) {
//            System.out.println(wde.getMessage());
//        }
    }

    public void exitDriver(){
        if (driver != null){
            driver.close();
            driver.quit();
        }
    }
}
