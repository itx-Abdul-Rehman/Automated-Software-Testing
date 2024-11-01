import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https:/www.netflix.com");
        String pageTitle=driver.getTitle();
        System.out.println("Page title is:"+pageTitle);
        driver.quit();
    }
}