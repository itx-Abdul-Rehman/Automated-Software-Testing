import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://localhost:5173/login");

        

    }
}