package firstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;
import java.util.concurrent.TimeUnit;


//Open any URL for given count of times
public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
        final long milliseconds = 1000000;
        String exePath="//Users//avishek//Downloads//chromedriver";
        long startTime = new Date().getTime();
        int viewCount=10;
        for (int i=1; i<viewCount; i++) {
            System.setProperty("webdriver.chrome.driver", exePath);
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.quora.com/Is-it-worth-doing-a-post-graduate-diploma-degree-in-data-analytics-from-IIIT-Bangalore/answer/Avishek-Saha-6");
            driver.quit();
            Thread.sleep(500);
        }
        long endTime = new Date().getTime();
        long minutes = TimeUnit.MILLISECONDS.toMinutes(endTime-startTime);
        System.out.println(viewCount+" view count updated in " + minutes +" minutes");
    }
}
