import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        // Task-1
//        driver.get("https://apkzone.net/");
//        WebElement searchBox=driver.findElement(By.id("sbinput"));
//        searchBox.sendKeys("Among us");


        // Task-2
//        WebElement searchButton=driver.findElement(By.className("sb_submit"));
//        searchButton.click();


        // Task-3
//        WebElement searchBox=driver.findElement(By.name("s"));
//        searchBox.sendKeys("KineMaster");


        // Task-4
//        WebElement copyrightLink=driver.findElement(By.linkText("DMCA"));
//        copyrightLink.click();


        // Task-5
//         WebElement howToDownloadLink=driver.findElement(By.partialLinkText("Download"));
//         howToDownloadLink.click();


        // Task-6
//           driver.get("https://apkzone.net/among-us/");
//           WebElement downloadButton= driver.findElement(By.xpath("//a[@class='buttond downloadAPK']"));
//           System.out.println(downloadButton.getText());
//           downloadButton.click();


        // Task-7
//          WebElement toggleButton=driver.findElement(By.xpath("//div[contains(@id,'light')]"));
//          toggleButton.click();


        // Task-8
//            driver.get("https://apkzone.net/among-us/");
//            WebElement reportElement= driver.findElement(By.xpath("//div[starts-with(@class,'link-')]"));
//            reportElement.click();

        // Task-12
//            driver.get("https://apkzone.net/among-us/");
//            WebElement categoryListElement=driver.findElement(By.xpath("//select[contains(@class,'for')]"));
//            categoryListElement.click();


        // Task-13
//        driver.get("https://apkzone.net/among-us/");
//        List<WebElement> links=driver.findElements(By.tagName("a"));
//        System.out.println("Total Links on this page: "+links.size());


        // Task-9
//        driver.get("https://apkzone.net/among-us/");
//        WebElement element=driver.findElement(By.cssSelector(".lazyloaded"));
//        element.click();


        // Task-10
//        driver.get("https://apkzone.net/among-us/");
//        WebElement element= driver.findElement(By.cssSelector("input[placeholder='App search']"));
//        element.sendKeys("Asphalt 9");



        // Task-11
        driver.get("https://apkzone.net/among-us/");
        WebElement nthElement= driver.findElement(By.cssSelector(".box:nth-child(4)"));
        System.out.println("Nth element text: "+nthElement.getText());

    }
}